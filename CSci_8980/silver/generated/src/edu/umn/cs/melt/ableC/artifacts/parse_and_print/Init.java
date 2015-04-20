package edu.umn.cs.melt.ableC.artifacts.parse_and_print;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.initAllStatics();
		core.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.initAllStatics();
		edu.umn.cs.melt.ableC.artifacts.parse_and_print.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.init();
		core.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.Init.init();
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.init();
		edu.umn.cs.melt.ableC.artifacts.parse_and_print.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.postInit();
		core.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.Init.postInit();
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.postInit();
		edu.umn.cs.melt.ableC.artifacts.parse_and_print.Init.postInit();


	}

	private static void setupInheritedAttributes(){
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= args::[String] io_in::IO 
	}

	public static int count_local__ON__edu_umn_cs_melt_ableC_artifacts_parse_and_print_theParser = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_artifacts_parse_and_print_main = 0;
}
