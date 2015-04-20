
package ide;

// top::IdeMessage ::= resPath::String location::Location severity::Integer msg::String 
public final class PmakeResourceMessage extends ide.NIdeMessage {

	public static final int i_resPath = 0;
	public static final int i_location = 1;
	public static final int i_severity = 2;
	public static final int i_msg = 3;


	public static final Class<?> childTypes[] = {common.StringCatter.class,core.NLocation.class,Integer.class,common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__ide_makeResourceMessage;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[ide.NIdeMessage.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[ide.NIdeMessage.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_location] = new common.Lazy[core.NLocation.num_inh_attrs];

	}

	public PmakeResourceMessage(final Object c_resPath, final Object c_location, final Object c_severity, final Object c_msg) {
		super();
		this.child_resPath = c_resPath;
		this.child_location = c_location;
		this.child_severity = c_severity;
		this.child_msg = c_msg;

	}

	private Object child_resPath;
	public final common.StringCatter getChild_resPath() {
		return (common.StringCatter) (child_resPath = common.Util.demand(child_resPath));
	}

	private Object child_location;
	public final core.NLocation getChild_location() {
		return (core.NLocation) (child_location = common.Util.demand(child_location));
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
			case i_resPath: return getChild_resPath();
			case i_location: return getChild_location();
			case i_severity: return getChild_severity();
			case i_msg: return getChild_msg();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_resPath: return child_resPath;
			case i_location: return child_location;
			case i_severity: return child_severity;
			case i_msg: return child_msg;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		return true;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		return ((ide.NIdeMessage)new ide.PmakeIdeMessage(context.childAsIsLazy(ide.PmakeResourceMessage.i_resPath), common.Thunk.transformUndecorate(context.childDecoratedLazy(ide.PmakeResourceMessage.i_location)), context.childAsIsLazy(ide.PmakeResourceMessage.i_severity), context.childAsIsLazy(ide.PmakeResourceMessage.i_msg)));
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
		return "ide:makeResourceMessage";
	}

	static void initProductionAttributeDefinitions() {

	}

	public static final common.NodeFactory<PmakeResourceMessage> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PmakeResourceMessage> {

		@Override
		public PmakeResourceMessage invoke(final Object[] children, final Object[] annotations) {
			return new PmakeResourceMessage(children[0], children[1], children[2], children[3]);
		}
	};

}
