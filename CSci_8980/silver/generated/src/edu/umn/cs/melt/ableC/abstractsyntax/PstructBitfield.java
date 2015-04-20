
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::StructDeclarator ::= name::MaybeName ty::TypeModifierExpr e::Expr 
public final class PstructBitfield extends edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator {

	public static final int i_name = 0;
	public static final int i_ty = 1;
	public static final int i_e = 2;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.class,edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.class,edu.umn.cs.melt.ableC.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_structBitfield;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructDeclarator.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_name] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.num_inh_attrs];
	childInheritedAttributes[i_ty] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr.num_inh_attrs];
	childInheritedAttributes[i_e] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NExpr.num_inh_attrs];

	}

	public PstructBitfield(final Object c_name, final Object c_ty, final Object c_e) {
		super();
		this.child_name = c_name;
		this.child_ty = c_ty;
		this.child_e = c_e;

	}

	private Object child_name;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName getChild_name() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName) (child_name = common.Util.demand(child_name));
	}

	private Object child_ty;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr getChild_ty() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr) (child_ty = common.Util.demand(child_ty));
	}

	private Object child_e;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NExpr getChild_e() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NExpr) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_name: return getChild_name();
			case i_ty: return getChild_ty();
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_name: return child_name;
			case i_ty: return child_ty;
			case i_e: return child_e;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:structBitfield erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:structBitfield";
	}

	static void initProductionAttributeDefinitions() {
		// top.pps = [ concat([ ty.lpp, name.pp, ty.rpp, text(" : ",), e.pp ],) ]
		edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_lpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_rpp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter(" : ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } };
		// top.errors := ty.errors ++ e.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_ty, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_TypeModifierExpr), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_e, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_Expr))); } });
		// thisdcl = case name.maybename of just(n) -> [ valueDef(n.name, fieldValueItem(top,),) ] | _ -> [] end
		edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.thisdcl__ON__edu_umn_cs_melt_ableC_abstractsyntax_structBitfield] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1378 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_pv_1383_n = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (common.ConsCell)((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_n = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL___sv_pv_1383_n.eval())); } };
return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NDef)new edu.umn.cs.melt.ableC.abstractsyntax.env.PvalueDef(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL_n.eval())).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PfieldValueItem(context)); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_1378.eval()));}}.eval(context, (common.DecoratedNode)((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)).decorate(context, (common.Lazy[])null)); } }).eval()); } };
		// top.localdefs = thisdcl
		edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.thisdcl__ON__edu_umn_cs_melt_ableC_abstractsyntax_structBitfield)); } };
		// top.errors <- name.valueRedeclarationCheck
		if(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructDeclarator]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PstructBitfield.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)); } });

	}

	public static final common.NodeFactory<PstructBitfield> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PstructBitfield> {

		@Override
		public PstructBitfield invoke(final Object[] children, final Object[] annotations) {
			return new PstructBitfield(children[0], children[1], children[2]);
		}
	};

}
