
package edu.umn.cs.melt.ableC.concretesyntax;

// top::Declaration_c ::= ds::DeclarationSpecifiers_c idcl::InitDeclaratorList_c ';' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0 extends edu.umn.cs.melt.ableC.concretesyntax.NDeclaration_c {

	public static final int i_ds = 0;
	public static final int i_idcl = 1;
	public static final int i__G_0 = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c.class,edu.umn.cs.melt.ableC.concretesyntax.NInitDeclaratorList_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDeclaration_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDeclaration_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ds] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c.num_inh_attrs];
	childInheritedAttributes[i_idcl] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitDeclaratorList_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0(final Object c_ds, final Object c_idcl, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child_ds = c_ds;
		this.child_idcl = c_idcl;
		this.child__G_0 = c__G_0;

	}

	private Object child_ds;
	public final edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c getChild_ds() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c) (child_ds = common.Util.demand(child_ds));
	}

	private Object child_idcl;
	public final edu.umn.cs.melt.ableC.concretesyntax.NInitDeclaratorList_c getChild_idcl() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NInitDeclaratorList_c) (child_idcl = common.Util.demand(child_idcl));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_ds: return getChild_ds();
			case i_idcl: return getChild_idcl();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_ds: return child_ds;
			case i_idcl: return child_idcl;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 3;
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
	}

	@Override
	public common.Lazy[] getLocalInheritedAttributes(final int key) {
		return localInheritedAttributes[key];
	}

	@Override
	public common.Lazy[] getChildInheritedAttributes(final int key) {
		return childInheritedAttributes[key];
	}

	@Override
	public boolean hasForward() {
		return false;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0 erroneously claimed to forward");
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
	}

	@Override
	public common.Lazy getLocal(final int key) {
		return localAttributes[key];
	}

	@Override
	public final int getNumberOfLocalAttrs() {
		return num_local_attrs;
	}

	@Override
	public final String getNameOfLocalAttr(final int index) {
		return occurs_local[index];
	}

	@Override
	public String getName() {
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0";
	}

	static void initProductionAttributeDefinitions() {
		// ds.givenQualifiers = ds.typeQualifiers
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c)); } };
		// bt = ast:figureOutTypeFromSpecifiers(ds.location, ds.typeQualifiers, ds.preTypeSpecifiers, ds.realTypeSpecifiers, ds.mutateTypeSpecifiers,)
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.localAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.bt__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds).undecorate()).getAnno_core_location()); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_preTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_realTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_mutateTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c))); } };
		// dcls = ast:foldDeclarator(idcl.ast,)
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.localAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.dcls__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDeclarators)edu.umn.cs.melt.ableC.abstractsyntax.PfoldDeclarator.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_idcl, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitDeclaratorList_c))); } };
		// top.ast = (if ds.isTypedef && ! null(ds.storageClass,) then [ ast:errorDecl([ err(ds.location, "Typedef declaration also claims another storage class",) ],) ] else []) ++ if ds.isTypedef then [ ast:typedefDecls(bt, dcls,) ] else [ ast:variableDecls(ds.storageClass, bt, dcls,) ]
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Declaration_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((((Boolean)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_isTypedef__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c)) && (!((Boolean)core.Pnull.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_storageClass__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c))))) ? ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDecl)new edu.umn.cs.melt.ableC.abstractsyntax.PerrorDecl(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds).undecorate()).getAnno_core_location()); } }, (new common.StringCatter("Typedef declaration also claims another storage class")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })) : ((common.ConsCell)core.Pnil.invoke())); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_isTypedef__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c)) ? ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDecl)new edu.umn.cs.melt.ableC.abstractsyntax.PtypedefDecls(common.Thunk.transformUndecorate(context.localDecoratedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.bt__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0)), common.Thunk.transformUndecorate(context.localDecoratedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.dcls__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })) : ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDecl)new edu.umn.cs.melt.ableC.abstractsyntax.PvariableDecls(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_storageClass__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), common.Thunk.transformUndecorate(context.localDecoratedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.bt__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0)), common.Thunk.transformUndecorate(context.localDecoratedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.dcls__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0)))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } }))); } })); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_42_0(children[0], children[1], children[2], annotations[0]);
		}
	};

}
