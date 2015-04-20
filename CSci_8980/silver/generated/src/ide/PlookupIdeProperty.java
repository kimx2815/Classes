
package ide;

public final class PlookupIdeProperty extends common.FunctionNode {

	public static final int i_prop = 0;
	public static final int i_args = 1;


	public static final Class<?> childTypes[] = { common.StringCatter.class,common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__ide_lookupIdeProperty;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PlookupIdeProperty(final Object c_prop, final Object c_args) {
		this.child_prop = c_prop;
		this.child_args = c_args;

	}

	private Object child_prop;
	public final common.StringCatter getChild_prop() {
		return (common.StringCatter) (child_prop = common.Util.demand(child_prop));
	}

	private Object child_args;
	public final common.ConsCell getChild_args() {
		return (common.ConsCell) (child_args = common.Util.demand(child_args));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_prop: return getChild_prop();
			case i_args: return getChild_args();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_prop: return child_prop;
			case i_args: return child_args;

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
		return "ide:lookupIdeProperty";
	}

	public static core.NMaybe invoke(final Object c_prop, final Object c_args) {
		try {
		final common.DecoratedNode context = new PlookupIdeProperty(c_prop, c_args).decorate();
		//if null(args,) then nothing(,) else if head(args,).propName == prop then just(head(args,).propValue,) else lookupIdeProperty(prop, tail(args,),)
		return (core.NMaybe)((((Boolean)core.Pnull.invoke(context.childAsIsLazy(ide.PlookupIdeProperty.i_args))) ? ((core.NMaybe)new core.Pnothing()) : (((common.StringCatter)((ide.NIdeProperty)core.Phead.invoke(context.childAsIsLazy(ide.PlookupIdeProperty.i_args))).decorate(context, (common.Lazy[])null).synthesized(ide.Init.ide_propName__ON__ide_IdeProperty)).equals(((common.StringCatter)context.childAsIs(ide.PlookupIdeProperty.i_prop))) ? ((core.NMaybe)new core.Pjust(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)((ide.NIdeProperty)core.Phead.invoke(context.childAsIsLazy(ide.PlookupIdeProperty.i_args))).decorate(context, (common.Lazy[])null).synthesized(ide.Init.ide_propValue__ON__ide_IdeProperty)); } })) : ((core.NMaybe)ide.PlookupIdeProperty.invoke(context.childAsIsLazy(ide.PlookupIdeProperty.i_prop), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Ptail.invoke(context.childAsIsLazy(ide.PlookupIdeProperty.i_args))); } })))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function ide:lookupIdeProperty", t);
		}
	}

	public static final common.NodeFactory<core.NMaybe> factory = new Factory();

	public static final class Factory extends common.NodeFactory<core.NMaybe> {
		@Override
		public core.NMaybe invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PlookupIdeProperty.invoke(children[0], children[1]);
		}
	};
}