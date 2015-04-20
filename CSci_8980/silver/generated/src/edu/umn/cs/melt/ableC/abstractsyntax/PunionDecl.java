
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::UnionDecl ::= name::MaybeName dcls::StructItemList 
public final class PunionDecl extends edu.umn.cs.melt.ableC.abstractsyntax.NUnionDecl {

	public static final int i_name = 0;
	public static final int i_dcls = 1;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.class,edu.umn.cs.melt.ableC.abstractsyntax.NStructItemList.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_unionDecl;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NUnionDecl.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NUnionDecl.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_name] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.num_inh_attrs];
	childInheritedAttributes[i_dcls] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NStructItemList.num_inh_attrs];

	}

	public PunionDecl(final Object c_name, final Object c_dcls) {
		super();
		this.child_name = c_name;
		this.child_dcls = c_dcls;

	}

	private Object child_name;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName getChild_name() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName) (child_name = common.Util.demand(child_name));
	}

	private Object child_dcls;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NStructItemList getChild_dcls() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NStructItemList) (child_dcls = common.Util.demand(child_dcls));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_name: return getChild_name();
			case i_dcls: return getChild_dcls();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_name: return child_name;
			case i_dcls: return child_dcls;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:unionDecl erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:unionDecl";
	}

	static void initProductionAttributeDefinitions() {
		// top.maybename = name.maybename
		edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)); } };
		// top.pp = concat([ text("union",), space(,), name.pp, space(,), text("{",), nestlines(2, terminate(cat(semi(,), line(,),), dcls.pps,),), text("}",) ],)
		edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pconcat.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("union")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_name, edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pspace.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("{")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pnestlines.invoke(Integer.valueOf((int)2), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Pterminate.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)silver.langutil.pp.Psemi.invoke()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pline()); } })); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructItemList))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("}")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } })); } })); } })); } })); } })); } })); } };
		// top.errors := dcls.errors
		if(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_dcls).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructItemList)); } });
		// thisdcl = case name.maybename of just(n) -> [ tagDef(n.name, unionTagItem(top,),) ] | _ -> [] end
		edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.thisdcl__ON__edu_umn_cs_melt_ableC_abstractsyntax_unionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL___fail_1262 = new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } };
return new common.PatternLazy<common.DecoratedNode, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_pv_1266_n = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (common.ConsCell)((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_n = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL___sv_pv_1266_n.eval())); } };
return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NDef)new edu.umn.cs.melt.ableC.abstractsyntax.env.PtagDef(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL_n.eval())).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PunionTagItem(context)); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }).eval()); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((common.ConsCell)(__SV_LOCAL___fail_1262.eval()));}}.eval(context, (common.DecoratedNode)((core.NMaybe)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)).decorate(context, (common.Lazy[])null)); } }).eval()); } };
		// top.defs = thisdcl ++ dcls.defs
		edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pappend.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.thisdcl__ON__edu_umn_cs_melt_ableC_abstractsyntax_unionDecl), context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructItemList))); } };
		// top.tagEnv = addEnv(dcls.localdefs, emptyEnv(,),)
		edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_tagEnv__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_dcls, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_localdefs__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructItemList), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PemptyEnv.invoke()); } })); } };
		// dcls.env = openScope(addEnv(thisdcl, top.env,),)
		edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.childInheritedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_dcls][edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_StructItemList] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PopenScope.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.DecoratedNode)edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.thisdcl__ON__edu_umn_cs_melt_ableC_abstractsyntax_unionDecl), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl))); } })); } };
		// top.errors <- name.tagRedeclarationCheck
		if(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] == null)
			edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl] = new silver.langutil.CAerrors(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl);
		((common.CollectionAttribute)edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl]).addPiece(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PunionDecl.i_name).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_tagRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName)); } });

	}

	public static final common.NodeFactory<PunionDecl> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PunionDecl> {

		@Override
		public PunionDecl invoke(final Object[] children, final Object[] annotations) {
			return new PunionDecl(children[0], children[1]);
		}
	};

}
