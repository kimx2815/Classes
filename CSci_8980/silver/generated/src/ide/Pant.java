
package ide;

public final class Pant extends common.FunctionNode {

	public static final int i_buildFile = 0;
	public static final int i_arguments = 1;
	public static final int i_target = 2;
	public static final int i_i = 3;


	public static final Class<?> childTypes[] = { common.StringCatter.class,common.StringCatter.class,common.StringCatter.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_ant;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public Pant(final Object c_buildFile, final Object c_arguments, final Object c_target, final Object c_i) {
		this.child_buildFile = c_buildFile;
		this.child_arguments = c_arguments;
		this.child_target = c_target;
		this.child_i = c_i;

	}

	private Object child_buildFile;
	public final common.StringCatter getChild_buildFile() {
		return (common.StringCatter) (child_buildFile = common.Util.demand(child_buildFile));
	}

	private Object child_arguments;
	public final common.StringCatter getChild_arguments() {
		return (common.StringCatter) (child_arguments = common.Util.demand(child_arguments));
	}

	private Object child_target;
	public final common.StringCatter getChild_target() {
		return (common.StringCatter) (child_target = common.Util.demand(child_target));
	}

	private Object child_i;
	public final Object getChild_i() {
		return (Object) (child_i = common.Util.demand(child_i));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_buildFile: return getChild_buildFile();
			case i_arguments: return getChild_arguments();
			case i_target: return getChild_target();
			case i_i: return getChild_i();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_buildFile: return child_buildFile;
			case i_arguments: return child_arguments;
			case i_target: return child_target;
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
		return "ide:ant";
	}

	public static Object invoke(final Object c_buildFile, final Object c_arguments, final Object c_target, final Object c_i) {
		try {
		return (Object)common.Util.io(((Object)common.Util.demand(c_i)), edu.umn.cs.melt.ide.util.Util.ant(((common.StringCatter)common.Util.demand(c_buildFile)).toString(), ((common.StringCatter)common.Util.demand(c_arguments)).toString(), ((common.StringCatter)common.Util.demand(c_target)).toString()));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:ant", t);
		}
	}

	public static final common.NodeFactory<Object> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Object> {
		@Override
		public Object invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Pant.invoke(children[0], children[1], children[2], children[3]);
		}
	};
}