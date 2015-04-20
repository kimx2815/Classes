
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::FunctionType ::= args::[Type] variadic::Boolean 
public final class PprotoFunctionType extends edu.umn.cs.melt.ableC.abstractsyntax.NFunctionType {

	public static final int i_args = 0;
	public static final int i_variadic = 1;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,Boolean.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_protoFunctionType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NFunctionType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NFunctionType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PprotoFunctionType(final Object c_args, final Object c_variadic) {
		super();
		this.child_args = c_args;
		this.child_variadic = c_variadic;

	}

	private Object child_args;
	public final common.ConsCell getChild_args() {
		return (common.ConsCell) (child_args = common.Util.demand(child_args));
	}

	private Object child_variadic;
	public final Boolean getChild_variadic() {
		return (Boolean) (child_variadic = common.Util.demand(child_variadic));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_args: return getChild_args();
			case i_variadic: return getChild_variadic();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_args: return child_args;
			case i_variadic: return child_variadic;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:protoFunctionType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:protoFunctionType";
	}

	static void initProductionAttributeDefinitions() {
		// top.lpp = notext(,)
		edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pnotext()); } };
		// top.rpp = parens(if null(args,) then text("void",) else ppImplode(text(", ",), argpp,),)
		edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.i_args))) ? ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("void")))) : ((silver.langutil.pp.NDocument)silver.langutil.pp.Pimplode.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(", ")))); } }, context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.argpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_protoFunctionType)))); } })); } };
		// argpp = zipWith(cat, map((.lpp), args,), map((.rpp), args,),) ++ if variadic then [] else [ text("...",) ]
		edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.argpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_protoFunctionType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.PzipWith.invoke(silver.langutil.pp.Pcat.factory, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.i_args))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.i_args))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return (((Boolean)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.PprotoFunctionType.i_variadic)) ? ((common.ConsCell)core.Pnil.invoke()) : ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("...")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } }))); } })); } };

	}

	public static final common.NodeFactory<PprotoFunctionType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PprotoFunctionType> {

		@Override
		public PprotoFunctionType invoke(final Object[] children, final Object[] annotations) {
			return new PprotoFunctionType(children[0], children[1]);
		}
	};

}
