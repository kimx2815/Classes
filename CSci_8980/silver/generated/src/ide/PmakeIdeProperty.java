
package ide;

// top::IdeProperty ::= propName::String propType::String propValue::String 
public final class PmakeIdeProperty extends ide.NIdeProperty {

	public static final int i_propName = 0;
	public static final int i_propType = 1;
	public static final int i_propValue = 2;


	public static final Class<?> childTypes[] = {common.StringCatter.class,common.StringCatter.class,common.StringCatter.class};

	public static final int num_local_attrs = Init.count_local__ON__ide_makeIdeProperty;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[ide.NIdeProperty.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[ide.NIdeProperty.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PmakeIdeProperty(final Object c_propName, final Object c_propType, final Object c_propValue) {
		super();
		this.child_propName = c_propName;
		this.child_propType = c_propType;
		this.child_propValue = c_propValue;

	}

	private Object child_propName;
	public final common.StringCatter getChild_propName() {
		return (common.StringCatter) (child_propName = common.Util.demand(child_propName));
	}

	private Object child_propType;
	public final common.StringCatter getChild_propType() {
		return (common.StringCatter) (child_propType = common.Util.demand(child_propType));
	}

	private Object child_propValue;
	public final common.StringCatter getChild_propValue() {
		return (common.StringCatter) (child_propValue = common.Util.demand(child_propValue));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_propName: return getChild_propName();
			case i_propType: return getChild_propType();
			case i_propValue: return getChild_propValue();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_propName: return child_propName;
			case i_propType: return child_propType;
			case i_propValue: return child_propValue;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 3;
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
		throw new common.exceptions.SilverInternalError("Production ide:makeIdeProperty erroneously claimed to forward");
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
		return "ide:makeIdeProperty";
	}

	static void initProductionAttributeDefinitions() {
		// top.propName = propName
		ide.PmakeIdeProperty.synthesizedAttributes[ide.Init.ide_propName__ON__ide_IdeProperty] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeProperty.i_propName)); } };
		// top.propType = propType
		ide.PmakeIdeProperty.synthesizedAttributes[ide.Init.ide_propType__ON__ide_IdeProperty] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeProperty.i_propType)); } };
		// top.propValue = propValue
		ide.PmakeIdeProperty.synthesizedAttributes[ide.Init.ide_propValue__ON__ide_IdeProperty] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeProperty.i_propValue)); } };

	}

	public static final common.NodeFactory<PmakeIdeProperty> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PmakeIdeProperty> {

		@Override
		public PmakeIdeProperty invoke(final Object[] children, final Object[] annotations) {
			return new PmakeIdeProperty(children[0], children[1], children[2]);
		}
	};

}
