
package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

// top::BaseTypeExpr ::= q::[Qualifier] e::ExprOrTypeName 
public final class PtypeofTypeExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr {

	public static final int i_q = 0;
	public static final int i_e = 1;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_typeofTypeExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName.num_inh_attrs];

	}

	public PtypeofTypeExpr(final Object c_q, final Object c_e) {
		super();
		this.child_q = c_q;
		this.child_e = c_e;

	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName getChild_e() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_q: return getChild_q();
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_q: return child_q;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:gcc:typeofTypeExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:gcc:typeofTypeExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.typerep = noncanonicalType(typeofType(q, error("e.typerep",),),)
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PnoncanonicalType(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType)new edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofType(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.i_q), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)core.Perror.invoke((new common.StringCatter("e.typerep")))); } })); } })); } };
		// top.pp = concat([ text("__typeof__",), parens(e.pp,) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("__typeof__")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pparens.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };
		// top.errors := e.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.i_e).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName)); } });
		// top.defs = e.defs
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.i_e).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName)); } };

	}

	public static final common.NodeFactory<PtypeofTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypeofTypeExpr> {

		@Override
		public PtypeofTypeExpr invoke(final Object[] children, final Object[] annotations) {
			return new PtypeofTypeExpr(children[0], children[1]);
		}
	};

}
