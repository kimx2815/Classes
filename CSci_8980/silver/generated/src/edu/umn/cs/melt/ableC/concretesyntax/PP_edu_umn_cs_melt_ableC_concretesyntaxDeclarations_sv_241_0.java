
package edu.umn.cs.melt.ableC.concretesyntax;

// top::DirectDeclarator_c ::= dd::DirectDeclarator_c '[' q::TypeQualifierList_c '*' ']' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0 extends edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c {

	public static final int i_dd = 0;
	public static final int i__G_3 = 1;
	public static final int i_q = 2;
	public static final int i__G_1 = 3;
	public static final int i__G_0 = 4;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c.class,common.TerminalRecord.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[5][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_dd] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c.num_inh_attrs];
	childInheritedAttributes[i_q] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0(final Object c_dd, final Object c__G_3, final Object c_q, final Object c__G_1, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child_dd = c_dd;
		this.child__G_3 = c__G_3;
		this.child_q = c_q;
		this.child__G_1 = c__G_1;
		this.child__G_0 = c__G_0;

	}

	private Object child_dd;
	public final edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c getChild_dd() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NDirectDeclarator_c) (child_dd = common.Util.demand(child_dd));
	}

	private Object child__G_3;
	public final common.TerminalRecord getChild__G_3() {
		return (common.TerminalRecord) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_q;
	public final edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c getChild_q() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifierList_c) (child_q = common.Util.demand(child_q));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_dd: return getChild_dd();
			case i__G_3: return getChild__G_3();
			case i_q: return getChild_q();
			case i__G_1: return getChild__G_1();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_dd: return child_dd;
			case i__G_3: return child__G_3;
			case i_q: return child_q;
			case i__G_1: return child__G_1;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 5;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:P_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.declaredIdent = dd.declaredIdent
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredIdent__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.i_dd).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredIdent__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c)); } };
		// top.declaredParamIdents = dd.declaredParamIdents
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredParamIdents__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.i_dd).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredParamIdents__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c)); } };
		// dd.givenType = ast:arrayTypeExprWithoutExpr(top.givenType, q.typeQualifiers, ast:starArraySize(,),)
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.i_dd][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenType__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)new edu.umn.cs.melt.ableC.abstractsyntax.ParrayTypeExprWithoutExpr(context.contextInheritedLazy(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenType__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.i_q, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_typeQualifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_TypeQualifierList_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NArraySizeModifier)new edu.umn.cs.melt.ableC.abstractsyntax.PstarArraySize()); } })); } };
		// top.ast = dd.ast
		edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0.i_dd).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_DirectDeclarator_c)); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntaxDeclarations_sv_241_0(children[0], children[1], children[2], children[3], children[4], annotations[0]);
		}
	};

}
