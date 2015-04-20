
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::ExternalDecl ::= d::Decl 
public final class PdeclExternalDecl extends edu.umn.cs.melt.ableC.abstractsyntax.NExternalDecl {

	public static final int i_d = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NDecl.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_declExternalDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExternalDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExternalDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDecl.num_inh_attrs];

	}

	public PdeclExternalDecl(final Object c_d) {
		super();
		this.child_d = c_d;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NDecl getChild_d() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NDecl) (child_d = common.Util.demand(child_d));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:declExternalDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:declExternalDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = cat(d.pp, semi(,),)
		edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Psemi.invoke()); } })); } };
		// top.errors := d.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.i_d).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl)); } });
		// top.defs = d.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExternalDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdeclExternalDecl.i_d).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl)); } };

	}

	public static final common.NodeFactory<PdeclExternalDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PdeclExternalDecl> {

		@Override
		public PdeclExternalDecl invoke(final Object[] children, final Object[] annotations) {
			return new PdeclExternalDecl(children[0]);
		}
	};

}
