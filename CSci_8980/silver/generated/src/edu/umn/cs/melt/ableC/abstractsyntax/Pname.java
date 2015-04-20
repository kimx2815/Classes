
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::Name ::= n::String 
public final class Pname extends edu.umn.cs.melt.ableC.abstractsyntax.NName {

	public static final int i_n = 0;


	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_name;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NName.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public Pname(final Object c_n, final Object a_core_location) {
		super(a_core_location);
		this.child_n = c_n;

	}

	private Object child_n;
	public final common.StringCatter getChild_n() {
		return (common.StringCatter) (child_n = common.Util.demand(child_n));
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:name erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:name";
	}

	static void initProductionAttributeDefinitions() {
		// top.name = n
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n)); } };
		// top.pp = text(n,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n))); } };
		// valdcls = lookupValueInLocalScope(n, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.valdcls__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupValueInLocalScope.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))); } };
		// top.valueRedeclarationCheck = case valdcls of [] -> [] | v::_ -> [ err(top.location, "Redeclaration of " ++ n,) ] end
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_pv_750_v = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_751 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((common.ConsCell)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_v = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem)(__SV_LOCAL___sv_pv_750_v.eval())); } };
return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.undecorate()).getAnno_core_location()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Redeclaration of ")), (common.StringCatter)((common.StringCatter)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }).eval()); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Pnil.invoke()); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 28, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.valdcls__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))); } };
		// labdcls = lookupLabelInLocalScope(n, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.labdcls__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupLabelInLocalScope.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))); } };
		// top.labelRedeclarationCheck = case labdcls of [] -> error("Internal error: expected to find label in function scope, was missing.",) | _::[] -> [] | _::_::_ -> [ err(top.location, "Redeclaration of " ++ n,) ] end
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_labelRedeclarationCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_764 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_763 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_765 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_766 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.undecorate()).getAnno_core_location()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Redeclaration of ")), (common.StringCatter)((common.StringCatter)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Pnil.invoke()); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 35, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)(__SV_LOCAL___sv_tmp_pv_763.eval()))); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Perror.invoke((new common.StringCatter("Internal error: expected to find label in function scope, was missing.")))); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 35, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.labdcls__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))); } };
		// values = lookupValue(n, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.values__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupValue.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))); } };
		// tags = lookupTag(n, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupTag.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))); } };
		// labels = lookupLabel(n, top.env,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.labels__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)edu.umn.cs.melt.ableC.abstractsyntax.env.PlookupLabel.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n), context.contextInheritedLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name))); } };
		// top.valueLookupCheck = case values of [] -> [ err(top.location, "Undeclared " ++ n,) ] | _::_ -> [] end
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueLookupCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_782 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_783 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((common.ConsCell)core.Pnil.invoke()); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.undecorate()).getAnno_core_location()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Undeclared ")), (common.StringCatter)((common.StringCatter)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 45, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.values__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))); } };
		// top.labelLookupCheck = case labels of [] -> [ err(top.location, "Undeclared " ++ n,) ] | _::_ -> [] end
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_labelLookupCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_789 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_790 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((common.ConsCell)core.Pnil.invoke()); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.undecorate()).getAnno_core_location()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Undeclared ")), (common.StringCatter)((common.StringCatter)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 50, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.labels__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))); } };
		// top.tagLookupCheck = case tags of [] -> [ err(top.location, "Undeclared " ++ n,) ] | _::_ -> [] end
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_tagLookupCheck__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.ConsCell, common.ConsCell>() { public final common.ConsCell eval(final common.DecoratedNode context, common.ConsCell scrutineeIter) {final common.ConsCell scrutinee = scrutineeIter; if(!scrutineeIter.nil()) {final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_799 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.head(); } };
final common.Thunk<Object> __SV_LOCAL___sv_tmp_pv_800 = new common.Thunk<Object>(context) { public final Object doEval() { return scrutinee.tail(); } };
return ((common.ConsCell)core.Pnil.invoke()); }
else if(scrutinee.nil()) { return (common.ConsCell)((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Perr(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.abstractsyntax.NName)context.undecorate()).getAnno_core_location()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Undeclared ")), (common.StringCatter)((common.StringCatter)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Pname.i_n))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); }return ((common.ConsCell)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Name.sv', 55, 4\n"))));}}.eval(context, (common.ConsCell)((common.ConsCell)context.localAsIs(edu.umn.cs.melt.ableC.abstractsyntax.Init.tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))); } };
		// value = if null(values,) then errorValueItem(,) else head(values,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.value__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)core.Pnull.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.values__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PerrorValueItem()) : ((edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem)core.Phead.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.values__ON__edu_umn_cs_melt_ableC_abstractsyntax_name)))); } };
		// tag = if null(tags,) then errorTagItem(,) else head(tags,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.tag__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)core.Pnull.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PerrorTagItem()) : ((edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem)core.Phead.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_name)))); } };
		// label = if null(labels,) then errorLabelItem(,) else head(labels,)
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.localAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.label__ON__edu_umn_cs_melt_ableC_abstractsyntax_name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)core.Pnull.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.labels__ON__edu_umn_cs_melt_ableC_abstractsyntax_name))) ? ((edu.umn.cs.melt.ableC.abstractsyntax.env.NLabelItem)new edu.umn.cs.melt.ableC.abstractsyntax.env.PerrorLabelItem()) : ((edu.umn.cs.melt.ableC.abstractsyntax.env.NLabelItem)core.Phead.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.Init.labels__ON__edu_umn_cs_melt_ableC_abstractsyntax_name)))); } };
		// top.valueItem = value
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_valueItem__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.localDecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.value__ON__edu_umn_cs_melt_ableC_abstractsyntax_name); } };
		// top.tagItem = tag
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_tagItem__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.localDecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.tag__ON__edu_umn_cs_melt_ableC_abstractsyntax_name); } };
		// top.labelItem = label
		edu.umn.cs.melt.ableC.abstractsyntax.Pname.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_labelItem__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return context.localDecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.label__ON__edu_umn_cs_melt_ableC_abstractsyntax_name); } };

	}

	public static final common.NodeFactory<Pname> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Pname> {

		@Override
		public Pname invoke(final Object[] children, final Object[] annotations) {
			return new Pname(children[0], annotations[0]);
		}
	};

}
