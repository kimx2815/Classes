
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::InitDeclarator_c ::= d::Declarator_c a::SimpleAsmStatement_c aa::Attributes_c 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0 extends edu.umn.cs.melt.ableC.concretesyntax.NInitDeclarator_c {

	public static final int i_d = 0;
	public static final int i_a = 1;
	public static final int i_aa = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c.class,edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NSimpleAsmStatement_c.class,edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitDeclarator_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NInitDeclarator_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_d] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c.num_inh_attrs];
	childInheritedAttributes[i_a] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NSimpleAsmStatement_c.num_inh_attrs];
	childInheritedAttributes[i_aa] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0(final Object c_d, final Object c_a, final Object c_aa, final Object a_core_location) {
		super(a_core_location);
		this.child_d = c_d;
		this.child_a = c_a;
		this.child_aa = c_aa;

	}

	private Object child_d;
	public final edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c getChild_d() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NDeclarator_c) (child_d = common.Util.demand(child_d));
	}

	private Object child_a;
	public final edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NSimpleAsmStatement_c getChild_a() {
		return (edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NSimpleAsmStatement_c) (child_a = common.Util.demand(child_a));
	}

	private Object child_aa;
	public final edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c getChild_aa() {
		return (edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c) (child_aa = common.Util.demand(child_aa));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_d: return getChild_d();
			case i_a: return getChild_a();
			case i_aa: return getChild_aa();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_d: return child_d;
			case i_a: return child_a;
			case i_aa: return child_aa;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:P_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.declaredIdent = d.declaredIdent
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredIdent__ON__edu_umn_cs_melt_ableC_concretesyntax_InitDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.i_d).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredIdent__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c)); } };
		// d.givenType = ast:baseTypeExpr(,)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.childInheritedAttributes[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.i_d][edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_givenType__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PbaseTypeExpr()); } };
		// top.ast = [ ast:errorDeclarator([ wrn(a.location, "Ignoring asm annotation",) ],), ast:errorDeclarator([ wrn(aa.location, "Ignoring attribute",) ],), ast:declarator(d.declaredIdent, d.ast, ast:nothingInitializer(,),) ]
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_InitDeclarator_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDeclarator)new edu.umn.cs.melt.ableC.abstractsyntax.PerrorDeclarator(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Pwrn(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NSimpleAsmStatement_c)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.i_a).undecorate()).getAnno_core_location()); } }, (new common.StringCatter("Ignoring asm annotation")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDeclarator)new edu.umn.cs.melt.ableC.abstractsyntax.PerrorDeclarator(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Pwrn(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NAttributes_c)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.i_aa).undecorate()).getAnno_core_location()); } }, (new common.StringCatter("Ignoring attribute")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NDeclarator)new edu.umn.cs.melt.ableC.abstractsyntax.Pdeclarator(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.i_d, edu.umn.cs.melt.ableC.concretesyntax.Init.edu_umn_cs_melt_ableC_concretesyntax_declaredIdent__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0.i_d, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Declarator_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NMaybeInitializer)new edu.umn.cs.melt.ableC.abstractsyntax.PnothingInitializer()); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_gcc_extsDeclarations_sv_148_0(children[0], children[1], children[2], annotations[0]);
		}
	};

}
