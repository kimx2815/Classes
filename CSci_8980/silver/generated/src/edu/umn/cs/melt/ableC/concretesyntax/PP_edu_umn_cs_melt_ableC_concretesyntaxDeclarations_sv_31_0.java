
package edu.umn.cs.melt.ableC.concretesyntax;

// top::FunctionDefinition_c ::= d::InitialFunctionDefinition_c s::CompoundStatement_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0 extends edu.umn.cs.melt.ableC.concretesyntax.NFunctionDefinition_c {

	public static final int i_d = 0;
	public static final int i_s = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c.class,edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NFunctionDefinition_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NFunctionDefinition_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c.num_inh_attrs];
	childInheritedAttributes[i_s] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0(final Object c_d, final Object c_s, final Object a_core_location) {
		super(a_core_location);
		this.child_d = c_d;
		this.child_s = c_s;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c getChild_d() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NInitialFunctionDefinition_c) (child_d = common.Util.demand(child_d));
	}

	private Object child_s;
	public final edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c getChild_s() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c) (child_s = common.Util.demand(child_s));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();
			case i_s: return getChild_s();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;
			case i_s: return child_s;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = d.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_FunctionDefinition_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0.i_d).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitialFunctionDefinition_c)); } };
		// d.givenStmt = s.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0.i_d][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenStmt__ON__edu_umn_cs_melt_ableC_concretesyntax_InitialFunctionDefinition_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NStmt)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0.i_s).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_CompoundStatement_c)); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_31_0(children[0], children[1], annotations[0]);
		}
	};

}
