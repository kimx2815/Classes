
package edu.umn.cs.melt.ableC.concretesyntax;

public final class PaddIdentsToScope extends common.FunctionNode {

	public static final int i_l = 0;
	public static final int i_context = 1;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class,common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_addIdentsToScope;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PaddIdentsToScope(final Object c_l, final Object c_context) {
		this.child_l = c_l;
		this.child_context = c_context;

	}

	private Object child_l;
	public final common.ConsCell getChild_l() {
		return (common.ConsCell) (child_l = common.Util.demand(child_l));
	}

	private Object child_context;
	public final common.ConsCell getChild_context() {
		return (common.ConsCell) (child_context = common.Util.demand(child_context));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();
			case i_context: return getChild_context();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;
			case i_context: return child_context;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		return "edu:umn:cs:melt:ableC:concretesyntax:addIdentsToScope";
	}

	public static common.ConsCell invoke(final Object c_l, final Object c_context) {
		try {
		final common.DecoratedNode context = new PaddIdentsToScope(c_l, c_context).decorate();
		//((map(pair(_, identType,), map((.ast:name), l,),) ++ head(context,)) :: tail(context,))
		return (common.ConsCell)(((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return core.Ppair.factory.invokePartial(new int[]{1}, new Object[]{edu.umn.cs.melt.ableC.concretesyntax.Init.identType}); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pmap.invoke(new common.AttributeSection.Undecorated(edu.umn.cs.melt.ableC.abstractsyntax.Init.edu_umn_cs_melt_ableC_abstractsyntax_name__ON__edu_umn_cs_melt_ableC_abstractsyntax_Name), context.childAsIsLazy(edu.umn.cs.melt.ableC.concretesyntax.PaddIdentsToScope.i_l))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Phead.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.concretesyntax.PaddIdentsToScope.i_context))); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.concretesyntax.PaddIdentsToScope.i_context))); } })));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:concretesyntax:addIdentsToScope", t);
		}
	}

	public static final common.NodeFactory<common.ConsCell> factory = new Factory();

	public static final class Factory extends common.NodeFactory<common.ConsCell> {
		@Override
		public common.ConsCell invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PaddIdentsToScope.invoke(children[0], children[1]);
		}
	};
}