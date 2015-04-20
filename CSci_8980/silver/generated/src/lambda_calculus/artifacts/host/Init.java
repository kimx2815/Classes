package lambda_calculus.artifacts.host;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		core.Init.initAllStatics();
		lambda_calculus.host.concretesyntax.Init.initAllStatics();
		lambda_calculus.host.abstractsyntax.Init.initAllStatics();
		lambda_calculus.artifacts.host.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		core.Init.init();
		lambda_calculus.host.concretesyntax.Init.init();
		lambda_calculus.host.abstractsyntax.Init.init();
		lambda_calculus.artifacts.host.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		core.Init.postInit();
		lambda_calculus.host.concretesyntax.Init.postInit();
		lambda_calculus.host.abstractsyntax.Init.postInit();
		lambda_calculus.artifacts.host.Init.postInit();


	}

	private static void setupInheritedAttributes(){
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.filename__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:filename";
		//	local attribute isF::IOVal<Boolean>;
		lambda_calculus.artifacts.host.Pmain.localInheritedAttributes[lambda_calculus.artifacts.host.Init.isF__ON__lambda_calculus_artifacts_host_main] = new common.Lazy[core.NIOVal.num_inh_attrs];
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.isF__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:isF";
		//	local attribute text::IOVal<String>;
		lambda_calculus.artifacts.host.Pmain.localInheritedAttributes[lambda_calculus.artifacts.host.Init.text__ON__lambda_calculus_artifacts_host_main] = new common.Lazy[core.NIOVal.num_inh_attrs];
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.text__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:text";
		//	local attribute result::ParseResult<cnc:Root>;
		lambda_calculus.artifacts.host.Pmain.localInheritedAttributes[lambda_calculus.artifacts.host.Init.result__ON__lambda_calculus_artifacts_host_main] = new common.Lazy[core.NParseResult.num_inh_attrs];
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.result__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:result";
		//	local attribute r_cst::cnc:Root;
		lambda_calculus.artifacts.host.Pmain.localInheritedAttributes[lambda_calculus.artifacts.host.Init.r_cst__ON__lambda_calculus_artifacts_host_main] = new common.Lazy[lambda_calculus.host.concretesyntax.NRoot.num_inh_attrs];
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.r_cst__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:r_cst";
		//	local attribute r_ast::abs:Root;
		lambda_calculus.artifacts.host.Pmain.localInheritedAttributes[lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main] = new common.Lazy[lambda_calculus.host.abstractsyntax.NRoot.num_inh_attrs];
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:r_ast";
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.pp_msg__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:pp_msg";
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.errors_msg__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:errors_msg";
		lambda_calculus.artifacts.host.Pmain.occurs_local[lambda_calculus.artifacts.host.Init.writeHaskell__ON__lambda_calculus_artifacts_host_main] = "lambda_calculus:artifacts:host:main:local:writeHaskell";
	}

	private static void initProductionAttributeDefinitions(){
		//FUNCTION main IOVal<Integer> ::= args::[String] io_in::IO 
		// filename = head(args,)
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.filename__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)core.Phead.invoke(context.childAsIsLazy(lambda_calculus.artifacts.host.Pmain.i_args))); } };
		// isF = isFile(filename, io_in,)
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.isF__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PisFile.invoke(context.localAsIsLazy(lambda_calculus.artifacts.host.Init.filename__ON__lambda_calculus_artifacts_host_main), context.childAsIsLazy(lambda_calculus.artifacts.host.Pmain.i_io_in))); } };
		// text = readFile(filename, isF.io,)
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.text__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NIOVal)core.PreadFile.invoke(context.localAsIsLazy(lambda_calculus.artifacts.host.Init.filename__ON__lambda_calculus_artifacts_host_main), new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(lambda_calculus.artifacts.host.Init.isF__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } };
		// result = the_parser(text.iovalue, filename,)
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.result__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((core.NParseResult)lambda_calculus.artifacts.host.Pthe_parser.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)context.localDecorated(lambda_calculus.artifacts.host.Init.text__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_iovalue__ON__core_IOVal)); } }, context.localAsIsLazy(lambda_calculus.artifacts.host.Init.filename__ON__lambda_calculus_artifacts_host_main))); } };
		// r_cst = result.parseTree
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.r_cst__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.concretesyntax.NRoot)context.localDecorated(lambda_calculus.artifacts.host.Init.result__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_parseTree__ON__core_ParseResult)); } };
		// r_ast = r_cst.cnc:ast_Root
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NRoot)context.localDecorated(lambda_calculus.artifacts.host.Init.r_cst__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Root__ON__lambda_calculus_host_concretesyntax_Root)); } };
		// pp_msg = print("pretty print: \n" ++ r_cst.cnc:pp ++ "\n\n" ++ "on ast: \n" ++ r_ast.abs:pp ++ "\n\n", text.io,)
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.pp_msg__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((Object)core.Pprint.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("pretty print: \n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(lambda_calculus.artifacts.host.Init.r_cst__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Root)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("\n\n")), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter("on ast: \n")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.localDecorated(lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Root)), (common.StringCatter)(new common.StringCatter("\n\n"))))))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((Object)context.localDecorated(lambda_calculus.artifacts.host.Init.text__ON__lambda_calculus_artifacts_host_main).synthesized(core.Init.core_io__ON__core_IOVal)); } })); } };
		// errors_msg = if null(r_ast.abs:errors,) then print("No Errors!\n", pp_msg,) else print("Errors:\n" ++ foldr(stringConcat, "\n", r_ast.abs:errors,), pp_msg,)
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.errors_msg__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)core.Pnull.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)context.localDecorated(lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root)); } })) ? ((Object)core.Pprint.invoke((new common.StringCatter("No Errors!\n")), context.localAsIsLazy(lambda_calculus.artifacts.host.Init.pp_msg__ON__lambda_calculus_artifacts_host_main))) : ((Object)core.Pprint.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return new common.StringCatter((common.StringCatter)(new common.StringCatter("Errors:\n")), (common.StringCatter)((common.StringCatter)core.Pfoldr.invoke(core.PstringConcat.factory, (new common.StringCatter("\n")), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)context.localDecorated(lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root)); } }))); } }, context.localAsIsLazy(lambda_calculus.artifacts.host.Init.pp_msg__ON__lambda_calculus_artifacts_host_main)))); } };
		// writeHaskell = if null(r_ast.abs:errors,) then writeFile("LambdaTranslation.hs", r_ast.abs:haskell, errors_msg,) else errors_msg
		lambda_calculus.artifacts.host.Pmain.localAttributes[lambda_calculus.artifacts.host.Init.writeHaskell__ON__lambda_calculus_artifacts_host_main] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (((Boolean)core.Pnull.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)context.localDecorated(lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root)); } })) ? ((Object)core.PwriteFile.invoke((new common.StringCatter("LambdaTranslation.hs")), new common.Thunk<Object>(context) { public final Object doEval() { return ((common.StringCatter)context.localDecorated(lambda_calculus.artifacts.host.Init.r_ast__ON__lambda_calculus_artifacts_host_main).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_haskell__ON__lambda_calculus_host_abstractsyntax_Root)); } }, context.localAsIsLazy(lambda_calculus.artifacts.host.Init.errors_msg__ON__lambda_calculus_artifacts_host_main))) : ((Object)context.localAsIs(lambda_calculus.artifacts.host.Init.errors_msg__ON__lambda_calculus_artifacts_host_main))); } };
	}

	public static int count_local__ON__lambda_calculus_artifacts_host_the_parser = 0;
	public static int count_local__ON__lambda_calculus_artifacts_host_main = 0;
public static final int filename__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int isF__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int text__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int result__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int r_cst__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int r_ast__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int pp_msg__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int errors_msg__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
public static final int writeHaskell__ON__lambda_calculus_artifacts_host_main = lambda_calculus.artifacts.host.Init.count_local__ON__lambda_calculus_artifacts_host_main++;
}
