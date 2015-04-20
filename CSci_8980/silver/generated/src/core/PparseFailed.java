
package core;

// top::ParseResult<a> ::= e::String 
public final class PparseFailed extends core.NParseResult {

	public static final int i_e = 0;


	public static final Class<?> childTypes[] = {common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__core_parseFailed;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[core.NParseResult.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[core.NParseResult.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PparseFailed(final Object c_e) {
		super();
		this.child_e = c_e;

	}

	private Object child_e;
	public final common.StringCatter getChild_e() {
		return (common.StringCatter) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_e: return child_e;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
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
	public boolean hasForward() {
		return false;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		throw new common.exceptions.SilverInternalError("Production core:parseFailed erroneously claimed to forward");
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
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
		return "core:parseFailed";
	}

	static void initProductionAttributeDefinitions() {
		// top.parseSuccess = false
		core.PparseFailed.synthesizedAttributes[core.Init.core_parseSuccess__ON__core_ParseResult] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return false; } };
		// top.parseErrors = e
		core.PparseFailed.synthesizedAttributes[core.Init.core_parseErrors__ON__core_ParseResult] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(core.PparseFailed.i_e)); } };
		// top.parseTree = error("Demanded parse tree when parsing failed! With errors: " ++ e,)
		core.PparseFailed.synthesizedAttributes[core.Init.core_parseTree__ON__core_ParseResult] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.Perror.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Demanded parse tree when parsing failed! With errors: ")), (common.StringCatter)((common.StringCatter)context.childAsIs(core.PparseFailed.i_e))); } })); } };

	}

	public static final common.NodeFactory<PparseFailed> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PparseFailed> {

		@Override
		public PparseFailed invoke(final Object[] children, final Object[] annotations) {
			return new PparseFailed(children[0]);
		}
	};

}
