
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::FunctionDecl ::= storage::[StorageClass] fnquals::[SpecialSpecifier] bty::BaseTypeExpr mty::TypeModifierExpr name::Name decls::Decls body::Stmt 
public final class PfunctionDecl extends edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl {

	public static final int i_storage = 0;
	public static final int i_fnquals = 1;
	public static final int i_bty = 2;
	public static final int i_mty = 3;
	public static final int i_name = 4;
	public static final int i_decls = 5;
	public static final int i_body = 6;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NName.class,edu.umn.cs.melt.ableC.abstractsyntax.NDecls.class,edu.umn.cs.melt.ableC.abstractsyntax.NStmt.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_functionDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NFunctionDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[7][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_bty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];
	childInheritedAttributes[i_mty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];
	childInheritedAttributes[i_name] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_inh_attrs];
	childInheritedAttributes[i_decls] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NDecls.num_inh_attrs];
	childInheritedAttributes[i_body] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStmt.num_inh_attrs];

	}

	public PfunctionDecl(final Object c_storage, final Object c_fnquals, final Object c_bty, final Object c_mty, final Object c_name, final Object c_decls, final Object c_body) {
		super();
		this.child_storage = c_storage;
		this.child_fnquals = c_fnquals;
		this.child_bty = c_bty;
		this.child_mty = c_mty;
		this.child_name = c_name;
		this.child_decls = c_decls;
		this.child_body = c_body;

	}

	private Object child_storage;
	public final common.ConsCell getChild_storage() {
		return (common.ConsCell) (child_storage = common.Util.demand(child_storage));
	}

	private Object child_fnquals;
	public final common.ConsCell getChild_fnquals() {
		return (common.ConsCell) (child_fnquals = common.Util.demand(child_fnquals));
	}

	private Object child_bty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr getChild_bty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr) (child_bty = common.Util.demand(child_bty));
	}

	private Object child_mty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr getChild_mty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr) (child_mty = common.Util.demand(child_mty));
	}

	private Object child_name;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NName getChild_name() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NName) (child_name = common.Util.demand(child_name));
	}

	private Object child_decls;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NDecls getChild_decls() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NDecls) (child_decls = common.Util.demand(child_decls));
	}

	private Object child_body;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NStmt getChild_body() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NStmt) (child_body = common.Util.demand(child_body));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_storage: return getChild_storage();
			case i_fnquals: return getChild_fnquals();
			case i_bty: return getChild_bty();
			case i_mty: return getChild_mty();
			case i_name: return getChild_name();
			case i_decls: return getChild_decls();
			case i_body: return getChild_body();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_storage: return child_storage;
			case i_fnquals: return child_fnquals;
			case i_bty: return child_bty;
			case i_mty: return child_mty;
			case i_name: return child_name;
			case i_decls: return child_decls;
			case i_body: return child_body;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 7;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:functionDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:functionDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ terminate(space(,), map((.pp), storage,),), terminate(space(,), map((.pp), fnquals,),), bty.pp, space(,), mty.lpp, name.pp, mty.rpp, line(,), terminate(cat(semi(,), line(,),), decls.pps,), text("{",), line(,), nestlines(2, body.pp,), text("}",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_StorageClass), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_storage))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_SpecialSpecifier), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_fnquals))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Psemi.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } })); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_decls, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("{")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pnestlines.invoke(Integer.valueOf((int)2), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_body, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Stmt))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("}")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } })); } })); } })); } })); } })); } })); } })); } })); } };
		// parameters = case mty of functionTypeExprWithArgs(result, args, variadic) -> args | _ -> decorate nilParameters(,) with {env = top.env;} end
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.parameters__ON__edu_umn_cs_melt_ableC_abstractsyntax_functionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1142 = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NParameters)new edu.umn.cs.melt.ableC.abstractsyntax.PnilParameters()).decorate(context, common.Util.populateInh(edu.umn.cs.melt.ableC.abstractsyntax.NParameters.num_inh_attrs, new int[]{edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters}, new common.Lazy[]{new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)context.inherited(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl)); } }})); } };
return new common.PatternLazy<common.DecoratedNode, common.DecoratedNode>() { public final common.DecoratedNode eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof edu.umn.cs.melt.ableC.abstractsyntax.PfunctionTypeExprWithArgs) { final common.Thunk<Object> __SV_LOCAL___sv_pv_1146_result = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(0); } };
final common.Thunk<Object> __SV_LOCAL___sv_pv_1147_args = new common.Thunk<Object>(context) { public final Object doEval() { return (common.DecoratedNode)scrutinee.childDecorated(1); } };
final common.Thunk<Object> __SV_LOCAL___sv_pv_1145_variadic = new common.Thunk<Object>(context) { public final Object doEval() { return (Boolean)scrutinee.childAsIs(2); } };
 return (common.DecoratedNode)((common.DecoratedNode)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_variadic = new common.Thunk<Object>(context) { public final Object doEval() { return ((Boolean)(__SV_LOCAL___sv_pv_1145_variadic.eval())); } };
return ((common.DecoratedNode)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_args = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)(__SV_LOCAL___sv_pv_1147_args.eval())); } };
return ((common.DecoratedNode)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_result = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)(__SV_LOCAL___sv_pv_1146_result.eval())); } };
return ((common.DecoratedNode)(__SV_LOCAL_args.eval())); } }).eval()); } }).eval()); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.DecoratedNode)(__SV_LOCAL___fail_1142.eval()));}}.eval(context, (common.DecoratedNode)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_mty)); } }).eval()); } };
		// top.errors := bty.errors ++ mty.errors ++ body.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_body, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Stmt))); } })); } });
		// top.defs = bty.defs ++ [ valueDef(name.name, functionValueItem(top,),) ]
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NDef)new edu.umn.cs.melt.ableC.abstractsyntax.env.PvalueDef(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PfunctionValueItem(context)); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } };
		// body.env = addEnv(top.defs ++ parameters.defs ++ decls.defs ++ body.functiondefs, openScope(addEnv(bty.defs, top.env,),),)
		edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_body][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Stmt] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.contextSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)((common.DecoratedNode)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.parameters__ON__edu_umn_cs_melt_ableC_abstractsyntax_functionDecl)).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Parameters)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_decls, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Decls), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_body, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_functiondefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_Stmt))); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PopenScope.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl))); } })); } })); } };
		// top.errors <- name.valueRedeclarationCheck
		if(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_FunctionDecl]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PfunctionDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } });

	}

	public static final common.NodeFactory<PfunctionDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PfunctionDecl> {

		@Override
		public PfunctionDecl invoke(final Object[] children, final Object[] annotations) {
			return new PfunctionDecl(children[0], children[1], children[2], children[3], children[4], children[5], children[6]);
		}
	};

}
