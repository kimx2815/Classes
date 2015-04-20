
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::TypeModifierExpr ::= result::TypeModifierExpr args::Parameters variadic::Boolean 
public final class PfunctionTypeExprWithArgs extends edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr {

	public static final int i_result = 0;
	public static final int i_args = 1;
	public static final int i_variadic = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NParameters.class,Boolean.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_functionTypeExprWithArgs;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_result] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];
	childInheritedAttributes[i_args] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NParameters.num_inh_attrs];

	}

	public PfunctionTypeExprWithArgs(final Object c_result, final Object c_args, final Object c_variadic) {
		super();
		this.child_result = c_result;
		this.child_args = c_args;
		this.child_variadic = c_variadic;

	}

	private Object child_result;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr getChild_result() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr) (child_result = common.Util.demand(child_result));
	}

	private Object child_args;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters getChild_args() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters) (child_args = common.Util.demand(child_args));
	}

	private Object child_variadic;
	public final Boolean getChild_variadic() {
		return (Boolean) (child_variadic = common.Util.demand(child_variadic));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_result: return getChild_result();
			case i_args: return getChild_args();
			case i_variadic: return getChild_variadic();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_result: return child_result;
			case i_args: return child_args;
			case i_variadic: return child_variadic;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:functionTypeExprWithArgs erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:functionTypeExprWithArgs";
	}

	static void initProductionAttributeDefinitions() {
		// top.lpp = concat([ result.lpp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_result, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } };
		// top.rpp = cat(parens(if null(args.pps,) then text("void",) else ppImplode(text(", ",), args.pps,),), result.rpp,)
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)core.Pnull.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_args, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters))) ? ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("void")))) : ((silver.langutil.pp.NDocument)silver.langutil.pp.Pimplode.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_args, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters)))); } })); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_result, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr))); } };
		// top.typerep = functionType(result.typerep, protoFunctionType(args.typereps, variadic,),)
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PfunctionType(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_result, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NFunctionType)new edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_args, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typereps__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_variadic))); } })); } };
		// top.errors := result.errors ++ args.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_result, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_args, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters))); } });
		// args.env = openScope(top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs.i_args][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PopenScope.invoke(context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr))); } };

	}

	public static final common.NodeFactory<PfunctionTypeExprWithArgs> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PfunctionTypeExprWithArgs> {

		@Override
		public PfunctionTypeExprWithArgs invoke(final Object[] children, final Object[] annotations) {
			return new PfunctionTypeExprWithArgs(children[0], children[1], children[2]);
		}
	};

}
