
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::Type ::= q::[Qualifier] sub::TagType 
public final class PtagType extends edu.umn.cs.melt.ableC.abstractsyntax.NType {

	public static final int i_q = 0;
	public static final int i_sub = 1;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NTagType.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_tagType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_sub] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTagType.num_inh_attrs];

	}

	public PtagType(final Object c_q, final Object c_sub) {
		super();
		this.child_q = c_q;
		this.child_sub = c_sub;

	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_sub;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTagType getChild_sub() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTagType) (child_sub = common.Util.demand(child_sub));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_q: return getChild_q();
			case i_sub: return getChild_sub();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_q: return child_q;
			case i_sub: return child_sub;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:tagType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:tagType";
	}

	static void initProductionAttributeDefinitions() {
		// top.lpp = concat([ terminate(space(,), map((.pp), q,),), sub.pp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PtagType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Qualifier), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagType.i_q))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagType.i_sub, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TagType), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };
		// top.rpp = notext(,)
		edu.umn.cs.melt.ableC.abstractsyntax.PtagType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pnotext()); } };

	}

	public static final common.NodeFactory<PtagType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtagType> {

		@Override
		public PtagType invoke(final Object[] children, final Object[] annotations) {
			return new PtagType(children[0], children[1]);
		}
	};

}
