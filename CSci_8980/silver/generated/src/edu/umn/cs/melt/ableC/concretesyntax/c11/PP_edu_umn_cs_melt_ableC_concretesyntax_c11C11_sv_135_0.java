
package edu.umn.cs.melt.ableC.concretesyntax.c11;

// top::StaticAssertDeclaration_c ::= '_Static_assert' '(' e::ConstantExpr_c ',' s::StringConstant_c ')' ';' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0 extends edu.umn.cs.melt.ableC.concretesyntax.c11.NStaticAssertDeclaration_c {

	public static final int i__G_6 = 0;
	public static final int i__G_5 = 1;
	public static final int i_e = 2;
	public static final int i__G_3 = 3;
	public static final int i_s = 4;
	public static final int i__G_1 = 5;
	public static final int i__G_0 = 6;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NStringConstant_c.class,common.TerminalRecord.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.c11.NStaticAssertDeclaration_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.c11.NStaticAssertDeclaration_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[7][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c.num_inh_attrs];
	childInheritedAttributes[i_s] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NStringConstant_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0(final Object c__G_6, final Object c__G_5, final Object c_e, final Object c__G_3, final Object c_s, final Object c__G_1, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_6 = c__G_6;
		this.child__G_5 = c__G_5;
		this.child_e = c_e;
		this.child__G_3 = c__G_3;
		this.child_s = c_s;
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

	private Object child_e;
	public final edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c getChild_e() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NConstantExpr_c) (child_e = common.Util.demand(child_e));
	}

	private Object child__G_3;
	public final common.TerminalRecord getChild__G_3() {
		return (common.TerminalRecord) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_s;
	public final edu.umn.cs.melt.ableC.concretesyntax.NStringConstant_c getChild_s() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NStringConstant_c) (child_s = common.Util.demand(child_s));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
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
			case i_e: return getChild_e();
			case i__G_3: return getChild__G_3();
			case i_s: return getChild_s();
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
			case i_e: return child_e;
			case i__G_3: return child__G_3;
			case i_s: return child_s;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:c11:P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:c11:P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = [ ast:staticAssertDecl(e.ast, s.ast,) ]
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_StaticAssertDeclaration_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDecl)new edu.umn.cs.melt.ableC.abstractsyntax.c11.PstaticAssertDecl(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0.i_e, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_ConstantExpr_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0.i_s, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_StringConstant_c))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0(children[0], children[1], children[2], children[3], children[4], children[5], children[6], annotations[0]);
		}
	};

}
