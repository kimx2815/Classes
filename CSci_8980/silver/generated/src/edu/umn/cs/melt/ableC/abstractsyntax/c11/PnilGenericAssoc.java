
package edu.umn.cs.melt.ableC.abstractsyntax.c11;

// top::GenericAssocs ::= 
public final class PnilGenericAssoc extends edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_nilGenericAssoc;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PnilGenericAssoc() {
		super();

	}



	@Override
	public Object getChild(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 0;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:c11:nilGenericAssoc erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:c11:nilGenericAssoc";
	}

	static void initProductionAttributeDefinitions() {
		// top.pps = []
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PnilGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.c11.PnilGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.c11.PnilGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.c11.PnilGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.defs = []
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PnilGenericAssoc.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };

	}

	public static final common.NodeFactory<PnilGenericAssoc> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PnilGenericAssoc> {

		@Override
		public PnilGenericAssoc invoke(final Object[] children, final Object[] annotations) {
			return new PnilGenericAssoc();
		}
	};

}
