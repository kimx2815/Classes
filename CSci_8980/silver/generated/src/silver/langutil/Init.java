package silver.langutil;

public class Init{

	private static boolean preInit = false;
	private static boolean init = false;
	private static boolean postInit = false;

	public static void initAllStatics(){
		if(preInit) return;
		preInit = true;

		core.Init.initAllStatics();
		silver.langutil.pp.Init.initAllStatics();
		silver.langutil.Init.initAllStatics();

	}

	public static void init(){
		if(init) return;
		init = true;

		setupInheritedAttributes();

		core.Init.init();
		silver.langutil.pp.Init.init();
		silver.langutil.Init.init();

		initProductionAttributeDefinitions();
	}

	public static void postInit(){
		if(postInit) return;
		postInit = true;

		core.Init.postInit();
		silver.langutil.pp.Init.postInit();
		silver.langutil.Init.postInit();


		common.Decorator.applyDecorators(silver.langutil.NMessage.decorators, Perr.class);
		common.Decorator.applyDecorators(silver.langutil.NMessage.decorators, Pwrn.class);
	}

	private static void setupInheritedAttributes(){
		silver.langutil.NMessage.occurs_syn[silver.langutil.Init.silver_langutil_message__ON__silver_langutil_Message] = "silver:langutil:message";
		silver.langutil.NMessage.occurs_syn[silver.langutil.Init.silver_langutil_where__ON__silver_langutil_Message] = "silver:langutil:where";
		silver.langutil.NMessage.occurs_syn[silver.langutil.Init.silver_langutil_output__ON__silver_langutil_Message] = "silver:langutil:output";
		silver.langutil.NMessage.occurs_syn[silver.langutil.Init.silver_langutil_severity__ON__silver_langutil_Message] = "silver:langutil:severity";
	}

	private static void initProductionAttributeDefinitions(){
		silver.langutil.Perr.initProductionAttributeDefinitions();
		silver.langutil.Pwrn.initProductionAttributeDefinitions();
		//FUNCTION containsErrors Boolean ::= l::[Message] wError::Boolean 
		//FUNCTION messagesToString String ::= msgs::[Message] 
		//FUNCTION messageLte Boolean ::= m1::Message m2::Message 
	}

	public static int count_inh__ON__Message = 0;
	public static int count_syn__ON__Message = 0;
	public static int count_local__ON__silver_langutil_err = 0;
	public static int count_local__ON__silver_langutil_wrn = 0;
	public static int count_local__ON__silver_langutil_containsErrors = 0;
	public static int count_local__ON__silver_langutil_messagesToString = 0;
	public static int count_local__ON__silver_langutil_messageLte = 0;
public static final int silver_langutil_message__ON__silver_langutil_Message = silver.langutil.Init.count_syn__ON__Message++;
public static final int silver_langutil_where__ON__silver_langutil_Message = silver.langutil.Init.count_syn__ON__Message++;
public static final int silver_langutil_output__ON__silver_langutil_Message = silver.langutil.Init.count_syn__ON__Message++;
public static final int silver_langutil_severity__ON__silver_langutil_Message = silver.langutil.Init.count_syn__ON__Message++;
}
