package lambda_calculus.host.concretesyntax;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		core.Init.initAllStatics();
		lambda_calculus.host.abstractsyntax.Init.initAllStatics();
		lambda_calculus.host.concretesyntax.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		core.Init.init();
		lambda_calculus.host.abstractsyntax.Init.init();
		lambda_calculus.host.concretesyntax.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		core.Init.postInit();
		lambda_calculus.host.abstractsyntax.Init.postInit();
		lambda_calculus.host.concretesyntax.Init.postInit();


		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NRoot.decorators, Proot.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NLamExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NLamExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_79_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_84_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_89_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_94_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_99_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_104_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_109_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_114_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_120_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_132_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NExpr.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_147_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NAppTerm.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NAppTerm.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_161_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NATerm.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_169_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NATerm.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_174_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NATerm.decorators, PP_lambda_calculus_host_concretesyntaxSyntax_sv_179_0.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NType.decorators, PfunctionType.class);
		common.Decorator.applyDecorators(lambda_calculus.host.concretesyntax.NType.decorators, PintegerType.class);
	}

	private static void setupInheritedAttributes(){
		lambda_calculus.host.concretesyntax.NRoot.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Root] = "lambda_calculus:host:concretesyntax:pp";
		lambda_calculus.host.concretesyntax.NRoot.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Root__ON__lambda_calculus_host_concretesyntax_Root] = "lambda_calculus:host:concretesyntax:ast_Root";
		lambda_calculus.host.concretesyntax.NLamExpr.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_LamExpr] = "lambda_calculus:host:concretesyntax:pp";
		lambda_calculus.host.concretesyntax.NLamExpr.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_LamExpr] = "lambda_calculus:host:concretesyntax:ast_Expr";
		lambda_calculus.host.concretesyntax.NExpr.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Expr] = "lambda_calculus:host:concretesyntax:pp";
		lambda_calculus.host.concretesyntax.NExpr.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_Expr] = "lambda_calculus:host:concretesyntax:ast_Expr";
		lambda_calculus.host.concretesyntax.NAppTerm.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_AppTerm] = "lambda_calculus:host:concretesyntax:pp";
		lambda_calculus.host.concretesyntax.NAppTerm.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_AppTerm] = "lambda_calculus:host:concretesyntax:ast_Expr";
		lambda_calculus.host.concretesyntax.NATerm.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_ATerm] = "lambda_calculus:host:concretesyntax:pp";
		lambda_calculus.host.concretesyntax.NATerm.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_ATerm] = "lambda_calculus:host:concretesyntax:ast_Expr";
		lambda_calculus.host.concretesyntax.NType.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Type] = "lambda_calculus:host:concretesyntax:pp";
		lambda_calculus.host.concretesyntax.NType.occurs_syn[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Type__ON__lambda_calculus_host_concretesyntax_Type] = "lambda_calculus:host:concretesyntax:ast_Type";
	}

	private static void initProductionAttributeDefinitions(){
		lambda_calculus.host.concretesyntax.Proot.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_79_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_84_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_89_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_94_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_99_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_104_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_109_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_114_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_120_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_132_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_147_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_161_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_169_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_174_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_179_0.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PfunctionType.initProductionAttributeDefinitions();
		lambda_calculus.host.concretesyntax.PintegerType.initProductionAttributeDefinitions();
	}

	public static int count_inh__ON__Root = 0;
	public static int count_syn__ON__Root = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_root = 0;
	public static int count_inh__ON__LamExpr = 0;
	public static int count_syn__ON__LamExpr = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_65_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_70_0 = 0;
	public static int count_inh__ON__Expr = 0;
	public static int count_syn__ON__Expr = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_79_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_84_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_89_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_94_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_99_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_104_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_109_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_114_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_120_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_126_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_132_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_147_0 = 0;
	public static int count_inh__ON__AppTerm = 0;
	public static int count_syn__ON__AppTerm = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_156_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_161_0 = 0;
	public static int count_inh__ON__ATerm = 0;
	public static int count_syn__ON__ATerm = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_169_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_174_0 = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_179_0 = 0;
	public static int count_inh__ON__Type = 0;
	public static int count_syn__ON__Type = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_functionType = 0;
	public static int count_local__ON__lambda_calculus_host_concretesyntax_integerType = 0;
public static final int lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Root = lambda_calculus.host.concretesyntax.Init.count_syn__ON__Root++;
public static final int lambda_calculus_host_concretesyntax_ast_Root__ON__lambda_calculus_host_concretesyntax_Root = lambda_calculus.host.concretesyntax.Init.count_syn__ON__Root++;
public static final int lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_LamExpr = lambda_calculus.host.concretesyntax.Init.count_syn__ON__LamExpr++;
public static final int lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_LamExpr = lambda_calculus.host.concretesyntax.Init.count_syn__ON__LamExpr++;
public static final int lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Expr = lambda_calculus.host.concretesyntax.Init.count_syn__ON__Expr++;
public static final int lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_Expr = lambda_calculus.host.concretesyntax.Init.count_syn__ON__Expr++;
public static final int lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_AppTerm = lambda_calculus.host.concretesyntax.Init.count_syn__ON__AppTerm++;
public static final int lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_AppTerm = lambda_calculus.host.concretesyntax.Init.count_syn__ON__AppTerm++;
public static final int lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_ATerm = lambda_calculus.host.concretesyntax.Init.count_syn__ON__ATerm++;
public static final int lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_ATerm = lambda_calculus.host.concretesyntax.Init.count_syn__ON__ATerm++;
public static final int lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Type = lambda_calculus.host.concretesyntax.Init.count_syn__ON__Type++;
public static final int lambda_calculus_host_concretesyntax_ast_Type__ON__lambda_calculus_host_concretesyntax_Type = lambda_calculus.host.concretesyntax.Init.count_syn__ON__Type++;
}
