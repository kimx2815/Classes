
package edu.umn.cs.melt.ableC.abstractsyntax;

public final class PfoldParameterDecl extends common.FunctionNode {

	public static final int i_l = 0;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_foldParameterDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PfoldParameterDecl(final Object c_l) {
		this.child_l = c_l;

	}

	private Object child_l;
	public final common.ConsCell getChild_l() {
		return (common.ConsCell) (child_l = common.Util.demand(child_l));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:foldParameterDecl";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.NParameters invoke(final Object c_l) {
		try {
		final common.DecoratedNode context = new PfoldParameterDecl(c_l).decorate();
		//case l of parameterDecl([], directTypeExpr(builtinType([], voidType())), baseTypeExpr(), nothingName())::[] -> nilParameters(,) | _ -> foldr(consParameters, nilParameters(,), l,) end
		return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1552 = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)core.Pfoldr.invoke(edu.umn.cs.melt.ableC.abstractsyntax.PconsParameters.factory, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new edu.umn.cs.melt.ableC.abstractsyntax.PnilParameters()); } }, context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfoldParameterDecl.i_l))); } };
return new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1553 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1554 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1559 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1560 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1561 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(2); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1562 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(3); } };
 return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(scrutinee.nil()) { return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1565 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(0); } };
 return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PbuiltinType) { final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1567 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.ConsCell)scrutinee.childAsIs(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_1568 = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(1); } };
 return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(scrutinee.nil()) { return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PvoidType) {  return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PbaseTypeExpr) {  return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.DecoratedNode, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PnothingName) {  return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new common.PatternLazy<common.ConsCell, edu.umn.cs.melt.ableC.abstractsyntax.NParameters>() { public final edu.umn.cs.melt.ableC.abstractsyntax.NParameters eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(scrutinee.nil()) { return (edu.umn.cs.melt.ableC.abstractsyntax.NParameters)((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new edu.umn.cs.melt.ableC.abstractsyntax.PnilParameters()); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_1554.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.DecoratedNode)((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_1562.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.DecoratedNode)((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_1561.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.DecoratedNode)((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_1568.eval()))); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_1567.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.DecoratedNode)((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_1565.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.DecoratedNode)((common.DecoratedNode)(__SV_LOCAL___sv_tmp_pv_1560.eval()))); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_1559.eval()))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.DecoratedNode)((edu.umn.cs.melt.ableC.abstractsyntax.NParameterDecl)(__SV_LOCAL___sv_tmp_pv_1553.eval())).decorate(context, (common.Lazy[])null)); }return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)(__SV_LOCAL___fail_1552.eval()));}}.eval(context, (common.ConsCell)((common.ConsCell)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.PfoldParameterDecl.i_l))); } }).eval()));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:abstractsyntax:foldParameterDecl", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NParameters> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NParameters> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.NParameters invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PfoldParameterDecl.invoke(children[0]);
		}
	};
}