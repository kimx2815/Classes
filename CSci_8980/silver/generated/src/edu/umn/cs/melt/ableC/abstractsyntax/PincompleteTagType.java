
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::TagType ::= kwd::StructOrEnumOrUnion name::String 
public final class PincompleteTagType extends edu.umn.cs.melt.ableC.abstractsyntax.NTagType {

	public static final int i_kwd = 0;
	public static final int i_name = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion.class,common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_incompleteTagType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTagType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTagType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_kwd] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion.num_inh_attrs];

	}

	public PincompleteTagType(final Object c_kwd, final Object c_name) {
		super();
		this.child_kwd = c_kwd;
		this.child_name = c_name;

	}

	private Object child_kwd;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion getChild_kwd() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NStructOrEnumOrUnion) (child_kwd = common.Util.demand(child_kwd));
	}

	private Object child_name;
	public final common.StringCatter getChild_name() {
		return (common.StringCatter) (child_name = common.Util.demand(child_name));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_kwd: return getChild_kwd();
			case i_name: return getChild_name();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_kwd: return child_kwd;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:incompleteTagType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:incompleteTagType";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ kwd.pp, text(name,) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PincompleteTagType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TagType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PincompleteTagType.i_kwd, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructOrEnumOrUnion), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PincompleteTagType.i_name))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };

	}

	public static final common.NodeFactory<PincompleteTagType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PincompleteTagType> {

		@Override
		public PincompleteTagType invoke(final Object[] children, final Object[] annotations) {
			return new PincompleteTagType(children[0], children[1]);
		}
	};

}
