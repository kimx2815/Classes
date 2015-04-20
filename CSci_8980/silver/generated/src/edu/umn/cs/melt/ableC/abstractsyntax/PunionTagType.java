
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::TagType ::= ref::Decorated UnionDecl 
public final class PunionTagType extends edu.umn.cs.melt.ableC.abstractsyntax.NTagType {

	public static final int i_ref = 0;


	public static final Class<?> childTypes[] = {common.DecoratedNode.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_unionTagType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTagType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTagType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PunionTagType(final Object c_ref) {
		super();
		this.child_ref = c_ref;

	}

	private Object child_ref;
	public final common.DecoratedNode getChild_ref() {
		return (common.DecoratedNode) (child_ref = common.Util.demand(child_ref));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_ref: return getChild_ref();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_ref: return child_ref;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:unionTagType erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:unionTagType";
	}

	static void initProductionAttributeDefinitions() {
		// top.pp = case ref.maybename of just(n) -> cat(text("union ",), n.pp,) | nothing() -> text("<anon struct>",) end
		edu.umn.cs.melt.ableC.abstractsyntax.PunionTagType.synthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_TagType] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.PatternLazy<common.DecoratedNode, silver.langutil.pp.NDocument>() { public final silver.langutil.pp.NDocument eval(final common.DecoratedNode context, common.DecoratedNode scrutineeIter) {while(true) {final common.DecoratedNode scrutinee = scrutineeIter; final common.Node scrutineeNode = scrutinee.undecorate(); if(scrutineeNode instanceof core.Pjust) { final common.Thunk<Object> __SV_LOCAL___sv_pv_336_n = new common.Thunk<Object>(context) { public final Object doEval() { return (Object)scrutinee.childAsIs(0); } };
 return (silver.langutil.pp.NDocument)((silver.langutil.pp.NDocument)(new common.Thunk<Object>(context) { public final Object doEval() { final common.Thunk<Object> __SV_LOCAL_n = new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL___sv_pv_336_n.eval())); } };
return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Pcat(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("union ")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)((edu.umn.cs.melt.ableC.abstractsyntax.NName)(__SV_LOCAL_n.eval())).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name)); } })); } }).eval()); }
else if(scrutineeNode instanceof core.Pnothing) {  return (silver.langutil.pp.NDocument)((silver.langutil.pp.NDocument)new silver.langutil.pp.Ptext((new common.StringCatter("<anon struct>")))); }if(!scrutineeIter.undecorate().hasForward()) break;scrutineeIter = scrutineeIter.forward();}return ((silver.langutil.pp.NDocument)core.Perror.invoke((new common.StringCatter("Error: pattern match failed at edu:umn:cs:melt:ableC:abstractsyntax 'Types.sv', 187, 4\n"))));}}.eval(context, (common.DecoratedNode)((core.NMaybe)((common.DecoratedNode)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.PunionTagType.i_ref)).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_maybename__ON__edu_umn_cs_melt_ableC_abstractsyntax_UnionDecl)).decorate(context, (common.Lazy[])null)); } };

	}

	public static final common.NodeFactory<PunionTagType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PunionTagType> {

		@Override
		public PunionTagType invoke(final Object[] children, final Object[] annotations) {
			return new PunionTagType(children[0]);
		}
	};

}
