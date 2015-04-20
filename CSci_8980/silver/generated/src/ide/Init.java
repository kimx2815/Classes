package ide;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		core.Init.initAllStatics();
		ide.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		core.Init.init();
		ide.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		core.Init.postInit();
		ide.Init.postInit();


		common.Decorator.applyDecorators(ide.NIdeProperty.decorators, PmakeIdeProperty.class);
		common.Decorator.applyDecorators(ide.NIdeMessage.decorators, PmakeIdeMessage.class);
		common.Decorator.applyDecorators(ide.NIdeMessage.decorators, PmakeResourceMessage.class);
		common.Decorator.applyDecorators(ide.NIdeMessage.decorators, PmakeLinkedResourceMessage.class);
		common.Decorator.applyDecorators(ide.NIdeMessage.decorators, PmakeSysIdeMessage.class);
		common.Decorator.applyDecorators(ide.NIdeEnv.decorators, PmakeIdeEnv.class);
	}

	private static void setupInheritedAttributes(){
		ide.NIdeProperty.occurs_syn[ide.Init.ide_propName__ON__ide_IdeProperty] = "ide:propName";
		ide.NIdeProperty.occurs_syn[ide.Init.ide_propType__ON__ide_IdeProperty] = "ide:propType";
		ide.NIdeProperty.occurs_syn[ide.Init.ide_propValue__ON__ide_IdeProperty] = "ide:propValue";
		ide.NIdeEnv.occurs_syn[ide.Init.ide_project__ON__ide_IdeEnv] = "ide:project";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_resPath__ON__ide_IdeMessage] = "ide:resPath";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_loc__ON__ide_IdeMessage] = "ide:loc";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_severity__ON__ide_IdeMessage] = "ide:severity";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_msg__ON__ide_IdeMessage] = "ide:msg";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_systemLevel__ON__ide_IdeMessage] = "ide:systemLevel";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_rootPath__ON__ide_IdeMessage] = "ide:rootPath";
		ide.NIdeMessage.occurs_syn[ide.Init.ide_isLinked__ON__ide_IdeMessage] = "ide:isLinked";
		ide.NIdeEnv.occurs_syn[ide.Init.ide_projectName__ON__ide_IdeEnv] = "ide:projectName";
		ide.NIdeEnv.occurs_syn[ide.Init.ide_projectPath__ON__ide_IdeEnv] = "ide:projectPath";
		ide.NIdeEnv.occurs_syn[ide.Init.ide_generatedPath__ON__ide_IdeEnv] = "ide:generatedPath";
		ide.NIdeEnv.occurs_syn[ide.Init.ide_platformPath__ON__ide_IdeEnv] = "ide:platformPath";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION getVersion String ::= 
		ide.PmakeIdeProperty.initProductionAttributeDefinitions();
		//FUNCTION lookupIdeProperty Maybe<String> ::= prop::String args::[IdeProperty] 
		ide.PmakeIdeMessage.initProductionAttributeDefinitions();
		ide.PmakeResourceMessage.initProductionAttributeDefinitions();
		ide.PmakeLinkedResourceMessage.initProductionAttributeDefinitions();
		ide.PmakeSysIdeMessage.initProductionAttributeDefinitions();
		ide.PmakeIdeEnv.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__ide_getVersion = 0;
	public static int count_local__ON__ide_pinfo = 0;
	public static int count_local__ON__ide_perror = 0;
	public static int count_local__ON__ide_ant = 0;
	public static int count_local__ON__ide_refresh = 0;
	public static int count_inh__ON__IdeProperty = 0;
	public static int count_syn__ON__IdeProperty = 0;
	public static int count_local__ON__ide_makeIdeProperty = 0;
	public static int count_local__ON__ide_lookupIdeProperty = 0;
	public static int count_local__ON__ide_getProjectName = 0;
	public static int count_local__ON__ide_refreshProject = 0;
	public static int count_local__ON__ide_getAbsoluteProjectPath = 0;
	public static int count_local__ON__ide_getGeneratedPath = 0;
	public static int count_local__ON__ide_getProjectMembers = 0;
	public static int count_local__ON__ide_delete = 0;
	public static int count_local__ON__ide_copyTo = 0;
	public static int count_local__ON__ide_moveTo = 0;
	public static int count_local__ON__ide_createFile = 0;
	public static int count_local__ON__ide_createFolder = 0;
	public static int count_local__ON__ide_getRelativePath = 0;
	public static int count_local__ON__ide_getAbsolutePath = 0;
	public static int count_local__ON__ide_getResourceMembers = 0;
	public static int count_local__ON__ide_resourceIsFolder = 0;
	public static int count_local__ON__ide_resourceIsFile = 0;
	public static int count_local__ON__ide_resourceIsLinked = 0;
	public static int count_local__ON__ide_resourceIsHidden = 0;
	public static int count_local__ON__ide_resourceIsDerived = 0;
	public static int count_local__ON__ide_resourceExists = 0;
	public static int count_inh__ON__IdeMessage = 0;
	public static int count_syn__ON__IdeMessage = 0;
	public static int count_local__ON__ide_makeIdeMessage = 0;
	public static int count_local__ON__ide_makeResourceMessage = 0;
	public static int count_local__ON__ide_makeLinkedResourceMessage = 0;
	public static int count_local__ON__ide_makeSysIdeMessage = 0;
	public static int count_inh__ON__IdeEnv = 0;
	public static int count_syn__ON__IdeEnv = 0;
	public static int count_local__ON__ide_makeIdeEnv = 0;
