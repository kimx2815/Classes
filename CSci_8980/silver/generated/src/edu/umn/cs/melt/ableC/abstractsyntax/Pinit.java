
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::Init ::= i::Initializer 
public final class Pinit extends edu.umn.cs.melt.ableC.abstractsyntax.NInit {

	public static final int i_i = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NInitializer.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_init;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NInit.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NInit.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_i] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NInitializer.num_inh_attrs];

	}

	public Pinit(final Object c_i) {
		super();
		this.child_i = c_i;

	}

	private Object child_i;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NInitializer getChild_i() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NInitializer) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_i: return child_i;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:init erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:init";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = i.pp
		edu.umn.cs.melt.ableC.abstractsyntax.Pinit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.Pinit.i_i).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer)); } };
		// top.errors := i.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.Pinit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.Pinit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.Pinit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.Pinit.i_i).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer)); } });
		// top.defs = i.defs
		edu.umn.cs.melt.ableC.abstractsyntax.Pinit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.Pinit.i_i).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer)); } };

	}

	public static final common.NodeFactory<Pinit> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pinit> {

		@Override
		public Pinit invoke(final Object[] children, final Object[] annotations) {
			return new Pinit(children[0]);
		}
	};

}
