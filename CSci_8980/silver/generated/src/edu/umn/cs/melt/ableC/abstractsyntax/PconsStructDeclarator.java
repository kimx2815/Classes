
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::StructDeclarators ::= h::StructDeclarator t::StructDeclarators 
public final class PconsStructDeclarator extends edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators {

	public static final int i_h = 0;
	public static final int i_t = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator.class,edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_consStructDeclarator;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_h] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators.num_inh_attrs];

	}

	public PconsStructDeclarator(final Object c_h, final Object c_t) {
		super();
		this.child_h = c_h;
		this.child_t = c_t;

	}

	private Object child_h;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator getChild_h() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator) (child_h = common.Util.demand(child_h));
	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators getChild_t() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarators) (child_t = common.Util.demand(child_t));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_h: return getChild_h();
			case i_t: return getChild_t();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_h: return child_h;
			case i_t: return child_t;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:consStructDeclarator erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:consStructDeclarator";
	}

	static void initProductionAttributeDefinitions() {
		// top.pps = h.pps ++ t.pps
		edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators))); } };
		// top.errors := h.errors ++ t.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators))); } });
		// top.localdefs = h.localdefs ++ t.localdefs
		edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators))); } };
		// t.env = addEnv(h.localdefs, h.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_t][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarators] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PconsStructDeclarator.i_h).inherited(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator)); } })); } };

	}

	public static final common.NodeFactory<PconsStructDeclarator> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PconsStructDeclarator> {

		@Override
		public PconsStructDeclarator invoke(final Object[] children, final Object[] annotations) {
			return new PconsStructDeclarator(children[0], children[1]);
		}
	};

}
