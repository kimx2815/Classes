package edu.umn.cs.melt.ableC.concretesyntax.c11;

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
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.initAllStatics();
		core.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.init();
		core.Init.init();
		silver.langutil.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.Init.init();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.cppTags.Init.postInit();
		core.Init.postInit();
		silver.langutil.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.Init.postInit();
		edu.umn.cs.melt.ableC.concretesyntax.c11.Init.postInit();


		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_11_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NDeclarationSpecifiers_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_19_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NAlignmentSpecifier_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_34_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NAlignmentSpecifier_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_41_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NFunctionSpecifier_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_48_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NPrimaryExpr_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_74_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_77_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssoc_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_83_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssoc_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_86_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NTypeSpecifier_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_105_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NTypeQualifier_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_110_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NStorageClassSpecifier_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_125_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.c11.NStaticAssertDeclaration_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NDeclaration_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_139_0.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.concretesyntax.NUnaryExpr_c.decorators, PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_147_0.class);
	}

	private static void setupInheritedAttributes(){
		edu.umn.cs.melt.ableC.concretesyntax.c11.NAlignmentSpecifier_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.edu_umn_cs_melt_ableC_concretesyntax_specialSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_AlignmentSpecifier_c] = "edu:umn:cs:melt:ableC:concretesyntax:specialSpecifiers";
		edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericSelection_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericSelection_c] = "silver:langutil:ast";
		edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c] = "silver:langutil:ast";
		edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssocList_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.edu_umn_cs_melt_ableC_concretesyntax_c11_defaultExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c] = "edu:umn:cs:melt:ableC:concretesyntax:c11:defaultExpr";
		edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssoc_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssoc_c] = "silver:langutil:ast";
		edu.umn.cs.melt.ableC.concretesyntax.c11.NGenericAssoc_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.edu_umn_cs_melt_ableC_concretesyntax_c11_defaultExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssoc_c] = "edu:umn:cs:melt:ableC:concretesyntax:c11:defaultExpr";
		edu.umn.cs.melt.ableC.concretesyntax.c11.NStaticAssertDeclaration_c.occurs_syn[edu.umn.cs.melt.ableC.concretesyntax.c11.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_StaticAssertDeclaration_c] = "silver:langutil:ast";
	}

	private static void initProductionAttributeDefinitions(){
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_11_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_19_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_34_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_41_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_48_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_74_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_77_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_83_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_86_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_105_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_110_0.initProductionAttributeDefinitions();
		//FUNCTION atomicMutator ast:BaseTypeExpr ::= q::[ast:Qualifier] bt::ast:BaseTypeExpr 
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_125_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_139_0.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.concretesyntax.c11.PP_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_147_0.initProductionAttributeDefinitions();
	}

	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_11_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_19_0 = 0;
	public static int count_inh__ON__AlignmentSpecifier_c = 0;
	public static int count_syn__ON__AlignmentSpecifier_c = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_34_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_41_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_48_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_55_0 = 0;
	public static int count_inh__ON__GenericSelection_c = 0;
	public static int count_syn__ON__GenericSelection_c = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_60_0 = 0;
	public static int count_inh__ON__GenericAssocList_c = 0;
	public static int count_syn__ON__GenericAssocList_c = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_74_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_77_0 = 0;
	public static int count_inh__ON__GenericAssoc_c = 0;
	public static int count_syn__ON__GenericAssoc_c = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_83_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_86_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_105_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_110_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_atomicMutator = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_125_0 = 0;
	public static int count_inh__ON__StaticAssertDeclaration_c = 0;
	public static int count_syn__ON__StaticAssertDeclaration_c = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_135_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_139_0 = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_P_edu_umn_cs_melt_ableC_concretesyntax_c11C11_sv_147_0 = 0;
public static final int edu_umn_cs_melt_ableC_concretesyntax_specialSpecifiers__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_AlignmentSpecifier_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__AlignmentSpecifier_c++;
public static final int silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericSelection_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__GenericSelection_c++;
public static final int silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__GenericAssocList_c++;
public static final int edu_umn_cs_melt_ableC_concretesyntax_c11_defaultExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssocList_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__GenericAssocList_c++;
public static final int silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssoc_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__GenericAssoc_c++;
public static final int edu_umn_cs_melt_ableC_concretesyntax_c11_defaultExpr__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_GenericAssoc_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__GenericAssoc_c++;
public static final int silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_StaticAssertDeclaration_c = edu.umn.cs.melt.ableC.concretesyntax.c11.Init.count_syn__ON__StaticAssertDeclaration_c++;
}
