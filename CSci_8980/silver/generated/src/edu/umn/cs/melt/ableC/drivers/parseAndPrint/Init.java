package edu.umn.cs.melt.ableC.drivers.parseAndPrint;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.initAllStatics();
		core.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.init();
		core.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.Init.init();
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.postInit();
		core.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.Init.postInit();
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:fileName";
		//	local attribute splitFileName::Pair<String String>;
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.splitFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy[core.NPair.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.splitFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:splitFileName";
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.baseFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:baseFileName";
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.cppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:cppFileName";
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:ppFileName";
		//	local attribute isF::IOVal<Boolean>;
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:isF";
		//	local attribute mkCppFile::IOVal<Integer>;
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.mkCppFile__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.mkCppFile__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:mkCppFile";
		//	local attribute text::IOVal<String>;
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy[core.NIOVal.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:text";
		//	local attribute result::ParseResult<cst:Root>;
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy[core.NParseResult.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:result";
		//	local attribute ast::abs:Root;
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localInheritedAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ast__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NRoot.num_inh_attrs];
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ast__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:ast";
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.occurs_local[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.writePP__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = "edu:umn:cs:melt:ableC:drivers:parseAndPrint:driver:local:writePP";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION driver IOVal<Integer> ::= args::[String] ioIn::IO theParser::(ParseResult<cst:Root> ::= String String) 
		// fileName = head(args,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Phead.invoke(context.childAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.i_args))); } };
		// splitFileName = splitFileNameAndExtension(fileName,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.splitFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NPair)core.PsplitFileNameAndExtension.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver))); } };
		// baseFileName = splitFileName.fst
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.baseFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.splitFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(core.Init.core_fst__ON__core_Pair)); } };
		// cppFileName = baseFileName ++ ".gen_cpp"
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.cppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.baseFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver)), (common.StringCatter)(new common.StringCatter(".gen_cpp"))); } };
		// ppFileName = baseFileName ++ ".pp_out.c"
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.baseFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver)), (common.StringCatter)(new common.StringCatter(".pp_out.c"))); } };
		// isF = isFile(fileName, ioIn,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PisFile.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver), context.childAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.i_ioIn))); } };
		// mkCppFile = system("cpp -E -C \"" ++ fileName ++ "\" > " ++ cppFileName, isF.io,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.mkCppFile__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.Psystem.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("cpp -E -C \"")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localAsIs(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.fileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\" > ")), (common.StringCatter)((common.StringCatter)context.localAsIs(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.cppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver))))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.isF__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } };
		// text = readFile(cppFileName, mkCppFile.io,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PreadFile.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.cppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver), new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.mkCppFile__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } };
		// result = theParser(text.iovalue, cppFileName,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NParseResult)((common.NodeFactory<core.NParseResult>)context.childAsIs(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.i_theParser)).invoke(new Object[]{new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(core.Init.core_iovalue__ON__core_IOVal)); } }, context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.cppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver)}, null)); } };
		// ast = result.parseTree.ast
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ast__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NRoot)((edu.umn.cs.melt.ableC.concretesyntax.NRoot)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.result__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(core.Init.core_parseTree__ON__core_ParseResult)).decorate(context, (common.Lazy[])null).synthesized(edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_Root)); } };
		// writePP = writeFile(ppFileName, show(80, ast.pp,), text.io,)
		edu.umn.cs.melt.ableC.drivers.parseAndPrint.Pdriver.localAttributes[edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.writePP__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.PwriteFile.invoke(context.localAsIsLazy(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)silver.langutil.pp.Pshow.invoke(Integer.valueOf((int)80), new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.pp.NDocument)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.ast__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(edu.umn.cs.melt.ableC.abstractsyntax.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_Root)); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.text__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } };
	}

	public static int count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = 0;
public static final int fileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int splitFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int baseFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int cppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int ppFileName__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int isF__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int mkCppFile__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int text__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int result__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int ast__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
public static final int writePP__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver = edu.umn.cs.melt.ableC.drivers.parseAndPrint.Init.count_local__ON__edu_umn_cs_melt_ableC_drivers_parseAndPrint_driver++;
}
