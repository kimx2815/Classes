
package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

// top::Designator ::= d::Designator l::Expr u::Expr 
public final class ParrayRangeDesignator extends edu.umn.cs.melt.ableC.abstractsyntax.NDesignator {

	public static final int i_d = 0;
	public static final int i_l = 1;
	public static final int i_u = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.class,edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_arrayRangeDesignator;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.num_inh_attrs];
	childInheritedAttributes[i_l] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_u] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	}

	public ParrayRangeDesignator(final Object c_d, final Object c_l, final Object c_u) {
		super();
		this.child_d = c_d;
		this.child_l = c_l;
		this.child_u = c_u;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NDesignator getChild_d() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NDesignator) (child_d = common.Util.demand(child_d));
	}

	private Object child_l;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_l() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_l = common.Util.demand(child_l));
	}

	private Object child_u;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_u() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_u = common.Util.demand(child_u));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();
			case i_l: return getChild_l();
			case i_u: return getChild_u();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;
			case i_l: return child_l;
			case i_u: return child_u;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:gcc:arrayRangeDesignator erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:gcc:arrayRangeDesignator";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ d.pp, text("[",), l.pp, text("...",), u.pp, text("]",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("[")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_l, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("...")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_u, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("]")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } })); } };
		// top.errors := d.errors ++ l.errors ++ u.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_l, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_u, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr))); } })); } });
		// top.defs = d.defs ++ l.defs ++ u.defs
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_d, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Designator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_l, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.i_u, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr))); } })); } };

	}

	public static final common.NodeFactory<ParrayRangeDesignator> factory = new Factory();

	public static final class Factory extends common.NodeFactory<ParrayRangeDesignator> {

		@Override
		public ParrayRangeDesignator invoke(final Object[] children, final Object[] annotations) {
			return new ParrayRangeDesignator(children[0], children[1], children[2]);
		}
	};

}
