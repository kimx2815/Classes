
package edu.umn.cs.melt.ableC.concretesyntax;

// top::InitializerList_c ::= il::InitializerList_c ',' i::Initializer_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0 extends edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c {

	public static final int i_il = 0;
	public static final int i__G_1 = 1;
	public static final int i_i = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_il] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c.num_inh_attrs];
	childInheritedAttributes[i_i] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0(final Object c_il, final Object c__G_1, final Object c_i, final Object a_core_location) {
		super(a_core_location);
		this.child_il = c_il;
		this.child__G_1 = c__G_1;
		this.child_i = c_i;

	}

	private Object child_il;
	public final edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c getChild_il() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NInitializerList_c) (child_il = common.Util.demand(child_il));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child_i;
	public final edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c getChild_i() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NInitializer_c) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_il: return getChild_il();
			case i__G_1: return getChild__G_1();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_il: return child_il;
			case i__G_1: return child__G_1;
			case i_i: return child_i;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = il.ast ++ [ ast:init(i.ast,) ]
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitializerList_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0.i_il, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitializerList_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NInit)new edu.umn.cs.melt.ableC.abstractsyntax.Pinit(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0.i_i, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Initializer_c))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_352_0(children[0], children[1], children[2], annotations[0]);
		}
	};

}
