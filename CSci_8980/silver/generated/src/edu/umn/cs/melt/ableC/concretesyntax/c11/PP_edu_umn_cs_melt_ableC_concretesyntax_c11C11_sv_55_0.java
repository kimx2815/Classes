
package edu.umn.cs.melt.ableC.concretesyntax.c11;

// top::PrimaryExpr_c ::= g::GenericSelection_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0 extends edu.umn.cs.melt.ableC.concretesyntax.NPrimaryExpr_c {

	public static final int i_g = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NPrimaryExpr_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NPrimaryExpr_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_g] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0(final Object c_g, final Object a_core_location) {
		super(a_core_location);
		this.child_g = c_g;

	}

	private Object child_g;
	public final edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c getChild_g() {
		return (edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c) (child_g = common.Util.demand(child_g));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_g: return getChild_g();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_g: return child_g;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:c11:P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:c11:P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = g.ast
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_PrimaryExpr_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0.i_g).synthesized(edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericSelection_c)); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0(children[0], annotations[0]);
		}
	};

}
