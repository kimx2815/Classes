package edu.umn.cs.melt.ableC.drivers.parseOnly;

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
		edu.umn.cs.melt.ableC.drivers.parseOnly.Init.initAllStatics();

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
		edu.umn.cs.melt.ableC.drivers.parseOnly.Init.init();

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
		edu.umn.cs.melt.ableC.drivers.parseOnly.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = "edu:umn:cs:melt:ableC:drivers:parseOnly:driver:local:fileName";
		//	local attribute isF::IOVal<Boolean>;
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = "edu:umn:cs:melt:ableC:drivers:parseOnly:driver:local:isF";
		//	local attribute text::IOVal<String>;
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = "edu:umn:cs:melt:ableC:drivers:parseOnly:driver:local:text";
		//	local attribute result::ParseResult<cst:Root>;
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy[core.NParseResult.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = "edu:umn:cs:melt:ableC:drivers:parseOnly:driver:local:result";
		//	local attribute r_cst::cst:Root;
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.r_cst__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NRoot.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.r_cst__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = "edu:umn:cs:melt:ableC:drivers:parseOnly:driver:local:r_cst";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION driver IOVal<Integer> ::= args::[String] io_in::IO the_parser::(ParseResult<cst:Root> ::= String String) 
		// fileName = head(args,)
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Phead.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.i_args))); } };
		// isF = isFile(fileName, io_in,)
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PisFile.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver), context.childAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.i_io_in))); } };
		// text = readFile(fileName, isF.io,)
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PreadFile.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver), new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } };
		// result = the_parser(text.iovalue, fileName,)
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NParseResult)((common.NodeFactory<core.NParseResult>)context.childAsIs(edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.i_the_parser)).invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_iovalue__ON__core_IOVal)); } }, context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver)}, null)); } };
		// r_cst = result.parseTree
		edu.umn.cs.melt.ableC.drivers.parseOnly.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseOnly.Init.r_cst__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.concretesyntax.NRoot)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseOnly.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver).synthesized(core.Init.core_parseTree__ON__core_ParseResult)); } };
	}

	public static int count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver = 0;
public static final int fileName__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver = edu.umn.cs.melt.ableC.drivers.parseOnly.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver++;
public static final int isF__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver = edu.umn.cs.melt.ableC.drivers.parseOnly.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver++;
public static final int text__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver = edu.umn.cs.melt.ableC.drivers.parseOnly.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver++;
public static final int result__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver = edu.umn.cs.melt.ableC.drivers.parseOnly.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver++;
public static final int r_cst__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver = edu.umn.cs.melt.ableC.drivers.parseOnly.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseOnly_driver++;
}
