
package edu.umn.cs.melt.ableC.abstractsyntax;

public final class PfigureOutTypeFromSpecifiers extends common.FunctionNode {

	public static final int i_l = 0;
	public static final int i_q = 1;
	public static final int i_pre_ts = 2;
	public static final int i_real_ts = 3;
	public static final int i_mod = 4;


	public static final Class<?> childTypes[] = { core.NLocation.class,common.DecoratedNode.class,common.DecoratedNode.class,common.DecoratedNode.class,common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_figureOutTypeFromSpecifiers;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[5][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_l] = new common.Lazy[core.NLocation.num_inh_attrs];

	}

	public PfigureOutTypeFromSpecifiers(final Object c_l, final Object c_q, final Object c_pre_ts, final Object c_real_ts, final Object c_mod) {
		this.child_l = c_l;
		this.child_q = c_q;
		this.child_pre_ts = c_pre_ts;
		this.child_real_ts = c_real_ts;
		this.child_mod = c_mod;

	}

	private Object child_l;
	public final core.NLocation getChild_l() {
		return (core.NLocation) (child_l = common.Util.demand(child_l));
	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_pre_ts;
	public final common.ConsCell getChild_pre_ts() {
		return (common.ConsCell) (child_pre_ts = common.Util.demand(child_pre_ts));
	}

	private Object child_real_ts;
	public final common.ConsCell getChild_real_ts() {
		return (common.ConsCell) (child_real_ts = common.Util.demand(child_real_ts));
	}

	private Object child_mod;
	public final common.ConsCell getChild_mod() {
		return (common.ConsCell) (child_mod = common.Util.demand(child_mod));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();
			case i_q: return getChild_q();
			case i_pre_ts: return getChild_pre_ts();
			case i_real_ts: return getChild_real_ts();
			case i_mod: return getChild_mod();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;
			case i_q: return child_q;
			case i_pre_ts: return child_pre_ts;
			case i_real_ts: return child_real_ts;
			case i_mod: return child_mod;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 5;
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:figureOutTypeFromSpecifiers";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr invoke(final Object c_l, final Object c_q, final Object c_pre_ts, final Object c_real_ts, final Object c_mod) {
		try {
		final common.DecoratedNode context = new PfigureOutTypeFromSpecifiers(c_l, c_q, c_pre_ts, c_real_ts, c_mod).decorate();
		//if ! null(mod,) then case mod of modifyTypeSpecifier(f)::[] -> f(q, figureOutTypeFromSpecifiers(l, [], pre_ts, real_ts, [],),) | _ -> errorTypeExpr([ err(l, "Multiple type specifiers",) ],) end else if null(pre_ts,) && null(real_ts,) then warnTypeExpr([ wrn(l, "Implicit int type specifier",) ], directTypeExpr(builtinType(q, signedType(intType(,),),),),) else if ! null(pre_ts,) && ! null(real_ts,) then errorTypeExpr([ err(l, "Multiple type specifiers",) ],) else if null(pre_ts,) then if length(real_ts) > 1 then errorTypeExpr([ err(l, "Multiple type specifiers",) ],) else head(real_ts,) else fromMaybe(errorTypeExpr([ err(l, "Unable to interpret type specifiers: " ++ implode(" ", pre_ts,),) ],), interpretTypeSpecifiers(q, sortBy(stringLte, pre_ts,),),)
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(((!((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_mod)))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1421 = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PerrorTypeExpr.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_l)), (new common.StringCatter("Multiple type specifiers")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } };
return new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1422 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1423 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PmodifyTypeSpecifier) { final common.Thunk<Object> __SV_LOCAL___sv_pv_1430_f = new common.Thunk<Object>(context) { public final Object doEval() { return (common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>)scrutinee.childAsIs(0); } };
 return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(scrutinee.nil()) { return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_f = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>)(__SV_LOCAL___sv_pv_1430_f.eval())); } };
return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)((common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>)(__SV_LOCAL_f.eval())).invoke(new Object[]{context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_q), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.invoke(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_l)), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } }, context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_pre_ts), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_real_ts), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }}, null)); } }).eval()); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(__SV_LOCAL___fail_1421.eval()));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_1423.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(__SV_LOCAL___fail_1421.eval()));}}.eval(context, (common.DecoratedNode)((edu.umn.cs.melt.ableC.abstractsyntax.NTypeSpecifierMutator)(__SV_LOCAL___sv_tmp_pv_1422.eval())).decorate(context, (common.Lazy[])null)); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(__SV_LOCAL___fail_1421.eval()));}}.eval(context, (common.ConsCell)((common.ConsCell)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_mod))); } }).eval()) : ((((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_pre_ts))) && ((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_real_ts)))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Pwrn(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_l)), (new common.StringCatter("Implicit int type specifier")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PbuiltinType(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_q), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBuiltinType)new edu.umn.cs.melt.ableC.abstractsyntax.PsignedType(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NIntegerType)new edu.umn.cs.melt.ableC.abstractsyntax.PintType()); } })); } })); } })); } })) : (((!((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_pre_ts)))) && (!((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_real_ts))))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PerrorTypeExpr.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_l)), (new common.StringCatter("Multiple type specifiers")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })) : (((Boolean)core.Pnull.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_pre_ts))) ? ((((Integer)core.PlistLength.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_real_ts))) > Integer.valueOf((int)1)) ? ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PerrorTypeExpr.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_l)), (new common.StringCatter("Multiple type specifiers")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })) : ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)core.Phead.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_real_ts)))) : ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)core.PfromMaybe.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)edu.umn.cs.melt.ableC.abstractsyntax.PerrorTypeExpr.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_l)), new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Unable to interpret type specifiers: ")), (common.StringCatter)((common.StringCatter)core.Pimplode.invoke((new common.StringCatter(" ")), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_pre_ts)))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NMaybe)edu.umn.cs.melt.ableC.abstractsyntax.PinterpretTypeSpecifiers.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_q), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.PsortBy.invoke(core.PstringLte.factory, context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfigureOutTypeFromSpecifiers.i_pre_ts))); } })); } })))))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:abstractsyntax:figureOutTypeFromSpecifiers", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PfigureOutTypeFromSpecifiers.invoke(children[0], children[1], children[2], children[3], children[4]);
		}
	};
}