
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BuiltinType ::= rt::RealType 
public final class PrealType extends edu.umn.cs.melt.ableC.abstractsyntax.NBuiltinType {

	public static final int i_rt = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NRealType.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_realType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBuiltinType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBuiltinType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_rt] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NRealType.num_inh_attrs];

	}

	public PrealType(final Object c_rt) {
		super();
		this.child_rt = c_rt;

	}

	private Object child_rt;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NRealType getChild_rt() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NRealType) (child_rt = common.Util.demand(child_rt));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_rt: return getChild_rt();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_rt: return child_rt;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:realType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:realType";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = rt.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PrealType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BuiltinType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PrealType.i_rt).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_RealType)); } };

	}

	public static final common.NodeFactory<PrealType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PrealType> {

		@Override
		public PrealType invoke(final Object[] children, final Object[] annotations) {
			return new PrealType(children[0]);
		}
	};

}
