
package lambda_calculus.artifacts.host;

public final class Pmain extends common.FunctionNode {

	public static final int i_args = 0;
	public static final int i_io_in = 1;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class,Object.class };

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_artifacts_host_main;
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
		return "lambda_calculus:artifacts:host:main";
	}

	public static core.NIOVal invoke(final Object c_args, final Object c_io_in) {
		try {
		final common.DecoratedNode context = new Pmain(c_args, c_io_in).decorate();
		//if ! isF.iovalue then ioval(print("File \"" ++ filename ++ "\" not found.\n\n", isF.io,), 1,) else if ! result.parseSuccess then ioval(print("File had parse errors:\n" ++ result.parseErrors ++ "\n\n", text.io,), 2,) else ioval(print("Finished.\n\n", writeHaskell,), 0,)
		return (core.NIOVal)(((!((Boolean)context.localDecorated(lambda_calculus.artifacts.host.Init.isF__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_iovalue__ON__core_IOVal))) ? ((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Pprint.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("File \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(lambda_calculus.artifacts.host.Init.filename__ON__lambda_calculus_artifacts_host_main)), (common.StringCatter)(new common.StringCatter("\" not found.\n\n")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(lambda_calculus.artifacts.host.Init.isF__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } }, Integer.valueOf((int)1))) : ((!((Boolean)context.localDecorated(lambda_calculus.artifacts.host.Init.result__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_parseSuccess__ON__core_ParseResult))) ? ((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Pprint.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("File had parse errors:\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(lambda_calculus.artifacts.host.Init.result__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_parseErrors__ON__core_ParseResult)), (common.StringCatter)(new common.StringCatter("\n\n")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(lambda_calculus.artifacts.host.Init.text__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } }, Integer.valueOf((int)2))) : ((core.NIOVal)new core.Pioval(new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)core.Pprint.invoke((new common.StringCatter("Finished.\n\n")), context.localAsIsLazy(lambda_calculus.artifacts.host.Init.writeHaskell__ON__lambda_calculus_artifacts_host_main))); } }, Integer.valueOf((int)0))))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function lambda_calculus:artifacts:host:main", t);
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