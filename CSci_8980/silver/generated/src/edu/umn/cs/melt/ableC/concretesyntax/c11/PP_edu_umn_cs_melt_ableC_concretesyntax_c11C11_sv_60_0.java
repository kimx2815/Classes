
package edu.umn.cs.melt.ableC.concretesyntax.c11;

// top::GenericSelection_c ::= '_Generic' '(' e::AssignExpr_c ',' l::GenericAssocList_c ')' 
public final class PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0 extends edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c {

	public static final int i__G_5 = 0;
	public static final int i__G_4 = 1;
	public static final int i_e = 2;
	public static final int i__G_2 = 3;
	public static final int i_l = 4;
	public static final int i__G_0 = 5;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c.class,common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[6][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c.num_inh_attrs];
	childInheritedAttributes[i_l] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c.num_inh_attrs];

	}

	public PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0(final Object c__G_5, final Object c__G_4, final Object c_e, final Object c__G_2, final Object c_l, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_5 = c__G_5;
		this.child__G_4 = c__G_4;
		this.child_e = c_e;
		this.child__G_2 = c__G_2;
		this.child_l = c_l;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_5;
	public final common.TerminalRecord getChild__G_5() {
		return (common.TerminalRecord) (child__G_5 = common.Util.demand(child__G_5));
	}

	private Object child__G_4;
	public final common.TerminalRecord getChild__G_4() {
		return (common.TerminalRecord) (child__G_4 = common.Util.demand(child__G_4));
	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c getChild_e() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NAssignExpr_c) (child_e = common.Util.demand(child_e));
	}

	private Object child__G_2;
	public final common.TerminalRecord getChild__G_2() {
		return (common.TerminalRecord) (child__G_2 = common.Util.demand(child__G_2));
	}

	private Object child_l;
	public final edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c getChild_l() {
		return (edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c) (child_l = common.Util.demand(child_l));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_5: return getChild__G_5();
			case i__G_4: return getChild__G_4();
			case i_e: return getChild_e();
			case i__G_2: return getChild__G_2();
			case i_l: return getChild_l();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_5: return child__G_5;
			case i__G_4: return child__G_4;
			case i_e: return child_e;
			case i__G_2: return child__G_2;
			case i_l: return child_l;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 6;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:c11:P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0 erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:c11:P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = case l.defaultExpr of [] -> ast:genericSelectionExpr(e.ast, ast:foldGenericAssoc(l.ast,), ast:nothingExpr(,),location=top.location) | de::[] -> ast:genericSelectionExpr(e.ast, ast:foldGenericAssoc(l.ast,), ast:justExpr(de,),location=top.location) | de1::de2::_ -> ast:genericSelectionExpr(e.ast, ast:foldGenericAssoc(l.ast,), ast:justExpr(ast:errorExpr([ err(de1.location, "Multiple default associations in generic selection expression",) ],location=top.location),),location=top.location) end
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericSelection_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NExpr>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_pv_1797_de = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1796 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NExpr>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_pv_1798_de2 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1799 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_de2 = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(__SV_LOCAL___sv_pv_1798_de2.eval())); } };
return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_de1 = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(__SV_LOCAL___sv_pv_1797_de.eval())); } };
return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_e, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AssignExpr_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs)edu.umn.cs.melt.ableC.abstractsyntax.PfoldGenericAssoc.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_l, edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PjustExpr(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PerrorExpr(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(__SV_LOCAL_de1.eval())).getAnno_core_location()); } }, (new common.StringCatter("Multiple default associations in generic selection expression")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c)context.undecorate()).getAnno_core_location()); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c)context.undecorate()).getAnno_core_location()); } })); } }).eval()); } }).eval()); }
else if(scrutinee.nil()) { return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr)((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_de = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)(__SV_LOCAL___sv_pv_1797_de.eval())); } };
return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_e, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AssignExpr_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs)edu.umn.cs.melt.ableC.abstractsyntax.PfoldGenericAssoc.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_l, edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PjustExpr(__SV_LOCAL_de)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c)context.undecorate()).getAnno_core_location()); } })); } }).eval()); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:concretesyntax:c11 'C11.sv', 62, 8\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_1796.eval()))); }
else if(scrutinee.nil()) { return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr)((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)new edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_e, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_AssignExpr_c), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs)edu.umn.cs.melt.ableC.abstractsyntax.PfoldGenericAssoc.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_l, edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NMaybeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PnothingExpr()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c)context.undecorate()).getAnno_core_location()); } })); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NExpr)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:concretesyntax:c11 'C11.sv', 62, 8\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.i_l).synthesized(edu.umn.cs.melt.ableC.concretesyntax.c11.Init.edu_umn_cs_melt_ableC_concretesyntax_c11_defaultExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c))); } };

	}

	public static final common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0> {

		@Override
		public PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0(children[0], children[1], children[2], children[3], children[4], children[5], annotations[0]);
		}
	};

}
