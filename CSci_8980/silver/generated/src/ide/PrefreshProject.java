
package ide;

public final class PrefreshProject extends common.FunctionNode {

	public static final int i_proj = 0;
	public static final int i_depth = 1;
	public static final int i_i = 2;


	public static final Class<?> childTypes[] = { Object.class,Integer.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_refreshProject;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PrefreshProject(final Object c_proj, final Object c_depth, final Object c_i) {
		this.child_proj = c_proj;
		this.child_depth = c_depth;
		this.child_i = c_i;

	}

	private Object child_proj;
	public final Object getChild_proj() {
		return (Object) (child_proj = common.Util.demand(child_proj));
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
			case i_proj: return getChild_proj();
			case i_depth: return getChild_depth();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_proj: return child_proj;
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
		return "ide:refreshProject";
	}

	public static Object invoke(final Object c_proj, final Object c_depth, final Object c_i) {
		try {
		return (Object)edu.umn.cs.melt.ide.util.ProjectUtil.dispatchService(edu.umn.cs.melt.ide.util.ProjectUtil.PROJECT_REFRESH, ((Object)common.Util.demand(c_i)), ((Object)common.Util.demand(c_proj)), ((Integer)common.Util.demand(c_depth)));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:refreshProject", t);
		}
	}

	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {
		@Override
		public Object invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PrefreshProject.invoke(children[0], children[1], children[2]);
		}
	};
}