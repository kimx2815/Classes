
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::MemberDesignator_c ::= d::MemberDesignator_c '[' e::ConstantExpr_c ']' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0 extends edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c {

	public static final int i_d = 0;
	public static final int i__G_2 = 1;
	public static final int i_e = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0(final Object c_d, final Object c__G_2, final Object c_e, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child_d = c_d;
		this.child__G_2 = c__G_2;
		this.child_e = c_e;
		this.child__G_0 = c__G_0;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c getChild_d() {
		return (edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NMemberDesignator_c) (child_d = common.Util.demand(child_d));
	}

	private Object child__G_2;
	public final common.TerminalRecord getChild__G_2() {
		return (common.TerminalRecord) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c getChild_e() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c) (child_e = common.Util.demand(child_e));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();
			case i__G_2: return getChild__G_2();
			case i_e: return getChild_e();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;
			case i__G_2: return child__G_2;
			case i_e: return child_e;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = ast:arrayMemberDesignator(d.ast, e.ast,)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_MemberDesignator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator)new edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0.i_d, edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_MemberDesignator_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0.i_e, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_ConstantExpr_c))); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_49_0(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}
