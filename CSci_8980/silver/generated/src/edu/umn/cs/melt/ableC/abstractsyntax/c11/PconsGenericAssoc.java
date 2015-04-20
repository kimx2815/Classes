
package edu.umn.cs.melt.ableC.abstractsyntax.c11;

// top::GenericAssocs ::= h::GenericAssoc t::GenericAssocs 
public final class PconsGenericAssoc extends edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs {

	public static final int i_h = 0;
	public static final int i_t = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.class,edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_consGenericAssoc;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_h] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.num_inh_attrs];

	}

	public PconsGenericAssoc(final Object c_h, final Object c_t) {
		super();
		this.child_h = c_h;
		this.child_t = c_t;

	}

	private Object child_h;
	public final edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc getChild_h() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc) (child_h = common.Util.demand(child_h));
	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs getChild_t() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs) (child_t = common.Util.demand(child_t));
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:c11:consGenericAssoc erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:c11:consGenericAssoc";
	}

	static void initProductionAttributeDefinitions() {
		// top.pps = (h.pp :: t.pps)
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.i_h, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.i_t, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs))); } };
		// top.errors := h.errors ++ t.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.i_h, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.i_t, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs))); } });
		// top.defs = h.defs ++ t.defs
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.i_h, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.i_t, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs))); } };

	}

	public static final common.NodeFactory<PconsGenericAssoc> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PconsGenericAssoc> {

		@Override
		public PconsGenericAssoc invoke(final Object[] children, final Object[] annotations) {
			return new PconsGenericAssoc(children[0], children[1]);
		}
	};

}
