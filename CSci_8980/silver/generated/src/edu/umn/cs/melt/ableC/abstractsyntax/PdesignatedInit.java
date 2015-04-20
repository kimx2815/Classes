
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::Init ::= d::Designator i::Initializer 
public final class PdesignatedInit extends edu.umn.cs.melt.ableC.abstractsyntax.NInit {

	public static final int i_d = 0;
	public static final int i_i = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.class,edu.umn.cs.melt.ableC.abstractsyntax.NInitializer.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_designatedInit;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NInit.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NInit.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.num_inh_attrs];
	childInheritedAttributes[i_i] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NInitializer.num_inh_attrs];

	}

	public PdesignatedInit(final Object c_d, final Object c_i) {
		super();
		this.child_d = c_d;
		this.child_i = c_i;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NDesignator getChild_d() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NDesignator) (child_d = common.Util.demand(child_d));
	}

	private Object child_i;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NInitializer getChild_i() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NInitializer) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;
			case i_i: return child_i;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:designatedInit erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:designatedInit";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ d.pp, text(" = ",), i.pp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" = ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_i, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } };
		// top.errors := d.errors ++ i.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_i, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer))); } });
		// top.defs = d.defs ++ i.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Init] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_i, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer))); } };
		// i.env = addEnv(d.defs, d.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_i][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Initializer] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdesignatedInit.i_d).inherited(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator)); } })); } };

	}

	public static final common.NodeFactory<PdesignatedInit> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PdesignatedInit> {

		@Override
		public PdesignatedInit invoke(final Object[] children, final Object[] annotations) {
			return new PdesignatedInit(children[0], children[1]);
		}
	};

}
