
package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

// top::Expr ::= l::TypeName r::TypeName 
public final class PtypesCompatibleExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NExpr {

	public static final int i_l = 0;
	public static final int i_r = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.class,edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_typesCompatibleExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_l] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.num_inh_attrs];

	}

	public PtypesCompatibleExpr(final Object c_l, final Object c_r, final Object a_core_location) {
		super(a_core_location);
		this.child_l = c_l;
		this.child_r = c_r;

	}

	private Object child_l;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeName getChild_l() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeName) (child_l = common.Util.demand(child_l));
	}

	private Object child_r;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeName getChild_r() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeName) (child_r = common.Util.demand(child_r));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();
			case i_r: return getChild_r();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;
			case i_r: return child_r;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:gcc:typesCompatibleExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:gcc:typesCompatibleExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ text("__builtin_types_compatible_p(",), l.pp, text(", ",), r.pp, text(")",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("__builtin_types_compatible_p(")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.i_l, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.i_r, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(")")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } };
		// top.errors := l.errors ++ r.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.i_l, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.i_r, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName))); } });
		// top.defs = l.defs ++ r.defs
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.i_l, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.i_r, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName))); } };

	}

	public static final common.NodeFactory<PtypesCompatibleExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypesCompatibleExpr> {

		@Override
		public PtypesCompatibleExpr invoke(final Object[] children, final Object[] annotations) {
			return new PtypesCompatibleExpr(children[0], children[1], annotations[0]);
		}
	};

}
