
package core;

public final class PcontainsBy extends common.FunctionNode {

	public static final int i_eq = 0;
	public static final int i_elem = 1;
	public static final int i_lst = 2;


	public static final Class<?> childTypes[] = { common.NodeFactory.class,Object.class,common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__core_containsBy;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PcontainsBy(final Object c_eq, final Object c_elem, final Object c_lst) {
		this.child_eq = c_eq;
		this.child_elem = c_elem;
		this.child_lst = c_lst;

	}

	private Object child_eq;
	public final common.NodeFactory<Boolean> getChild_eq() {
		return (common.NodeFactory<Boolean>) (child_eq = common.Util.demand(child_eq));
	}

	private Object child_elem;
	public final Object getChild_elem() {
		return (Object) (child_elem = common.Util.demand(child_elem));
	}

	private Object child_lst;
	public final common.ConsCell getChild_lst() {
		return (common.ConsCell) (child_lst = common.Util.demand(child_lst));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_eq: return getChild_eq();
			case i_elem: return getChild_elem();
			case i_lst: return getChild_lst();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_eq: return child_eq;
			case i_elem: return child_elem;
			case i_lst: return child_lst;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 3;
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
		return "core:containsBy";
	}

	public static Boolean invoke(final Object c_eq, final Object c_elem, final Object c_lst) {
		try {
		final common.DecoratedNode context = new PcontainsBy(c_eq, c_elem, c_lst).decorate();
		//(! null(lst,)) && (eq(elem, head(lst,),) || containsBy(eq, elem, tail(lst,),))
		return (Boolean)(((!((Boolean)core.Pnull.invoke(context.childAsIsLazy(core.PcontainsBy.i_lst)))) && (((Boolean)((common.NodeFactory<Boolean>)context.childAsIs(core.PcontainsBy.i_eq)).invoke(new Object[]{context.childAsIsLazy(core.PcontainsBy.i_elem), new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Phead.invoke(context.childAsIsLazy(core.PcontainsBy.i_lst))); } }}, null)) || ((Boolean)core.PcontainsBy.invoke(context.childAsIsLazy(core.PcontainsBy.i_eq), context.childAsIsLazy(core.PcontainsBy.i_elem), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(context.childAsIsLazy(core.PcontainsBy.i_lst))); } })))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function core:containsBy", t);
		}
	}

	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {
		@Override
		public Boolean invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PcontainsBy.invoke(children[0], children[1], children[2]);
		}
	};
}