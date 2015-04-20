
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::NoncanonicalType ::= original::Type pointer::Type 
public final class PdecayedType extends edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType {

	public static final int i_original = 0;
	public static final int i_pointer = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NType.class,edu.umn.cs.melt.ableC.abstractsyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_decayedType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_original] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_pointer] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NType.num_inh_attrs];

	}

	public PdecayedType(final Object c_original, final Object c_pointer) {
		super();
		this.child_original = c_original;
		this.child_pointer = c_pointer;

	}

	private Object child_original;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NType getChild_original() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NType) (child_original = common.Util.demand(child_original));
	}

	private Object child_pointer;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NType getChild_pointer() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NType) (child_pointer = common.Util.demand(child_pointer));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_original: return getChild_original();
			case i_pointer: return getChild_pointer();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_original: return child_original;
			case i_pointer: return child_pointer;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:decayedType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:decayedType";
	}

	static void initProductionAttributeDefinitions() {
		// top.lpp = original.lpp
		edu.umn.cs.melt.ableC.abstractsyntax.PdecayedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_NoncanonicalType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdecayedType.i_original).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type)); } };
		// top.rpp = original.rpp
		edu.umn.cs.melt.ableC.abstractsyntax.PdecayedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_NoncanonicalType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdecayedType.i_original).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type)); } };
		// top.canonicalType = pointer
		edu.umn.cs.melt.ableC.abstractsyntax.PdecayedType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_canonicalType__ON__edu_umn_cs_melt_ableC_abstractsyntax_NoncanonicalType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdecayedType.i_pointer).undecorate(); } };

	}

	public static final common.NodeFactory<PdecayedType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PdecayedType> {

		@Override
		public PdecayedType invoke(final Object[] children, final Object[] annotations) {
			return new PdecayedType(children[0], children[1]);
		}
	};

}
