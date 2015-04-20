
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BaseTypeExpr ::= result::Type 
public final class PdirectTypeExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr {

	public static final int i_result = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_directTypeExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_result] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NType.num_inh_attrs];

	}

	public PdirectTypeExpr(final Object c_result) {
		super();
		this.child_result = c_result;

	}

	private Object child_result;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NType getChild_result() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NType) (child_result = common.Util.demand(child_result));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_result: return getChild_result();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_result: return child_result;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:directTypeExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:directTypeExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = cat(result.lpp, result.rpp,)
		edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.i_result, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.i_result, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Type))); } };
		// top.typerep = result
		edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.i_result).undecorate(); } };
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.defs = []
		edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };

	}

	public static final common.NodeFactory<PdirectTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PdirectTypeExpr> {

		@Override
		public PdirectTypeExpr invoke(final Object[] children, final Object[] annotations) {
			return new PdirectTypeExpr(children[0]);
		}
	};

}
