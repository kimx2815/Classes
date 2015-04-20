
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BaseTypeExpr ::= msg::[Message] ty::BaseTypeExpr 
public final class PwarnTypeExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr {

	public static final int i_msg = 0;
	public static final int i_ty = 1;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_warnTypeExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	}

	public PwarnTypeExpr(final Object c_msg, final Object c_ty) {
		super();
		this.child_msg = c_msg;
		this.child_ty = c_ty;

	}

	private Object child_msg;
	public final common.ConsCell getChild_msg() {
		return (common.ConsCell) (child_msg = common.Util.demand(child_msg));
	}

	private Object child_ty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr getChild_ty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr) (child_ty = common.Util.demand(child_ty));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_msg: return getChild_msg();
			case i_ty: return getChild_ty();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_msg: return child_msg;
			case i_ty: return child_ty;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:warnTypeExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:warnTypeExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = ty.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr)); } };
		// top.typerep = ty.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr)); } };
		// top.errors := msg ++ ty.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.i_msg), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr))); } });
		// top.defs = ty.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr.i_ty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr)); } };

	}

	public static final common.NodeFactory<PwarnTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PwarnTypeExpr> {

		@Override
		public PwarnTypeExpr invoke(final Object[] children, final Object[] annotations) {
			return new PwarnTypeExpr(children[0], children[1]);
		}
	};

}
