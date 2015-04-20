
package edu.umn.cs.melt.ableC.drivers.parseOnly;

public final class Pdriver extends common.FunctionNode {

	public static final int i_args = 0;
	public static final int i_io_in = 1;
	public static final int i_the_parser = 2;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class,Object.class,common.NodeFactory.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public Pdriver(final Object c_args, final Object c_io_in, final Object c_the_parser) {
		this.child_args = c_args;
		this.child_io_in = c_io_in;
		this.child_the_parser = c_the_parser;

	}

	private Object child_args;
	public final common.ConsCell getChild_args() {
		return (common.ConsCell) (child_args = common.Util.demand(child_args));
	}

	private Object child_io_in;
	public final Object getChild_io_in() {
		return (Object) (child_io_in = common.Util.demand(child_io_in));
	}

	private Object child_the_parser;
	public final common.NodeFactory<core.NParseResult> getChild_the_parser() {
		return (common.NodeFactory<core.NParseResult>) (child_the_parser = common.Util.demand(child_the_parser));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_args: return getChild_args();
			case i_io_in: return getChild_io_in();
			case i_the_parser: return getChild_the_parser();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_args: return child_args;
			case i_io_in: return child_io_in;
			case i_the_parser: return child_the_parser;

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
		return "edu:umn:cs:melt:ableC:drivers:parseOnly:driver";
	}

	public static core.NIOVal invoke(final Object c_args, final Object c_io_in, final Object c_the_parser) {
		try {
		final common.DecoratedNode context = new Pdriver(c_args, c_io_in, c_the_parser).decorate();
		//if ! isF.iovalue then ioval(print("File \"" ++ fileName ++ "\" not found.\n\n", isF.io,), 1,) else if ! result.parseSuccess then ioval(print("File had parse errors:\n" ++ result.parseErrors ++ "\n\n", isF.io,), 2,) else ioval(print("File successfully parsed.\n\n", isF.io,), 0,)
		return (core.NIOVal)(((!((Boolean)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_iovalue__ON__core_IOVal))) ? ((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Pprint.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("File \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver)), (common.StringCatter)(new common.StringCatter("\" not found.\n\n")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } }, Integer.valueOf((int)1))) : ((!((Boolean)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_parseSuccess__ON__core_ParseResult))) ? ((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Pprint.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("File had parse errors:\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_parseErrors__ON__core_ParseResult)), (common.StringCatter)(new common.StringCatter("\n\n")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } }, Integer.valueOf((int)2))) : ((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Pprint.invoke((new common.StringCatter("File successfully parsed.\n\n")), new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } }, Integer.valueOf((int)0))))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:drivers:parseOnly:driver", t);
		}
	}

	public static final common.NodeFactory<core.NIOVal> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NIOVal> {
		@Override
		public core.NIOVal invoke(final Object[] children, final Object[] namedNotApplicable) {
			return Pdriver.invoke(children[0], children[1], children[2]);
		}
	};
}