grammar edu:umn:cs:melt:ableC:concretesyntax:c11;

imports edu:umn:cs:melt:ableC:concretesyntax;
imports edu:umn:cs:melt:ableC:abstractsyntax as ast;
imports silver:langutil;

-- Alignas
terminal C11_AlignAs_t '_Alignas' lexer classes {Ckeyword};

concrete productions top::DeclarationSpecifiers_c
| h::AlignmentSpecifier_c  t::DeclarationSpecifiers_c
    { top.isTypedef = t.isTypedef;
      top.storageClass = t.storageClass;
      top.preTypeSpecifiers = t.preTypeSpecifiers;
      top.realTypeSpecifiers = t.realTypeSpecifiers;
      top.typeQualifiers = t.typeQualifiers;
      top.specialSpecifiers = t.specialSpecifiers;
      top.mutateTypeSpecifiers = t.mutateTypeSpecifiers; }
| h::AlignmentSpecifier_c
    { top.isTypedef = false;
      top.storageClass = [];
      top.preTypeSpecifiers = [];
      top.realTypeSpecifiers = [];
      top.typeQualifiers = [];
      top.specialSpecifiers = [];
      top.mutateTypeSpecifiers = []; }

-- TODO: need to figure this bit out, somehow. very similar to function specifiers.
-- maybe we can unify those somehow. "SpecialSpecifiers" instead of FnQualifers in the
-- abstract syntax, perhaps.

closed nonterminal AlignmentSpecifier_c with location, specialSpecifiers;
concrete productions top::AlignmentSpecifier_c
| '_Alignas' '(' t::TypeName_c ')' -- equivalent to _Alignas( _Alignof( tn ) )
    { top.specialSpecifiers = 
        [ast:alignasSpecifier(
          ast:unaryExprOrTypeTraitExpr(
            ast:alignofOp(location=$1.location),
            ast:typeNameExpr(t.ast),
            location=top.location))]; }
| '_Alignas' '(' e::ConstantExpr_c ')'
    { top.specialSpecifiers = [ast:alignasSpecifier(e.ast)]; }

-- Noreturn
terminal C11_Noreturn_t '_Noreturn' lexer classes {Ckeyword};

concrete productions top::FunctionSpecifier_c
| '_Noreturn'
    { top.specialSpecifiers = [ast:noreturnQualifier()]; }

-- Generic
terminal C11_Generic_t '_Generic' lexer classes {Ckeyword};

concrete productions top::PrimaryExpr_c
| g::GenericSelection_c
    { top.ast = g.ast; }

closed nonterminal GenericSelection_c with location, ast<ast:Expr>;
concrete productions top::GenericSelection_c
| '_Generic' '(' e::AssignExpr_c ',' l::GenericAssocList_c ')'
    { top.ast = 
        case l.defaultExpr of
        | [] -> ast:genericSelectionExpr(e.ast, ast:foldGenericAssoc(l.ast), ast:nothingExpr(), location=top.location)
        | de :: [] -> ast:genericSelectionExpr(e.ast, ast:foldGenericAssoc(l.ast), ast:justExpr(de), location=top.location)
        | de1 :: de2 :: _ -> ast:genericSelectionExpr(e.ast, ast:foldGenericAssoc(l.ast), 
            ast:justExpr(ast:errorExpr([err(de1.location, "Multiple default associations in generic selection expression")], location=top.location)), location=top.location)
        end;
    }

synthesized attribute defaultExpr :: [ast:Expr];

closed nonterminal GenericAssocList_c with location, ast<[ast:GenericAssoc]>, defaultExpr;
concrete productions top::GenericAssocList_c
| h::GenericAssoc_c
    { top.ast = h.ast; 
      top.defaultExpr = h.defaultExpr; }
| h::GenericAssocList_c ',' t::GenericAssoc_c
    { top.ast = h.ast ++ t.ast;
      top.defaultExpr = h.defaultExpr ++ t.defaultExpr; }

closed nonterminal GenericAssoc_c with location, ast<[ast:GenericAssoc]>, defaultExpr;
concrete productions top::GenericAssoc_c
| ty::TypeName_c ':' e::AssignExpr_c
    { top.ast = [ast:genericAssoc(ty.ast, e.ast, location=top.location)];
      top.defaultExpr = []; }
| 'default' ':' e::AssignExpr_c
    { top.ast = [];
      top.defaultExpr = [e.ast]; }


-- Atomic
terminal C11_Atomic_t '_Atomic' lexer classes {Ckeyword};

-- Whenever _Atomic is immediately followed by '(', it's a TypeSpecifier,
-- instead of a TypeQualifier. We accomplish this by recognizing '(' as
-- a different terminal in that parsing context.
terminal C11_Atomic_LParen_t /\(/;
disambiguate C11_Atomic_LParen_t, LParen_t
{ pluck C11_Atomic_LParen_t; }

-- One could imagine an alternative solution involving terminal precedence,
-- but that would require the original '(' to have a precedence!

concrete productions top::TypeSpecifier_c
| '_Atomic' C11_Atomic_LParen_t  t::TypeName_c ')'
    { top.realTypeSpecifiers = [ast:atomicTypeExpr(top.givenQualifiers, t.ast)];
      top.preTypeSpecifiers = []; }

concrete productions top::TypeQualifier_c
| '_Atomic'
    { top.typeQualifiers = [];
      top.mutateTypeSpecifiers = [ast:modifyTypeSpecifier(atomicMutator)]; }

function atomicMutator -- TODO MOVE
ast:BaseTypeExpr ::= q::[ast:Qualifier] bt::ast:BaseTypeExpr
{
  return ast:atomicTypeExpr(q, ast:typeName(bt, ast:baseTypeExpr()));
}


-- Thread_local
terminal C11_Thread_local_t '_Thread_local' lexer classes {Ckeyword};

concrete productions top::StorageClassSpecifier_c
| '_Thread_local'
    { top.isTypedef = false;
      top.storageClass = [ast:threadLocalStorageClass()]; } -- Storage class MODIFIER of some sort. only with 'static' or 'extern'.


-- Static assert
terminal C11_Static_assert_t '_Static_assert' lexer classes {Ckeyword};

closed nonterminal StaticAssertDeclaration_c with location, ast<[ast:Decl]>;
concrete productions top::StaticAssertDeclaration_c
| '_Static_assert' '(' e::ConstantExpr_c ',' s::StringConstant_c ')' ';'
    { top.ast = [ast:staticAssertDecl(e.ast, s.ast)]; }

concrete productions top::Declaration_c
| s::StaticAssertDeclaration_c
    { top.ast = s.ast; }


-- _Alignof
terminal C11_Alignof_t '_Alignof' lexer classes {Ckeyword};

concrete productions top::UnaryExpr_c
| '_Alignof' '(' t::TypeName_c ')'
    { top.ast = ast:unaryExprOrTypeTraitExpr(ast:alignofOp(location=$1.location), ast:typeNameExpr(t.ast), location=top.location); }



