
package ide;

public final class PmoveTo extends common.FunctionNode {

	public static final int i_res = 0;
	public static final int i_path = 1;
	public static final int i_i = 2;


	public static final Class<?> childTypes[] = { Object.class,common.StringCatter.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_moveTo;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PmoveTo(final Object c_res, final Object c_path, final Object c_i) {
		this.child_res = c_res;
		this.child_path = c_path;
		this.child_i = c_i;

	}

	private Object child_res;
	public final Object getChild_res() {
		return (Object) (child_res = common.Util.demand(child_res));
	}

	private Object child_path;
	public final common.StringCatter getChild_path() {
		return (common.StringCatter) (child_path = common.Util.demand(child_path));
	}

	private Object child_i;
	public final Object getChild_i() {
		return (Object) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_res: return getChild_res();
			case i_path: return getChild_path();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_res: return child_res;
			case i_path: return child_path;
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
		return "ide:moveTo";
	}

	public static core.NIOVal invoke(final Object c_res, final Object c_path, final Object c_i) {
		try {
		return (core.NIOVal)edu.umn.cs.melt.ide.util.ProjectUtil.dispatchService(edu.umn.cs.melt.ide.util.ProjectUtil.RESOURCE_MOVE_TO, ((Object)common.Util.demand(c_i)), ((Object)common.Util.demand(c_res)), ((common.StringCatter)common.Util.demand(c_path)));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:moveTo", t);
		}
	}

	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {
		@Override
		public core.NIOVal invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PmoveTo.invoke(children[0], children[1], children[2]);
		}
	};
}