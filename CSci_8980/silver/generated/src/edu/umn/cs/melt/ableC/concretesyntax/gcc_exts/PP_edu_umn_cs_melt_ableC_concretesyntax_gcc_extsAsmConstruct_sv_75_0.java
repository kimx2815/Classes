
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::AsmOperand_c ::= '[' Identifier_t ']' StringLiteral_t '(' Expr_c ')' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0 extends edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAsmOperand_c {

	public static final int i__G_6 = 0;
	public static final int i__G_5 = 1;
	public static final int i__G_4 = 2;
	public static final int i__G_3 = 3;
	public static final int i__G_2 = 4;
	public static final int i__G_1 = 5;
	public static final int i__G_0 = 6;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,common.TerminalRecord.class,common.TerminalRecord.class,common.TerminalRecord.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NExpr_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAsmOperand_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAsmOperand_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[7][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i__G_1] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NExpr_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0(final Object c__G_6, final Object c__G_5, final Object c__G_4, final Object c__G_3, final Object c__G_2, final Object c__G_1, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_6 = c__G_6;
		this.child__G_5 = c__G_5;
		this.child__G_4 = c__G_4;
		this.child__G_3 = c__G_3;
		this.child__G_2 = c__G_2;
		this.child__G_1 = c__G_1;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_6;
	public final common.TerminalRecord getChild__G_6() {
		return (common.TerminalRecord) (child__G_6 = common.Util.demand(child__G_6));
	}

	private Object child__G_5;
	public final common.TerminalRecord getChild__G_5() {
		return (common.TerminalRecord) (child__G_5 = common.Util.demand(child__G_5));
	}

	private Object child__G_4;
	public final common.TerminalRecord getChild__G_4() {
		return (common.TerminalRecord) (child__G_4 = common.Util.demand(child__G_4));
	}

	private Object child__G_3;
	public final common.TerminalRecord getChild__G_3() {
		return (common.TerminalRecord) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child__G_2;
	public final common.TerminalRecord getChild__G_2() {
		return (common.TerminalRecord) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child__G_1;
	public final edu.umn.cs.melt.ableC.concretesyntax.NExpr_c getChild__G_1() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NExpr_c) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_6: return getChild__G_6();
			case i__G_5: return getChild__G_5();
			case i__G_4: return getChild__G_4();
			case i__G_3: return getChild__G_3();
			case i__G_2: return getChild__G_2();
			case i__G_1: return getChild__G_1();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_6: return child__G_6;
			case i__G_5: return child__G_5;
			case i__G_4: return child__G_4;
			case i__G_3: return child__G_3;
			case i__G_2: return child__G_2;
			case i__G_1: return child__G_1;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 7;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0";
	}

	static void initProductionAttributeDefinitions() {

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsAsmConstruct_sv_75_0(children[0], children[1], children[2], children[3], children[4], children[5], children[6], annotations[0]);
		}
	};

}
