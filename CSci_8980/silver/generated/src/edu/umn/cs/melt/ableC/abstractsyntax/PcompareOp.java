
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BinOp ::= op::CompareOp 
public final class PcompareOp extends edu.umn.cs.melt.ableC.abstractsyntax.NBinOp {

	public static final int i_op = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NCompareOp.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_compareOp;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBinOp.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBinOp.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_op] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NCompareOp.num_inh_attrs];

	}

	public PcompareOp(final Object c_op, final Object a_core_location) {
		super(a_core_location);
		this.child_op = c_op;

	}

	private Object child_op;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NCompareOp getChild_op() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NCompareOp) (child_op = common.Util.demand(child_op));
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:compareOp erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:compareOp";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = op.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PcompareOp.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BinOp] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PcompareOp.i_op).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_CompareOp)); } };

	}

	public static final common.NodeFactory<PcompareOp> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PcompareOp> {

		@Override
		public PcompareOp invoke(final Object[] children, final Object[] annotations) {
			return new PcompareOp(children[0], annotations[0]);
		}
	};

}
