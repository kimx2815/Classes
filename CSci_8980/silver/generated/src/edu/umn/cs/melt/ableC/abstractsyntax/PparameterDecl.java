
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::ParameterDecl ::= storage::[StorageClass] bty::BaseTypeExpr mty::TypeModifierExpr name::MaybeName 
public final class PparameterDecl extends edu.umn.cs.melt.ableC.abstractsyntax.NParameterDecl {

	public static final int i_storage = 0;
	public static final int i_bty = 1;
	public static final int i_mty = 2;
	public static final int i_name = 3;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_parameterDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NParameterDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NParameterDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_bty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];
	childInheritedAttributes[i_mty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];
	childInheritedAttributes[i_name] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.num_inh_attrs];

	}

	public PparameterDecl(final Object c_storage, final Object c_bty, final Object c_mty, final Object c_name) {
		super();
		this.child_storage = c_storage;
		this.child_bty = c_bty;
		this.child_mty = c_mty;
		this.child_name = c_name;

	}

	private Object child_storage;
	public final common.ConsCell getChild_storage() {
		return (common.ConsCell) (child_storage = common.Util.demand(child_storage));
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
	public final edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName getChild_name() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName) (child_name = common.Util.demand(child_name));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_storage: return getChild_storage();
			case i_bty: return getChild_bty();
			case i_mty: return getChild_mty();
			case i_name: return getChild_name();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_storage: return child_storage;
			case i_bty: return child_bty;
			case i_mty: return child_mty;
			case i_name: return child_name;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:parameterDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:parameterDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = concat([ terminate(space(,), map((.pp), storage,),), bty.pp, space(,), mty.lpp, space(,), name.pp, mty.rpp ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_StorageClass), context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_storage))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } })); } })); } };
		// top.paramname = name.maybename
		edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_paramname__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)); } };
		// top.typerep = mty.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_mty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr)); } };
		// mty.baseType = bty.typerep
		edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_mty][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_baseType__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_bty).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_typerep__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr)); } };
		// top.errors := bty.errors ++ mty.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_mty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr))); } });
		// top.defs = bty.defs ++ case name.maybename of just(n) -> [ valueDef(n.name, parameterValueItem(top,),) ] | _ -> [] end
		edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_bty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_BaseTypeExpr), new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1211 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_pv_1215_n = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (common.ConsCell)((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_n = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL___sv_pv_1215_n.eval())); } };
return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NDef)new edu.umn.cs.melt.ableC.abstractsyntax.env.PvalueDef(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL_n.eval())).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PparameterValueItem(context)); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_1211.eval()));}}.eval(context, (common.DecoratedNode)((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)).decorate(context, (common.Lazy[])null)); } })); } };
		// top.errors <- name.valueRedeclarationCheck
		if(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_ParameterDecl]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PparameterDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)); } });

	}

	public static final common.NodeFactory<PparameterDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PparameterDecl> {

		@Override
		public PparameterDecl invoke(final Object[] children, final Object[] annotations) {
			return new PparameterDecl(children[0], children[1], children[2], children[3]);
		}
	};

}
