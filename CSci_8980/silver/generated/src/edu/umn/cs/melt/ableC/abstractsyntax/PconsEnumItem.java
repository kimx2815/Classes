
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::EnumItemList ::= h::EnumItem t::EnumItemList 
public final class PconsEnumItem extends edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList {

	public static final int i_h = 0;
	public static final int i_t = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NEnumItem.class,edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_consEnumItem;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_h] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NEnumItem.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList.num_inh_attrs];

	}

	public PconsEnumItem(final Object c_h, final Object c_t) {
		super();
		this.child_h = c_h;
		this.child_t = c_t;

	}

	private Object child_h;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NEnumItem getChild_h() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NEnumItem) (child_h = common.Util.demand(child_h));
	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList getChild_t() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NEnumItemList) (child_t = common.Util.demand(child_t));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_h: return getChild_h();
			case i_t: return getChild_t();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_h: return child_h;
			case i_t: return child_t;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:consEnumItem erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:consEnumItem";
	}

	static void initProductionAttributeDefinitions() {
		// top.pps = (h.pp :: t.pps)
		edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItem), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList))); } };
		// top.errors := h.errors ++ t.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItem), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList))); } });
		// top.defs = h.defs ++ t.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.i_h, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItem), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PconsEnumItem.i_t, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_EnumItemList))); } };

	}

	public static final common.NodeFactory<PconsEnumItem> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PconsEnumItem> {

		@Override
		public PconsEnumItem invoke(final Object[] children, final Object[] annotations) {
			return new PconsEnumItem(children[0], children[1]);
		}
	};

}
