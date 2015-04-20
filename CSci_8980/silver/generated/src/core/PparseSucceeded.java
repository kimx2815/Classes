
package core;

// top::ParseResult<a> ::= t::a 
public final class PparseSucceeded extends core.NParseResult {

	public static final int i_t = 0;


	public static final Class<?> childTypes[] = {Object.class};

	public static final int num_local_attrs = Init.count_local__ON__core_parseSucceeded;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[core.NParseResult.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[core.NParseResult.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PparseSucceeded(final Object c_t) {
		super();
		this.child_t = c_t;

	}

	private Object child_t;
	public final Object getChild_t() {
		return (Object) (child_t = common.Util.demand(child_t));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_t: return getChild_t();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_t: return child_t;

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
		throw new common.exceptions.SilverInternalError("Production core:parseSucceeded erroneously claimed to forward");
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
		return "core:parseSucceeded";
	}

	static void initProductionAttributeDefinitions() {
		// top.parseSuccess = true
		core.PparseSucceeded.synthesizedAttributes[core.Init.core_parseSuccess__ON__core_ParseResult] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.parseErrors = error("Demanded parse errors, but parsing succeeded!",)
		core.PparseSucceeded.synthesizedAttributes[core.Init.core_parseErrors__ON__core_ParseResult] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Perror.invoke((new common.StringCatter("Demanded parse errors, but parsing succeeded!")))); } };
		// top.parseTree = t
		core.PparseSucceeded.synthesizedAttributes[core.Init.core_parseTree__ON__core_ParseResult] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(core.PparseSucceeded.i_t)); } };

	}

	public static final common.NodeFactory<PparseSucceeded> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PparseSucceeded> {

		@Override
		public PparseSucceeded invoke(final Object[] children, final Object[] annotations) {
			return new PparseSucceeded(children[0]);
		}
	};

}
