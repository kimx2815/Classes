
package ide;

// top::IdeMessage ::= severity::Integer msg::String 
public final class PmakeSysIdeMessage extends ide.NIdeMessage {

	public static final int i_severity = 0;
	public static final int i_msg = 1;


	public static final Class<?> childTypes[] = {Integer.class,common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__ide_makeSysIdeMessage;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[ide.NIdeMessage.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[ide.NIdeMessage.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PmakeSysIdeMessage(final Object c_severity, final Object c_msg) {
		super();
		this.child_severity = c_severity;
		this.child_msg = c_msg;

	}

	private Object child_severity;
	public final Integer getChild_severity() {
		return (Integer) (child_severity = common.Util.demand(child_severity));
	}

	private Object child_msg;
	public final common.StringCatter getChild_msg() {
		return (common.StringCatter) (child_msg = common.Util.demand(child_msg));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_severity: return getChild_severity();
			case i_msg: return getChild_msg();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_severity: return child_severity;
			case i_msg: return child_msg;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		throw new common.exceptions.SilverInternalError("Production ide:makeSysIdeMessage erroneously claimed to forward");
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
		return "ide:makeSysIdeMessage";
	}

	static void initProductionAttributeDefinitions() {
		// top.resPath = ""
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_resPath__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("")); } };
		// top.loc = loc("", 0, 0, 0, 0, 0, 0,)
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_loc__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NLocation)new core.Ploc((new common.StringCatter("")), Integer.valueOf((int)0), Integer.valueOf((int)0), Integer.valueOf((int)0), Integer.valueOf((int)0), Integer.valueOf((int)0), Integer.valueOf((int)0))); } };
		// top.severity = severity
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_severity__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Integer)context.childAsIs(ide.PmakeSysIdeMessage.i_severity)); } };
		// top.msg = msg
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_msg__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeSysIdeMessage.i_msg)); } };
		// top.systemLevel = true
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_systemLevel__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return true; } };
		// top.rootPath = ""
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_rootPath__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("")); } };
		// top.isLinked = false
		ide.PmakeSysIdeMessage.synthesizedAttributes[ide.Init.ide_isLinked__ON__ide_IdeMessage] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return false; } };

	}

	public static final common.NodeFactory<PmakeSysIdeMessage> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PmakeSysIdeMessage> {

		@Override
		public PmakeSysIdeMessage invoke(final Object[] children, final Object[] annotations) {
			return new PmakeSysIdeMessage(children[0], children[1]);
		}
	};

}
