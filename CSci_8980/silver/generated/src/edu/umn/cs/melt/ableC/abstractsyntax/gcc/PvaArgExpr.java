
package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

// top::Expr ::= e::Expr ty::TypeName 
public final class PvaArgExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NExpr {

	public static final int i_e = 0;
	public static final int i_ty = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_vaArgExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_ty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.num_inh_attrs];

	}

	public PvaArgExpr(final Object c_e, final Object c_ty, final Object a_core_location) {
		super(a_core_location);
		this.child_e = c_e;
		this.child_ty = c_ty;

	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_e() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_e = common.Util.demand(child_e));
	}

	private Object child_ty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeName getChild_ty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeName) (child_ty = common.Util.demand(child_ty));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_e: return getChild_e();
			case i_ty: return getChild_ty();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_e: return child_e;
			case i_ty: return child_ty;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:gcc:vaArgExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:gcc:vaArgExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ text("__builtin_va_arg(",), e.pp, text(", ",), ty.pp, text(")",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("__builtin_va_arg(")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(")")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } };
		// top.errors := e.errors ++ ty.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName))); } });
		// top.defs = e.defs ++ ty.defs
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName))); } };

	}

	public static final common.NodeFactory<PvaArgExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PvaArgExpr> {

		@Override
		public PvaArgExpr invoke(final Object[] children, final Object[] annotations) {
			return new PvaArgExpr(children[0], children[1], annotations[0]);
		}
	};

}
