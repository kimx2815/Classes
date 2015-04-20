
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::NoncanonicalType ::= q::[Qualifier] name::String resolved::Type 
public final class PtypedefType extends edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType {

	public static final int i_q = 0;
	public static final int i_name = 1;
	public static final int i_resolved = 2;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,common.StringCatter.class,edu.umn.cs.melt.ableC.abstractsyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_typedefType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_resolved] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NType.num_inh_attrs];

	}

	public PtypedefType(final Object c_q, final Object c_name, final Object c_resolved) {
		super();
		this.child_q = c_q;
		this.child_name = c_name;
		this.child_resolved = c_resolved;

	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_name;
	public final common.StringCatter getChild_name() {
		return (common.StringCatter) (child_name = common.Util.demand(child_name));
	}

	private Object child_resolved;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NType getChild_resolved() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NType) (child_resolved = common.Util.demand(child_resolved));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_q: return getChild_q();
			case i_name: return getChild_name();
			case i_resolved: return getChild_resolved();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_q: return child_q;
			case i_name: return child_name;
			case i_resolved: return child_resolved;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:typedefType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:typedefType";
	}

	static void initProductionAttributeDefinitions() {
		// top.lpp = concat([ terminate(space(,), map((.pp), q,),), text(name,) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_NoncanonicalType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Qualifier), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType.i_q))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType.i_name))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };
		// top.rpp = notext(,)
		edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_NoncanonicalType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pnotext()); } };
		// top.canonicalType = resolved
		edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_canonicalType__ON__edu_umn_cs_melt_ableC_abstractsyntax_NoncanonicalType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType.i_resolved).undecorate(); } };

	}

	public static final common.NodeFactory<PtypedefType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypedefType> {

		@Override
		public PtypedefType invoke(final Object[] children, final Object[] annotations) {
			return new PtypedefType(children[0], children[1], children[2]);
		}
	};

}
