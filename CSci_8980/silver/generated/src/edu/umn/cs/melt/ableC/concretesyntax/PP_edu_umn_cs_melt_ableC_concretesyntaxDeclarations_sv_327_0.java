
package edu.umn.cs.melt.ableC.concretesyntax;

// top::DirectAbstractDeclarator_c ::= dd::DirectAbstractDeclarator_c '(' ptl::ParameterTypeList_c ')' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0 extends edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c {

	public static final int i_dd = 0;
	public static final int i__G_2 = 1;
	public static final int i_ptl = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NParameterTypeList_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_dd] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c.num_inh_attrs];
	childInheritedAttributes[i_ptl] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NParameterTypeList_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0(final Object c_dd, final Object c__G_2, final Object c_ptl, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child_dd = c_dd;
		this.child__G_2 = c__G_2;
		this.child_ptl = c_ptl;
		this.child__G_0 = c__G_0;

	}

	private Object child_dd;
	public final edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c getChild_dd() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NDirectAbstractDeclarator_c) (child_dd = common.Util.demand(child_dd));
	}

	private Object child__G_2;
	public final common.TerminalRecord getChild__G_2() {
		return (common.TerminalRecord) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_ptl;
	public final edu.umn.cs.melt.ableC.concretesyntax.NParameterTypeList_c getChild_ptl() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NParameterTypeList_c) (child_ptl = common.Util.demand(child_ptl));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_dd: return getChild_dd();
			case i__G_2: return getChild__G_2();
			case i_ptl: return getChild_ptl();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_dd: return child_dd;
			case i__G_2: return child__G_2;
			case i_ptl: return child_ptl;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0";
	}

	static void initProductionAttributeDefinitions() {
		// dd.givenType = ast:functionTypeExprWithArgs(top.givenType, ast:foldParameterDecl(ptl.ast,), ptl.isVariadic,)
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0.i_dd][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenType__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectAbstractDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs(context.contextInheritedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenType__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectAbstractDeclarator_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)edu.umn.cs.melt.ableC.abstractsyntax.PfoldParameterDecl.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0.i_ptl, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_ParameterTypeList_c))); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0.i_ptl, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_isVariadic__ON__edu_umn_cs_melt_ableC_concretesyntax_ParameterTypeList_c))); } };
		// top.ast = dd.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectAbstractDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0.i_dd).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectAbstractDeclarator_c)); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_327_0(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}
