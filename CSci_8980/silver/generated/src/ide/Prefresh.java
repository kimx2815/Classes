
package ide;

public final class Prefresh extends common.FunctionNode {

	public static final int i_projectName = 0;
	public static final int i_depth = 1;
	public static final int i_i = 2;


	public static final Class<?> childTypes[] = { common.StringCatter.class,Integer.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_refresh;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public Prefresh(final Object c_projectName, final Object c_depth, final Object c_i) {
		this.child_projectName = c_projectName;
		this.child_depth = c_depth;
		this.child_i = c_i;

	}

	private Object child_projectName;
	public final common.StringCatter getChild_projectName() {
		return (common.StringCatter) (child_projectName = common.Util.demand(child_projectName));
	}

	private Object child_depth;
	public final Integer getChild_depth() {
		return (Integer) (child_depth = common.Util.demand(child_depth));
	}

	private Object child_i;
	public final Object getChild_i() {
		return (Object) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_projectName: return getChild_projectName();
			case i_depth: return getChild_depth();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_projectName: return child_projectName;
			case i_depth: return child_depth;
			case i_i: return child_i;

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
		return "ide:refresh";
	}

	public static Object invoke(final Object c_projectName, final Object c_depth, final Object c_i) {
		try {
		return (Object)common.Util.io(((Object)common.Util.demand(c_i)), edu.umn.cs.melt.ide.util.Util.refresh(((common.StringCatter)common.Util.demand(c_projectName)).toString(), ((Integer)common.Util.demand(c_depth))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:refresh", t);
		}
	}

	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {
		@Override
		public Object invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Prefresh.invoke(children[0], children[1], children[2]);
		}
	};
}