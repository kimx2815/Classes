package edu.umn.cs.melt.ableC.abstractsyntax.env;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.initAllStatics();
		core.Init.initAllStatics();
		silver.util.raw.treemap.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.initAllStatics();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.init();
		core.Init.init();
		silver.util.raw.treemap.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.init();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		edu.umn.cs.melt.ableC.abstractsyntax.gcc.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.c11.Init.postInit();
		core.Init.postInit();
		silver.util.raw.treemap.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.Init.postInit();
		edu.umn.cs.melt.ableC.abstractsyntax.env.Init.postInit();


		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.decorators, PdeclaratorValueItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.decorators, PfunctionValueItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.decorators, PfieldValueItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.decorators, PenumValueItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.decorators, PparameterValueItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NValueItem.decorators, PerrorValueItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem.decorators, PstructTagItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem.decorators, PunionTagItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem.decorators, PenumTagItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NTagItem.decorators, PerrorTagItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NLabelItem.decorators, PlabelItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NLabelItem.decorators, PerrorLabelItem.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NEnv.decorators, PemptyEnv_i.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NEnv.decorators, PaddEnv_i.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NEnv.decorators, PopenScope_i.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NDefs.decorators, PnilDefs.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NDefs.decorators, PconsDefs.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.decorators, PlabelDef.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.decorators, PtagDef.class);
		common.Decorator.applyDecorators(edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.decorators, PvalueDef.class);
	}

	private static void setupInheritedAttributes(){
		edu.umn.cs.melt.ableC.abstractsyntax.env.NEnv.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_labels__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Env] = "edu:umn:cs:melt:ableC:abstractsyntax:env:labels";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NEnv.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Env] = "edu:umn:cs:melt:ableC:abstractsyntax:env:tags";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NEnv.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_values__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Env] = "edu:umn:cs:melt:ableC:abstractsyntax:env:values";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDefs.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_labelContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Defs] = "edu:umn:cs:melt:ableC:abstractsyntax:env:labelContribs";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDefs.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_tagContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Defs] = "edu:umn:cs:melt:ableC:abstractsyntax:env:tagContribs";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDefs.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_valueContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Defs] = "edu:umn:cs:melt:ableC:abstractsyntax:env:valueContribs";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_labelContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def] = "edu:umn:cs:melt:ableC:abstractsyntax:env:labelContribs";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_tagContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def] = "edu:umn:cs:melt:ableC:abstractsyntax:env:tagContribs";
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.occurs_syn[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_valueContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def] = "edu:umn:cs:melt:ableC:abstractsyntax:env:valueContribs";
	}

	private static void initProductionAttributeDefinitions(){
		edu.umn.cs.melt.ableC.abstractsyntax.env.PdeclaratorValueItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PfunctionValueItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PfieldValueItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PenumValueItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PparameterValueItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PerrorValueItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PstructTagItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PunionTagItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PenumTagItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PerrorTagItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PlabelItem.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PerrorLabelItem.initProductionAttributeDefinitions();
		//FUNCTION augmentScope_i Scope<a> ::= d::Contribs<a> s::Scope<a> 
		//FUNCTION readScope_i [a] ::= name::String scope::Scope<a> 
		edu.umn.cs.melt.ableC.abstractsyntax.env.PemptyEnv_i.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PaddEnv_i.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PopenScope_i.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PnilDefs.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PconsDefs.initProductionAttributeDefinitions();
		//ASPECT DEFAULT PRODUCTION for Def
		// top.labelContribs = []
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.defaultSynthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_labelContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.tagContribs = []
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.defaultSynthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_tagContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		// top.valueContribs = []
		edu.umn.cs.melt.ableC.abstractsyntax.env.NDef.defaultSynthesizedAttributes[edu.umn.cs.melt.ableC.abstractsyntax.env.Init.edu_umn_cs_melt_ableC_abstractsyntax_env_valueContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } };
		//FUNCTION emptyEnv Decorated Env ::= 
		//FUNCTION addEnv Decorated Env ::= d::[Def] e::Decorated Env 
		//FUNCTION openScope Decorated Env ::= e::Decorated Env 
		//FUNCTION lookupValue [ValueItem] ::= n::String e::Decorated Env 
		//FUNCTION lookupTag [TagItem] ::= n::String e::Decorated Env 
		//FUNCTION lookupLabel [LabelItem] ::= n::String e::Decorated Env 
		//FUNCTION lookupValueInLocalScope [ValueItem] ::= n::String e::Decorated Env 
		//FUNCTION lookupTagInLocalScope [TagItem] ::= n::String e::Decorated Env 
		//FUNCTION lookupLabelInLocalScope [LabelItem] ::= n::String e::Decorated Env 
		edu.umn.cs.melt.ableC.abstractsyntax.env.PlabelDef.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PtagDef.initProductionAttributeDefinitions();
		edu.umn.cs.melt.ableC.abstractsyntax.env.PvalueDef.initProductionAttributeDefinitions();
	}

	public static int count_inh__ON__ValueItem = 0;
	public static int count_syn__ON__ValueItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_declaratorValueItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_functionValueItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_fieldValueItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_enumValueItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_parameterValueItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_errorValueItem = 0;
	public static int count_inh__ON__TagItem = 0;
	public static int count_syn__ON__TagItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_structTagItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_unionTagItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_enumTagItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_errorTagItem = 0;
	public static int count_inh__ON__LabelItem = 0;
	public static int count_syn__ON__LabelItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_labelItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_errorLabelItem = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_augmentScope_i = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_readScope_i = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_emptyEnv_i = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_addEnv_i = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_openScope_i = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_nilDefs = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_consDefs = 0;
	public static int count_inh__ON__Env = 0;
	public static int count_syn__ON__Env = 0;
	public static int count_inh__ON__Defs = 0;
	public static int count_syn__ON__Defs = 0;
	public static int count_inh__ON__Def = 0;
	public static int count_syn__ON__Def = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_emptyEnv = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_addEnv = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_openScope = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_lookupValue = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_lookupTag = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_lookupLabel = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_lookupValueInLocalScope = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_lookupTagInLocalScope = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_lookupLabelInLocalScope = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_labelDef = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_tagDef = 0;
	public static int count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_valueDef = 0;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_labels__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Env = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Env++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_tags__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Env = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Env++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_values__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Env = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Env++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_labelContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Defs = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Defs++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_tagContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Defs = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Defs++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_valueContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Defs = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Defs++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_labelContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Def++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_tagContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Def++;
public static final int edu_umn_cs_melt_ableC_abstractsyntax_env_valueContribs__ON__edu_umn_cs_melt_ableC_abstractsyntax_env_Def = edu.umn.cs.melt.ableC.abstractsyntax.env.Init.count_syn__ON__Def++;
}
