
package edu.umn.cs.melt.ableC.concretesyntax;

// top::LabeledStmt_c ::= 'case' ce::ConstantExpr_c ':' s::Stmt_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0 extends edu.umn.cs.melt.ableC.concretesyntax.NLabeledStmt_c {

	public static final int i__G_3 = 0;
	public static final int i_ce = 1;
	public static final int i__G_1 = 2;
	public static final int i_s = 3;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NStmt_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NLabeledStmt_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NLabeledStmt_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ce] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c.num_inh_attrs];
	childInheritedAttributes[i_s] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NStmt_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0(final Object c__G_3, final Object c_ce, final Object c__G_1, final Object c_s, final Object a_core_location) {
		super(a_core_location);
		this.child__G_3 = c__G_3;
		this.child_ce = c_ce;
		this.child__G_1 = c__G_1;
		this.child_s = c_s;

	}

	private Object child__G_3;
	public final common.TerminalRecord getChild__G_3() {
		return (common.TerminalRecord) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_ce;
	public final edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c getChild_ce() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c) (child_ce = common.Util.demand(child_ce));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child_s;
	public final edu.umn.cs.melt.ableC.concretesyntax.NStmt_c getChild_s() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NStmt_c) (child_s = common.Util.demand(child_s));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_3: return getChild__G_3();
			case i_ce: return getChild_ce();
			case i__G_1: return getChild__G_1();
			case i_s: return getChild_s();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_3: return child__G_3;
			case i_ce: return child_ce;
			case i__G_1: return child__G_1;
			case i_s: return child_s;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = ast:caseLabelStmt(ce.ast, s.ast,)
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_LabeledStmt_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NStmt)new edu.umn.cs.melt.ableC.abstractsyntax.PcaseLabelStmt(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0.i_ce, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_ConstantExpr_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0.i_s, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Stmt_c))); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_51_0(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}