public static final int ide_propName__ON__ide_IdeProperty = ide.Init.count_syn__ON__IdeProperty++;
public static final int ide_propType__ON__ide_IdeProperty = ide.Init.count_syn__ON__IdeProperty++;
public static final int ide_propValue__ON__ide_IdeProperty = ide.Init.count_syn__ON__IdeProperty++;
public static final int ide_project__ON__ide_IdeEnv = ide.Init.count_syn__ON__IdeEnv++;
public static final int ide_resPath__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_loc__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_severity__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_msg__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_systemLevel__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_rootPath__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_isLinked__ON__ide_IdeMessage = ide.Init.count_syn__ON__IdeMessage++;
public static final int ide_projectName__ON__ide_IdeEnv = ide.Init.count_syn__ON__IdeEnv++;
public static final int ide_projectPath__ON__ide_IdeEnv = ide.Init.count_syn__ON__IdeEnv++;
public static final int ide_generatedPath__ON__ide_IdeEnv = ide.Init.count_syn__ON__IdeEnv++;
public static final int ide_platformPath__ON__ide_IdeEnv = ide.Init.count_syn__ON__IdeEnv++;
	public static final common.Thunk<Object> ideVersion = new common.Thunk<Object>(common.TopNode.singleton) { public final Object doEval() { return (new common.StringCatter("0.0.1")); } };
	public static final common.Thunk<Object> ideDepthZero = new common.Thunk<Object>(common.TopNode.singleton) { public final Object doEval() { return Integer.valueOf((int)0); } };
	public static final common.Thunk<Object> ideDepthOne = new common.Thunk<Object>(common.TopNode.singleton) { public final Object doEval() { return Integer.valueOf((int)1); } };
	public static final common.Thunk<Object> ideDepthInfinite = new common.Thunk<Object>(common.TopNode.singleton) { public final Object doEval() { return Integer.valueOf((int)2); } };
	public static final common.Thunk<Object> ideMsgLvWarning = new common.Thunk<Object>(common.TopNode.singleton) { public final Object doEval() { return Integer.valueOf((int)1); } };
	public static final common.Thunk<Object> ideMsgLvError = new common.Thunk<Object>(common.TopNode.singleton) { public final Object doEval() { return Integer.valueOf((int)2); } };
}
