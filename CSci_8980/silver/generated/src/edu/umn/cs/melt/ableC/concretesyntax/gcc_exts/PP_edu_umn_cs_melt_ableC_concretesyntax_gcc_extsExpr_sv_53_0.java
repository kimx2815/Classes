
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::Initializer_c ::= '{' '}' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0 extends edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c {

	public static final int i__G_1 = 0;
	public static final int i__G_0 = 1;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0(final Object c__G_1, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_1 = c__G_1;
		this.child__G_0 = c__G_0;

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
			case i__G_1: return getChild__G_1();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_1: return child__G_1;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = ast:objectInitializer(ast:nilInit(,),)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Initializer_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NInitializer)new edu.umn.cs.melt.ableC.abstractsyntax.PobjectInitializer(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NInitList)new edu.umn.cs.melt.ableC.abstractsyntax.PnilInit()); } })); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsExpr_sv_53_0(children[0], children[1], annotations[0]);
		}
	};

}
