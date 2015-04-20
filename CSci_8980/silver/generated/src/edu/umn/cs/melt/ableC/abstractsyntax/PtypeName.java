
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::TypeName ::= bty::BaseTypeExpr mty::TypeModifierExpr 
public final class PtypeName extends edu.umn.cs.melt.ableC.abstractsyntax.NTypeName {

	public static final int i_bty = 0;
	public static final int i_mty = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_typeName;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_bty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];
	childInheritedAttributes[i_mty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];

	}

	public PtypeName(final Object c_bty, final Object c_mty) {
		super();
		this.child_bty = c_bty;
		this.child_mty = c_mty;

	}

	private Object child_bty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr getChild_bty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr) (child_bty = common.Util.demand(child_bty));
	}

	private Object child_mty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr getChild_mty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr) (child_mty = common.Util.demand(child_mty));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_bty: return getChild_bty();
			case i_mty: return getChild_mty();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_bty: return child_bty;
			case i_mty: return child_mty;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:typeName erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:typeName";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ bty.pp, mty.lpp, mty.rpp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } };
		// top.typerep = mty.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_mty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr)); } };
		// mty.baseType = bty.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_mty][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_baseType__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_bty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr)); } };
		// top.errors := bty.errors ++ mty.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr))); } });
		// top.defs = bty.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypeName.i_bty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr)); } };

	}

	public static final common.NodeFactory<PtypeName> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypeName> {

		@Override
		public PtypeName invoke(final Object[] children, final Object[] annotations) {
			return new PtypeName(children[0], children[1]);
		}
	};

}
