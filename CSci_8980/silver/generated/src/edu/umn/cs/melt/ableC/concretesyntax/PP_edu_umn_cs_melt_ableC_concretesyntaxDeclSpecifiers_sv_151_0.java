
package edu.umn.cs.melt.ableC.concretesyntax;

// top::TypeQualifierList_c ::= h::TypeQualifier_c t::TypeQualifierList_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0 extends edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c {

	public static final int i_h = 0;
	public static final int i_t = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifier_c.class,edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_h] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifier_c.num_inh_attrs];
	childInheritedAttributes[i_t] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0(final Object c_h, final Object c_t, final Object a_core_location) {
		super(a_core_location);
		this.child_h = c_h;
		this.child_t = c_t;

	}

	private Object child_h;
	public final edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifier_c getChild_h() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifier_c) (child_h = common.Util.demand(child_h));
	}

	private Object child_t;
	public final edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c getChild_t() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c) (child_t = common.Util.demand(child_t));
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.typeQualifiers = h.typeQualifiers ++ t.typeQualifiers
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.i_h, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifier_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.i_t, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c))); } };
		// top.mutateTypeSpecifiers = h.mutateTypeSpecifiers ++ t.mutateTypeSpecifiers
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_mutateTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.i_h, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_mutateTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifier_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.i_t, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_mutateTypeSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c))); } };
		// top.specialSpecifiers = t.specialSpecifiers
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_specialSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0.i_t).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_specialSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c)); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxDeclSpecifiers_sv_151_0(children[0], children[1], annotations[0]);
		}
	};

}
