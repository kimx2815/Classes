
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::TypeSpecifier_c ::= t::TypeofStarter_c '(' ts::TypeName_c ')' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0 extends edu.umn.cs.melt.ableC.concretesyntax.NTypeSpecifier_c {

	public static final int i_t = 0;
	public static final int i__G_2 = 1;
	public static final int i_ts = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NTypeofStarter_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeSpecifier_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeSpecifier_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NTypeofStarter_c.num_inh_attrs];
	childInheritedAttributes[i_ts] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0(final Object c_t, final Object c__G_2, final Object c_ts, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child_t = c_t;
		this.child__G_2 = c__G_2;
		this.child_ts = c_ts;
		this.child__G_0 = c__G_0;

	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NTypeofStarter_c getChild_t() {
		return (edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NTypeofStarter_c) (child_t = common.Util.demand(child_t));
	}

	private Object child__G_2;
	public final common.TerminalRecord getChild__G_2() {
		return (common.TerminalRecord) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_ts;
	public final edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c getChild_ts() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NTypeName_c) (child_ts = common.Util.demand(child_ts));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_t: return getChild_t();
			case i__G_2: return getChild__G_2();
			case i_ts: return getChild_ts();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_t: return child_t;
			case i__G_2: return child__G_2;
			case i_ts: return child_ts;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.preTypeSpecifiers = []
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_preTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeSpecifier_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.realTypeSpecifiers = [ ast:typeofTypeExpr(top.givenQualifiers, ast:typeNameExpr(ts.ast,),) ]
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_realTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeSpecifier_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr(context.contextInheritedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeSpecifier_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName)new edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0.i_ts, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeName_c))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_59_0(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}
