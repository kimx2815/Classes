
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::ExternalDecl ::= f::FunctionDecl 
public final class PfunctionExternalDecl extends edu.umn.cs.melt.ableC.abstractsyntax.NExternalDecl {

	public static final int i_f = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_functionExternalDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExternalDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExternalDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_f] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl.num_inh_attrs];

	}

	public PfunctionExternalDecl(final Object c_f) {
		super();
		this.child_f = c_f;

	}

	private Object child_f;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl getChild_f() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl) (child_f = common.Util.demand(child_f));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_f: return getChild_f();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_f: return child_f;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:functionExternalDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:functionExternalDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = f.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.i_f).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl)); } };
		// top.errors := f.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.i_f).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl)); } });
		// top.defs = f.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionExternalDecl.i_f).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl)); } };

	}

	public static final common.NodeFactory<PfunctionExternalDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PfunctionExternalDecl> {

		@Override
		public PfunctionExternalDecl invoke(final Object[] children, final Object[] annotations) {
			return new PfunctionExternalDecl(children[0]);
		}
	};

}
