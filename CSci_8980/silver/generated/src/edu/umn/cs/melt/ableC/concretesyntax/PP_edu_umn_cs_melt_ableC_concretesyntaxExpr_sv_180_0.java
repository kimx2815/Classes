
package edu.umn.cs.melt.ableC.concretesyntax;

// top::AddMulLeft_c ::= l::AddMulLeft_c op::AddMulLeftOp_c r::AddMulRight_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0 extends edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c {

	public static final int i_l = 0;
	public static final int i_op = 1;
	public static final int i_r = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c.class,edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeftOp_c.class,edu.umn.cs.melt.ableC.concretesyntax.NAddMulRight_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_l] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c.num_inh_attrs];
	childInheritedAttributes[i_op] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeftOp_c.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAddMulRight_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0(final Object c_l, final Object c_op, final Object c_r, final Object a_core_location) {
		super(a_core_location);
		this.child_l = c_l;
		this.child_op = c_op;
		this.child_r = c_r;

	}

	private Object child_l;
	public final edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c getChild_l() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c) (child_l = common.Util.demand(child_l));
	}

	private Object child_op;
	public final edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeftOp_c getChild_op() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeftOp_c) (child_op = common.Util.demand(child_op));
	}

	private Object child_r;
	public final edu.umn.cs.melt.ableC.concretesyntax.NAddMulRight_c getChild_r() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NAddMulRight_c) (child_r = common.Util.demand(child_r));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();
			case i_op: return getChild_op();
			case i_r: return getChild_r();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;
			case i_op: return child_op;
			case i_r: return child_r;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = op.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulLeft_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.i_op).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulLeftOp_c)); } };
		// op.leftExpr = l.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.i_op][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_leftExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulLeftOp_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.i_l).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulLeft_c)); } };
		// op.rightExpr = r.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.i_op][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_rightExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulLeftOp_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.i_r).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulRight_c)); } };
		// op.exprLocation = top.location
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0.i_op][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_exprLocation__ON__edu_umn_cs_melt_ableC_concretesyntax_AddMulLeftOp_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.NAddMulLeft_c)context.undecorate()).getAnno_core_location()); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxExpr_sv_180_0(children[0], children[1], children[2], annotations[0]);
		}
	};

}
