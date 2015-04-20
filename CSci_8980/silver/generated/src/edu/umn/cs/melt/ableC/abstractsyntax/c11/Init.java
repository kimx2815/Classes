package edu.umn.cs.melt.ableC.abstractsyntax.c11;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.initAllStatics();
		core.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.init();
		core.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.postInit();
		core.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.postInit();


		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NSpecialSpecifier.decorators, PnoreturnQualifier.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NExpr.decorators, PgenericSelectionExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.decorators, PconsGenericAssoc.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.decorators, PnilGenericAssoc.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.decorators, PgenericAssoc.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NSpecialSpecifier.decorators, PalignasSpecifier.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NUnaryTypeOp.decorators, PalignofOp.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.decorators, PatomicTypeExpr.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NType.decorators, PatomicType.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NStorageClass.decorators, PthreadLocalStorageClass.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.NDecl.decorators, PstaticAssertDecl.class);
	}

	private static void setupInheritedAttributes(){
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = "edu:umn:cs:melt:ableC:abstractsyntax:pps";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = "silver:langutil:errors";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = "edu:umn:cs:melt:ableC:abstractsyntax:env:defs";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.occurs_inh[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs] = "edu:umn:cs:melt:ableC:abstractsyntax:env:env";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssocs.decorators.add(edu.umn.cs.melt.ableC.abstractsyntax.env.Denv.singleton);
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc] = "silver:langutil:pp";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc] = "silver:langutil:errors";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc] = "edu:umn:cs:melt:ableC:abstractsyntax:env:defs";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.occurs_inh[edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc] = "edu:umn:cs:melt:ableC:abstractsyntax:env:env";
		edu.umn.cs.melt.ableC.abstractsyntax.c11.NGenericAssoc.decorators.add(edu.umn.cs.melt.ableC.abstractsyntax.env.Denv.singleton);
	}

	private static void initProductionAttributeDefinitions(){
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PnoreturnQualifier.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericSelectionExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PconsGenericAssoc.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PnilGenericAssoc.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PgenericAssoc.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PalignasSpecifier.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PalignofOp.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PatomicTypeExpr.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PatomicType.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PthreadLocalStorageClass.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.PstaticAssertDecl.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_noreturnQualifier = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_genericSelectionExpr = 0;
	public static int count_inh__ON__GenericAssocs = 0;
	public static int count_syn__ON__GenericAssocs = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_consGenericAssoc = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_nilGenericAssoc = 0;
	public static int count_inh__ON__GenericAssoc = 0;
	public static int count_syn__ON__GenericAssoc = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_genericAssoc = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_alignasSpecifier = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_alignofOp = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_atomicTypeExpr = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_atomicType = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_threadLocalStorageClass = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_staticAssertDecl = 0;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_pps__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_syn__ON__GenericAssocs++;
public static final int silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_syn__ON__GenericAssocs++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_syn__ON__GenericAssocs++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssocs = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_inh__ON__GenericAssocs++;
public static final int silver_langutil_pp__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_syn__ON__GenericAssoc++;
public static final int silver_langutil_errors__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_syn__ON__GenericAssoc++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_defs__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_syn__ON__GenericAssoc++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_env__ON__edu_umn_cs_melt_ableC_abstractsyntax_c11_GenericAssoc = edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.count_inh__ON__GenericAssoc++;
}
