
package edu.umn.cs.melt.ableC.concretesyntax;

// top::Stmt_c ::= is::IterationStmt_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0 extends edu.umn.cs.melt.ableC.concretesyntax.NStmt_c {

	public static final int i_is = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NIterationStmt_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NStmt_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NStmt_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_is] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NIterationStmt_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0(final Object c_is, final Object a_core_location) {
		super(a_core_location);
		this.child_is = c_is;

	}

	private Object child_is;
	public final edu.umn.cs.melt.ableC.concretesyntax.NIterationStmt_c getChild_is() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NIterationStmt_c) (child_is = common.Util.demand(child_is));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_is: return getChild_is();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_is: return child_is;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = is.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Stmt_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NStmt)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0.i_is).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_IterationStmt_c)); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxStmt_sv_41_0(children[0], annotations[0]);
		}
	};

}
