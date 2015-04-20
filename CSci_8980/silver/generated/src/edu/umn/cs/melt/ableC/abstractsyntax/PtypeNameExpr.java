
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::ExprOrTypeName ::= ty::TypeName 
public final class PtypeNameExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName {

	public static final int i_ty = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_typeNameExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExprOrTypeName.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeName.num_inh_attrs];

	}

	public PtypeNameExpr(final Object c_ty) {
		super();
		this.child_ty = c_ty;

	}

	private Object child_ty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeName getChild_ty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeName) (child_ty = common.Util.demand(child_ty));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_ty: return getChild_ty();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_ty: return child_ty;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:typeNameExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:typeNameExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = ty.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName)); } };
		// top.errors := ty.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName)); } });
		// top.defs = ty.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_ExprOrTypeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PtypeNameExpr.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeName)); } };

	}

	public static final common.NodeFactory<PtypeNameExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtypeNameExpr> {

		@Override
		public PtypeNameExpr invoke(final Object[] children, final Object[] annotations) {
			return new PtypeNameExpr(children[0]);
		}
	};

}
