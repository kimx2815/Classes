
package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

// top::MemberDesignator ::= id::Name 
public final class PinitialMemberDesignator extends edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator {

	public static final int i_id = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_initialMemberDesignator;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_id] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_inh_attrs];

	}

	public PinitialMemberDesignator(final Object c_id) {
		super();
		this.child_id = c_id;

	}

	private Object child_id;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NName getChild_id() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NName) (child_id = common.Util.demand(child_id));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_id: return getChild_id();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_id: return child_id;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:gcc:initialMemberDesignator erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:gcc:initialMemberDesignator";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = id.pp
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.i_id).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } };
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.defs = []
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };

	}

	public static final common.NodeFactory<PinitialMemberDesignator> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PinitialMemberDesignator> {

		@Override
		public PinitialMemberDesignator invoke(final Object[] children, final Object[] annotations) {
			return new PinitialMemberDesignator(children[0]);
		}
	};

}
