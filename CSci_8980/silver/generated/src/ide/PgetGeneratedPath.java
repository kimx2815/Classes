
package ide;

public final class PgetGeneratedPath extends common.FunctionNode {

	public static final int i_proj = 0;
	public static final int i_i = 1;


	public static final Class<?> childTypes[] = { Object.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_getGeneratedPath;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PgetGeneratedPath(final Object c_proj, final Object c_i) {
		this.child_proj = c_proj;
		this.child_i = c_i;

	}

	private Object child_proj;
	public final Object getChild_proj() {
		return (Object) (child_proj = common.Util.demand(child_proj));
	}

	private Object child_i;
	public final Object getChild_i() {
		return (Object) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_proj: return getChild_proj();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_proj: return child_proj;
			case i_i: return child_i;

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
		return "ide:getGeneratedPath";
	}

	public static core.NIOVal invoke(final Object c_proj, final Object c_i) {
		try {
		return (core.NIOVal)edu.umn.cs.melt.ide.util.ProjectUtil.dispatchService(edu.umn.cs.melt.ide.util.ProjectUtil.PROJECT_GET_GEN_PATH, ((Object)common.Util.demand(c_i)), ((Object)common.Util.demand(c_proj)), null);

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:getGeneratedPath", t);
		}
	}

	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {
		@Override
		public core.NIOVal invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PgetGeneratedPath.invoke(children[0], children[1]);
		}
	};
}