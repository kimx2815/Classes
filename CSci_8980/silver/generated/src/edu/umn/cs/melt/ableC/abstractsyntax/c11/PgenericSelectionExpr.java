
package edu.umn.cs.melt.ableC.abstractsyntax.c11;

// top::Expr ::= e::Expr gl::GenericAssocs def::MaybeExpr 
public final class PgenericSelectionExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NExpr {

	public static final int i_e = 0;
	public static final int i_gl = 1;
	public static final int i_def = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.class,edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_genericSelectionExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_gl] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.num_inh_attrs];
	childInheritedAttributes[i_def] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr.num_inh_attrs];

	}

	public PgenericSelectionExpr(final Object c_e, final Object c_gl, final Object c_def, final Object a_core_location) {
		super(a_core_location);
		this.child_e = c_e;
		this.child_gl = c_gl;
		this.child_def = c_def;

	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_e() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_e = common.Util.demand(child_e));
	}

	private Object child_gl;
	public final edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs getChild_gl() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs) (child_gl = common.Util.demand(child_gl));
	}

	private Object child_def;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr getChild_def() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr) (child_def = common.Util.demand(child_def));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_e: return getChild_e();
			case i_gl: return getChild_gl();
			case i_def: return getChild_def();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_e: return child_e;
			case i_gl: return child_gl;
			case i_def: return child_def;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 3;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:c11:genericSelectionExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:c11:genericSelectionExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ text("_Generic",), parens(ppImplode(text(", ",), (e.pp :: gl.pps) ++ if def.isJust then [ text("default: ",), def.pp ] else [],),) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("_Generic")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pimplode.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_gl, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_def).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.core_isJust__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeExpr)) ? ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("default: ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_def, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })) : ((common.ConsCell)core.Pnil.invoke())); } })); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };
		// top.errors := e.errors ++ gl.errors ++ def.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_gl, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_def, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeExpr))); } })); } });
		// top.defs = e.defs ++ gl.defs ++ def.defs
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_gl, edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.i_def, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeExpr))); } })); } };

	}

	public static final common.NodeFactory<PgenericSelectionExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgenericSelectionExpr> {

		@Override
		public PgenericSelectionExpr invoke(final Object[] children, final Object[] annotations) {
			return new PgenericSelectionExpr(children[0], children[1], children[2], annotations[0]);
		}
	};

}
