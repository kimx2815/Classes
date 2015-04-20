package edu.umn.cs.melt.ableC.abstractsyntax.gcc;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.initAllStatics();
		core.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.init();
		core.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.postInit();
		core.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.postInit();


		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.decorators, PvaListTypeExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.decorators, PtypeofTypeExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NNoncanonicalType.decorators, PtypeofType.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PtypesCompatibleExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PvaArgExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PstmtExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NDesignator.decorators, ParrayRangeDesignator.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PoffsetofExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.decorators, PinitialMemberDesignator.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.decorators, PfieldMemberDesignator.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.decorators, PderefMemberDesignator.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.decorators, ParrayMemberDesignator.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PimaginaryLiteral.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PimaginaryHexLiteral.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NUnaryOp.decorators, PrealOp.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NUnaryOp.decorators, PimagOp.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NSpecialSpecifier.decorators, PattributeQualifier.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NStmt.decorators, PfunctionDeclStmt.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NStmt.decorators, PcaseLabelRangeStmt.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PbinaryConditionalExpr.class);
	}

	private static void setupInheritedAttributes(){
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = "silver:langutil:pp";
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = "silver:langutil:errors";
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = "edu:umn:cs:melt:ableC:abstractsyntax:env:defs";
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.occurs_inh[edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator] = "edu:umn:cs:melt:ableC:abstractsyntax:env:env";
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.NMemberDesignator.decorators.add(edu.umn.cs.melt.ableC.abstractsyntax.env.Denv.singleton);
	}

	private static void initProductionAttributeDefinitions(){
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaListTypeExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofTypeExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypeofType.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PtypesCompatibleExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PvaArgExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PstmtExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayRangeDesignator.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PoffsetofExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PinitialMemberDesignator.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PfieldMemberDesignator.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PderefMemberDesignator.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.ParrayMemberDesignator.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PimaginaryLiteral.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PimaginaryHexLiteral.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PrealOp.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PimagOp.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PattributeQualifier.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PfunctionDeclStmt.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PcaseLabelRangeStmt.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.gcc.PbinaryConditionalExpr.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_vaListTypeExpr = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_typeofTypeExpr = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_typeofType = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_typesCompatibleExpr = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_vaArgExpr = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_stmtExpr = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_arrayRangeDesignator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_offsetofExpr = 0;
	public static int count_inh__ON__MemberDesignator = 0;
	public static int count_syn__ON__MemberDesignator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_initialMemberDesignator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_fieldMemberDesignator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_derefMemberDesignator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_arrayMemberDesignator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_imaginaryLiteral = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_imaginaryHexLiteral = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_realOp = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_imagOp = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_attributeQualifier = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_functionDeclStmt = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_caseLabelRangeStmt = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_binaryConditionalExpr = 0;
public static final int silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator = edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.count_syn__ON__MemberDesignator++;
public static final int silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator = edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.count_syn__ON__MemberDesignator++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator = edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.count_syn__ON__MemberDesignator++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_gcc_MemberDesignator = edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.count_inh__ON__MemberDesignator++;
}
