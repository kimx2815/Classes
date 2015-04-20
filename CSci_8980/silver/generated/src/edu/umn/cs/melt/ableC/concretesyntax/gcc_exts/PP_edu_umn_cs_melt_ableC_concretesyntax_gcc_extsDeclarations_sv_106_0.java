
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::InitialFunctionDefinition_c ::= ds::DeclarationSpecifiers_c d::Declarator_c aa::Attributes_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0 extends edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c {

	public static final int i_ds = 0;
	public static final int i_d = 1;
	public static final int i_aa = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c.class,edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c.class,edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ds] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c.num_inh_attrs];
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c.num_inh_attrs];
	childInheritedAttributes[i_aa] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0(final Object c_ds, final Object c_d, final Object c_aa, final Object a_core_location) {
		super(a_core_location);
		this.child_ds = c_ds;
		this.child_d = c_d;
		this.child_aa = c_aa;

	}

	private Object child_ds;
	public final edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c getChild_ds() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c) (child_ds = common.Util.demand(child_ds));
	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c getChild_d() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c) (child_d = common.Util.demand(child_d));
	}

	private Object child_aa;
	public final edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c getChild_aa() {
		return (edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c) (child_aa = common.Util.demand(child_aa));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_ds: return getChild_ds();
			case i_d: return getChild_d();
			case i_aa: return getChild_aa();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_ds: return child_ds;
			case i_d: return child_d;
			case i_aa: return child_aa;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0";
	}

	static void initProductionAttributeDefinitions() {
		// ds.givenQualifiers = ds.typeQualifiers
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c)); } };
		// d.givenType = ast:baseTypeExpr(,)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_d][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenType__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PbaseTypeExpr()); } };
		// bt = ast:figureOutTypeFromSpecifiers(ds.location, ds.typeQualifiers, ds.preTypeSpecifiers, ds.realTypeSpecifiers, ds.mutateTypeSpecifiers,)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.localAttributes[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.bt__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds).undecorate()).getAnno_core_location()); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_preTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_realTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_mutateTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c))); } };
		// top.ast = ast:functionDecl(ds.storageClass, ds.specialSpecifiers, bt, d.ast, d.declaredIdent, ast:foldDecl([],), top.givenStmt,)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitialFunctionDefinition_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl)new edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_storageClass__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_ds, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_specialSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_DeclarationSpecifiers_c), common.Thunk.transformUndecorate(context.localDecoratedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.bt__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0)), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_d, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0.i_d, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredIdent__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDecls)edu.umn.cs.melt.ableC.abstractsyntax.PfoldDecl.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }, context.contextInheritedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenStmt__ON__edu_umn_cs_melt_ableC_concretesyntax_InitialFunctionDefinition_c))); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_106_0(children[0], children[1], children[2], annotations[0]);
		}
	};

}
