
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::MaybeName ::= n::Name 
public final class PjustName extends edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName {

	public static final int i_n = 0;


	public static final Class<?> childTypes[] = {edu.umn.cs.melt.ableC.abstractsyntax.NName.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_justName;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NMaybeName.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_n] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_inh_attrs];

	}

	public PjustName(final Object c_n) {
		super();
		this.child_n = c_n;

	}

	private Object child_n;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NName getChild_n() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NName) (child_n = common.Util.demand(child_n));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_n: return getChild_n();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_n: return child_n;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:justName erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:justName";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = n.pp
		edu.umn.cs.melt.ableC.abstractsyntax.PjustName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PjustName.i_n).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } };
		// top.maybename = just(n,)
		edu.umn.cs.melt.ableC.abstractsyntax.PjustName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NMaybe)new core.Pjust(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PjustName.i_n)))); } };
		// top.valueRedeclarationCheck = n.valueRedeclarationCheck
		edu.umn.cs.melt.ableC.abstractsyntax.PjustName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PjustName.i_n).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } };
		// tagdcls = lookupTagInLocalScope(n.name, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.PjustName.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.tagdcls__ON__edu_umn_cs_melt_ableC_abstractsyntax_justName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupTagInLocalScope.invoke(context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.abstractsyntax.PjustName.i_n, edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName))); } };
		// top.tagRedeclarationCheck = case tagdcls of [] -> [] | v::_ -> [ err(n.location, "Redeclaration of " ++ n.name,) ] end
		edu.umn.cs.melt.ableC.abstractsyntax.PjustName.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_tagRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_MaybeName] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_pv_815_v = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_816 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_v = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem)(__SV_LOCAL___sv_pv_815_v.eval())); } };
return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PjustName.i_n).undecorate()).getAnno_core_location()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Redeclaration of ")), (common.StringCatter)((common.StringCatter)context.childDecorated(edu.umn.cs.melt.ableC.abstractsyntax.PjustName.i_n).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }).eval()); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Pnil.invoke()); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 83, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.tagdcls__ON__edu_umn_cs_melt_ableC_abstractsyntax_justName))); } };

	}

	public static final common.NodeFactory<PjustName> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PjustName> {

		@Override
		public PjustName invoke(final Object[] children, final Object[] annotations) {
			return new PjustName(children[0]);
		}
	};

}
