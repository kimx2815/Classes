
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::TypeModifierExpr ::= element::TypeModifierExpr indexQualifiers::[Qualifier] sizeModifier::ArraySizeModifier size::Expr 
public final class ParrayTypeExprWithExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr {

	public static final int i_element = 0;
	public static final int i_indexQualifiers = 1;
	public static final int i_sizeModifier = 2;
	public static final int i_size = 3;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.class,common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NArraySizeModifier.class,edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_arrayTypeExprWithExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_element] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];
	childInheritedAttributes[i_sizeModifier] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NArraySizeModifier.num_inh_attrs];
	childInheritedAttributes[i_size] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	}

	public ParrayTypeExprWithExpr(final Object c_element, final Object c_indexQualifiers, final Object c_sizeModifier, final Object c_size) {
		super();
		this.child_element = c_element;
		this.child_indexQualifiers = c_indexQualifiers;
		this.child_sizeModifier = c_sizeModifier;
		this.child_size = c_size;

	}

	private Object child_element;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr getChild_element() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr) (child_element = common.Util.demand(child_element));
	}

	private Object child_indexQualifiers;
	public final common.ConsCell getChild_indexQualifiers() {
		return (common.ConsCell) (child_indexQualifiers = common.Util.demand(child_indexQualifiers));
	}

	private Object child_sizeModifier;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NArraySizeModifier getChild_sizeModifier() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NArraySizeModifier) (child_sizeModifier = common.Util.demand(child_sizeModifier));
	}

	private Object child_size;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_size() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_size = common.Util.demand(child_size));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_element: return getChild_element();
			case i_indexQualifiers: return getChild_indexQualifiers();
			case i_sizeModifier: return getChild_sizeModifier();
			case i_size: return getChild_size();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_element: return child_element;
			case i_indexQualifiers: return child_indexQualifiers;
			case i_sizeModifier: return child_sizeModifier;
			case i_size: return child_size;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:arrayTypeExprWithExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:arrayTypeExprWithExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.lpp = element.lpp
		edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_element).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr)); } };
		// top.rpp = cat(brackets(concat([ terminate(space(,), map((.pp), indexQualifiers,),), space(,), sizeModifier.pp, size.pp ],),), element.rpp,)
		edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pbrackets.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Qualifier), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_indexQualifiers))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_sizeModifier, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_ArraySizeModifier), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_size, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_element, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr))); } };
		// top.typerep = arrayType(element.typerep, indexQualifiers, sizeModifier, error("TODO",),)
		edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.ParrayType(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_element, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_indexQualifiers), common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_sizeModifier)), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NArrayType)core.Perror.invoke((new common.StringCatter("TODO")))); } })); } };
		// top.errors := element.errors ++ size.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_element, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithExpr.i_size, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr))); } });

	}

	public static final common.NodeFactory<ParrayTypeExprWithExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<ParrayTypeExprWithExpr> {

		@Override
		public ParrayTypeExprWithExpr invoke(final Object[] children, final Object[] annotations) {
			return new ParrayTypeExprWithExpr(children[0], children[1], children[2], children[3]);
		}
	};

}
