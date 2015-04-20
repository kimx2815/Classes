
package ide;

// top::IdeEnv ::= projectName::String projectPath::String generatedPath::String platformPath::String project::IdeProject 
public final class PmakeIdeEnv extends ide.NIdeEnv {

	public static final int i_projectName = 0;
	public static final int i_projectPath = 1;
	public static final int i_generatedPath = 2;
	public static final int i_platformPath = 3;
	public static final int i_project = 4;


	public static final Class<?> childTypes[] = {common.StringCatter.class,common.StringCatter.class,common.StringCatter.class,common.StringCatter.class,Object.class};

	public static final int num_local_attrs = Init.count_local__ON__ide_makeIdeEnv;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[ide.NIdeEnv.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[ide.NIdeEnv.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[5][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PmakeIdeEnv(final Object c_projectName, final Object c_projectPath, final Object c_generatedPath, final Object c_platformPath, final Object c_project) {
		super();
		this.child_projectName = c_projectName;
		this.child_projectPath = c_projectPath;
		this.child_generatedPath = c_generatedPath;
		this.child_platformPath = c_platformPath;
		this.child_project = c_project;

	}

	private Object child_projectName;
	public final common.StringCatter getChild_projectName() {
		return (common.StringCatter) (child_projectName = common.Util.demand(child_projectName));
	}

	private Object child_projectPath;
	public final common.StringCatter getChild_projectPath() {
		return (common.StringCatter) (child_projectPath = common.Util.demand(child_projectPath));
	}

	private Object child_generatedPath;
	public final common.StringCatter getChild_generatedPath() {
		return (common.StringCatter) (child_generatedPath = common.Util.demand(child_generatedPath));
	}

	private Object child_platformPath;
	public final common.StringCatter getChild_platformPath() {
		return (common.StringCatter) (child_platformPath = common.Util.demand(child_platformPath));
	}

	private Object child_project;
	public final Object getChild_project() {
		return (Object) (child_project = common.Util.demand(child_project));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_projectName: return getChild_projectName();
			case i_projectPath: return getChild_projectPath();
			case i_generatedPath: return getChild_generatedPath();
			case i_platformPath: return getChild_platformPath();
			case i_project: return getChild_project();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_projectName: return child_projectName;
			case i_projectPath: return child_projectPath;
			case i_generatedPath: return child_generatedPath;
			case i_platformPath: return child_platformPath;
			case i_project: return child_project;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 5;
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
		throw new common.exceptions.SilverInternalError("Production ide:makeIdeEnv erroneously claimed to forward");
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
		return "ide:makeIdeEnv";
	}

	static void initProductionAttributeDefinitions() {
		// top.projectName = projectName
		ide.PmakeIdeEnv.synthesizedAttributes[ide.Init.ide_projectName__ON__ide_IdeEnv] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeEnv.i_projectName)); } };
		// top.projectPath = projectPath
		ide.PmakeIdeEnv.synthesizedAttributes[ide.Init.ide_projectPath__ON__ide_IdeEnv] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeEnv.i_projectPath)); } };
		// top.generatedPath = generatedPath
		ide.PmakeIdeEnv.synthesizedAttributes[ide.Init.ide_generatedPath__ON__ide_IdeEnv] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeEnv.i_generatedPath)); } };
		// top.platformPath = platformPath
		ide.PmakeIdeEnv.synthesizedAttributes[ide.Init.ide_platformPath__ON__ide_IdeEnv] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childAsIs(ide.PmakeIdeEnv.i_platformPath)); } };
		// top.project = project
		ide.PmakeIdeEnv.synthesizedAttributes[ide.Init.ide_project__ON__ide_IdeEnv] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)context.childAsIs(ide.PmakeIdeEnv.i_project)); } };

	}

	public static final common.NodeFactory<PmakeIdeEnv> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PmakeIdeEnv> {

		@Override
		public PmakeIdeEnv invoke(final Object[] children, final Object[] annotations) {
			return new PmakeIdeEnv(children[0], children[1], children[2], children[3], children[4]);
		}
	};

}
