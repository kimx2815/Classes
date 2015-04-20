
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BinOp ::= op::AssignOp 
public final class PassignOp extends edu.umn.cs.melt.ableC.abstractsyntax.NBinOp {

	public static final int i_op = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NAssignOp.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_assignOp;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBinOp.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBinOp.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_op] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NAssignOp.num_inh_attrs];

	}

	public PassignOp(final Object c_op, final Object a_core_location) {
		super(a_core_location);
		this.child_op = c_op;

	}

	private Object child_op;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NAssignOp getChild_op() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NAssignOp) (child_op = common.Util.demand(child_op));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_op: return getChild_op();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_op: return child_op;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:assignOp erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:assignOp";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = op.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PassignOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BinOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PassignOp.i_op).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_AssignOp)); } };

	}

	public static final common.NodeFactory<PassignOp> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PassignOp> {

		@Override
		public PassignOp invoke(final Object[] children, final Object[] annotations) {
			return new PassignOp(children[0], annotations[0]);
		}
	};

}
