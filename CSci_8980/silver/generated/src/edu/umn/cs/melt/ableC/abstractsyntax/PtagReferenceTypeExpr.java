
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::BaseTypeExpr ::= q::[Qualifier] kwd::StructOrEnumOrUnion name::Name 
public final class PtagReferenceTypeExpr extends edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr {

	public static final int i_q = 0;
	public static final int i_kwd = 1;
	public static final int i_name = 2;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion.class,edu.umn.cs.melt.ableC.abstractsyntax.NName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_tagReferenceTypeExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_kwd] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion.num_inh_attrs];
	childInheritedAttributes[i_name] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_inh_attrs];

	}

	public PtagReferenceTypeExpr(final Object c_q, final Object c_kwd, final Object c_name) {
		super();
		this.child_q = c_q;
		this.child_kwd = c_kwd;
		this.child_name = c_name;

	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_kwd;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion getChild_kwd() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion) (child_kwd = common.Util.demand(child_kwd));
	}

	private Object child_name;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NName getChild_name() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NName) (child_name = common.Util.demand(child_name));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_q: return getChild_q();
			case i_kwd: return getChild_kwd();
			case i_name: return getChild_name();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_q: return child_q;
			case i_kwd: return child_kwd;
			case i_name: return child_name;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:tagReferenceTypeExpr erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:tagReferenceTypeExpr";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ terminate(space(,), map((.pp), q,),), kwd.pp, space(,), name.pp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Qualifier), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_q))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_kwd, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructOrEnumOrUnion), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } };
		// top.typerep = tagType(q, tagtype,)
		edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PtagType(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_q), common.Thunk.transformUndecorate(context.localDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.tagtype__ON__edu_umn_cs_melt_ableC_abstractsyntax_tagReferenceTypeExpr)))); } };
		// top.errors := []
		if(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });
		// top.defs = []
		edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// tags = lookupTag(name.name, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_tagReferenceTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupTag.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr))); } };
		// tagtype = if null(tags,) then incompleteTagType(kwd, name.name,) else error("TODO",)
		edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.tagtype__ON__edu_umn_cs_melt_ableC_abstractsyntax_tagReferenceTypeExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)core.Pnull.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_tagReferenceTypeExpr))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.NTagType)new edu.umn.cs.melt.ableC.abstractsyntax.PincompleteTagType(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_kwd)), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PtagReferenceTypeExpr.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))) : ((edu.umn.cs.melt.ableC.abstractsyntax.NTagType)core.Perror.invoke((new common.StringCatter("TODO"))))); } };

	}

	public static final common.NodeFactory<PtagReferenceTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PtagReferenceTypeExpr> {

		@Override
		public PtagReferenceTypeExpr invoke(final Object[] children, final Object[] annotations) {
			return new PtagReferenceTypeExpr(children[0], children[1], children[2]);
		}
	};

}
