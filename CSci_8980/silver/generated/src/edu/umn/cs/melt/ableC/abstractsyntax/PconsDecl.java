
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::Decls ::= h::Decl t::Decls 
public final class PconsDecl extends edu.umn.cs.melt.ableC.abstractsyntax.NDecls {

	public static final int i_h = 0;
	public static final int i_t = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NDecl.class,edu.umn.cs.melt.ableC.abstractsyntax.NDecls.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_consDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDecls.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDecls.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_h] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDecl.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDecls.num_inh_attrs];

	}

	public PconsDecl(final Object c_h, final Object c_t) {
		super();
		this.child_h = c_h;
		this.child_t = c_t;

	}

	private Object child_h;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NDecl getChild_h() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NDecl) (child_h = common.Util.demand(child_h));
	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NDecls getChild_t() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NDecls) (child_t = common.Util.demand(child_t));
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:consDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:consDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.pps = (h.pp :: t.pps)
		edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls))); } };
		// top.errors := h.errors ++ t.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls))); } });
		// top.defs = h.defs ++ t.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls))); } };
		// t.env = addEnv(h.defs, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_t][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsDecl.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decl), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls))); } };

	}

	public static final common.NodeFactory<PconsDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PconsDecl> {

		@Override
		public PconsDecl invoke(final Object[] children, final Object[] annotations) {
			return new PconsDecl(children[0], children[1]);
		}
	};

}
