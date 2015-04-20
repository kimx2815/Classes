
package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

// top::MemberDesignator ::= d::MemberDesignator e::Expr 
public final class ParrayMemberDesignator extends edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator {

	public static final int i_d = 0;
	public static final int i_e = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.class,edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_arrayMemberDesignator;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	}

	public ParrayMemberDesignator(final Object c_d, final Object c_e) {
		super();
		this.child_d = c_d;
		this.child_e = c_e;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator getChild_d() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator) (child_d = common.Util.demand(child_d));
	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_e() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;
			case i_e: return child_e;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:gcc:arrayMemberDesignator erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:gcc:arrayMemberDesignator";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ d.pp, text("[",), e.pp, text("]",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.i_d, edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("[")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("]")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } };
		// top.errors := d.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.i_d).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator)); } });
		// top.defs = d.defs ++ e.defs
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.i_d, edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr))); } };

	}

	public static final common.NodeFactory<ParrayMemberDesignator> factory = new Factory();

	public static final class Factory extends common.NodeFactory<ParrayMemberDesignator> {

		@Override
		public ParrayMemberDesignator invoke(final Object[] children, final Object[] annotations) {
			return new ParrayMemberDesignator(children[0], children[1]);
		}
	};

}
