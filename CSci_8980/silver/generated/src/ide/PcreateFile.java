
package ide;

public final class PcreateFile extends common.FunctionNode {

	public static final int i_proj = 0;
	public static final int i_path = 1;
	public static final int i_input = 2;
	public static final int i_i = 3;


	public static final Class<?> childTypes[] = { Object.class,common.StringCatter.class,common.StringCatter.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_createFile;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PcreateFile(final Object c_proj, final Object c_path, final Object c_input, final Object c_i) {
		this.child_proj = c_proj;
		this.child_path = c_path;
		this.child_input = c_input;
		this.child_i = c_i;

	}

	private Object child_proj;
	public final Object getChild_proj() {
		return (Object) (child_proj = common.Util.demand(child_proj));
	}

	private Object child_path;
	public final common.StringCatter getChild_path() {
		return (common.StringCatter) (child_path = common.Util.demand(child_path));
	}

	private Object child_input;
	public final common.StringCatter getChild_input() {
		return (common.StringCatter) (child_input = common.Util.demand(child_input));
	}

	private Object child_i;
	public final Object getChild_i() {
		return (Object) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_proj: return getChild_proj();
			case i_path: return getChild_path();
			case i_input: return getChild_input();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_proj: return child_proj;
			case i_path: return child_path;
			case i_input: return child_input;
			case i_i: return child_i;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		return "ide:createFile";
	}

	public static core.NIOVal invoke(final Object c_proj, final Object c_path, final Object c_input, final Object c_i) {
		try {
		return (core.NIOVal)edu.umn.cs.melt.ide.util.ProjectUtil.dispatchService(edu.umn.cs.melt.ide.util.ProjectUtil.RESOURCE_CREATE_FILE, ((Object)common.Util.demand(c_i)), ((Object)common.Util.demand(c_proj)), new Object[]{((common.StringCatter)common.Util.demand(c_path)), ((common.StringCatter)common.Util.demand(c_input))});

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:createFile", t);
		}
	}

	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {
		@Override
		public core.NIOVal invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PcreateFile.invoke(children[0], children[1], children[2], children[3]);
		}
	};
}