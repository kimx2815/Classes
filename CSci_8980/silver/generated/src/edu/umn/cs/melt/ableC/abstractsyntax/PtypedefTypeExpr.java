
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BaseTypeExpr ::= q::[Qualifier] name::Name 
public final class PtypedefTypeExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr {

	public static final int i_q = 0;
	public static final int i_name = 1;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_typedefTypeExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_name] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_inh_attrs];

	}

	public PtypedefTypeExpr(final Object c_q, final Object c_name) {
		super();
		this.child_q = c_q;
		this.child_name = c_name;

	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_name;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NName getChild_name() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NName) (child_name = common.Util.demand(child_name));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_q: return getChild_q();
			case i_name: return getChild_name();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_q: return child_q;
			case i_name: return child_name;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:typedefTypeExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:typedefTypeExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ terminate(space(,), map((.pp), q,),), name.pp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Qualifier), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.i_q))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };
		// top.typerep = if ! null(name.valueLookupCheck,) then errorType(,) else noncanonicalType(typedefType(q, name.name, error("todo42",),),)
		edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((!((Boolean)core.Pnull.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueLookupCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PerrorType()) : ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PnoncanonicalType(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType)new edu.umn.cs.melt.ableC.abstractsyntax.PtypedefType(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.i_q), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)core.Perror.invoke((new common.StringCatter("todo42")))); } })); } }))); } };
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.defs = []
		edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.errors <- name.valueLookupCheck
		if(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypedefTypeExpr.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueLookupCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } });

	}

	public static final common.NodeFactory<PtypedefTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypedefTypeExpr> {

		@Override
		public PtypedefTypeExpr invoke(final Object[] children, final Object[] annotations) {
			return new PtypedefTypeExpr(children[0], children[1]);
		}
	};

}
