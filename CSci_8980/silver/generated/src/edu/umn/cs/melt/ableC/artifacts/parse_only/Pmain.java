
package edu.umn.cs.melt.ableC.artifacts.parse_only;

public final class Pmain extends common.FunctionNode {

	public static final int i_args = 0;
	public static final int i_io_in = 1;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_artifacts_parse_only_main;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public Pmain(final Object c_args, final Object c_io_in) {
		this.child_args = c_args;
		this.child_io_in = c_io_in;

	}

	private Object child_args;
	public final common.ConsCell getChild_args() {
		return (common.ConsCell) (child_args = common.Util.demand(child_args));
	}

	private Object child_io_in;
	public final Object getChild_io_in() {
		return (Object) (child_io_in = common.Util.demand(child_io_in));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_args: return getChild_args();
			case i_io_in: return getChild_io_in();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_args: return child_args;
			case i_io_in: return child_io_in;

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
		return "edu:umn:cs:melt:ableC:artifacts:parse_only:main";
	}

	public static core.NIOVal invoke(final Object c_args, final Object c_io_in) {
		try {
		final common.DecoratedNode context = new Pmain(c_args, c_io_in).decorate();
		//driver(args, io_in, theParser,)
		return (core.NIOVal)(((core.NIOVal)edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.artifacts.parse_only.Pmain.i_args), context.childAsIsLazy(edu.umn.cs.melt.ableC.artifacts.parse_only.Pmain.i_io_in), edu.umn.cs.melt.ableC.artifacts.parse_only.PtheParser.factory)));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:artifacts:parse_only:main", t);
		}
	}

	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {
		@Override
		public core.NIOVal invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Pmain.invoke(children[0], children[1]);
		}
	};
}