
package lambda_calculus.host.concretesyntax;

// t::Type ::= inType::Type '->' outType::Type 
public final class PfunctionType extends lambda_calculus.host.concretesyntax.NType {

	public static final int i_inType = 0;
	public static final int i__G_1 = 1;
	public static final int i_outType = 2;


	public static final Class<?> childTypes[] = {lambda_calculus.host.concretesyntax.NType.class,common.TerminalRecord.class,lambda_calculus.host.concretesyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_concretesyntax_functionType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_inType] = new common.Lazy[lambda_calculus.host.concretesyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_outType] = new common.Lazy[lambda_calculus.host.concretesyntax.NType.num_inh_attrs];

	}

	public PfunctionType(final Object c_inType, final Object c__G_1, final Object c_outType) {
		super();
		this.child_inType = c_inType;
		this.child__G_1 = c__G_1;
		this.child_outType = c_outType;

	}

	private Object child_inType;
	public final lambda_calculus.host.concretesyntax.NType getChild_inType() {
		return (lambda_calculus.host.concretesyntax.NType) (child_inType = common.Util.demand(child_inType));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child_outType;
	public final lambda_calculus.host.concretesyntax.NType getChild_outType() {
		return (lambda_calculus.host.concretesyntax.NType) (child_outType = common.Util.demand(child_outType));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_inType: return getChild_inType();
			case i__G_1: return getChild__G_1();
			case i_outType: return getChild_outType();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_inType: return child_inType;
			case i__G_1: return child__G_1;
			case i_outType: return child_outType;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 3;
	}

	@Override
	public common.Lazy getSynthesized(final int index) {
		return synthesizedAttributes[index];
	}

	@Override
	public common.Lazy[] getLocalInheritedAttributes(final int key) {
		return localInheritedAttributes[key];
	}

	@Override
	public common.Lazy[] getChildInheritedAttributes(final int key) {
		return childInheritedAttributes[key];
	}

	@Override
	public boolean hasForward() {
		return false;
	}

	@Override
	public common.Node evalForward(final common.DecoratedNode context) {
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:concretesyntax:functionType erroneously claimed to forward");
	}

	@Override
	public common.Lazy getForwardInheritedAttributes(final int index) {
		return forwardInheritedAttributes[index];
	}

	@Override
	public common.Lazy getLocal(final int key) {
		return localAttributes[key];
	}

	@Override
	public final int getNumberOfLocalAttrs() {
		return num_local_attrs;
	}

	@Override
	public final String getNameOfLocalAttr(final int index) {
		return occurs_local[index];
	}

	@Override
	public String getName() {
		return "lambda_calculus:host:concretesyntax:functionType";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = "( " ++ inType.pp ++ " -> " ++ outType.pp ++ " )"
		lambda_calculus.host.concretesyntax.PfunctionType.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PfunctionType.i_inType).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Type)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" -> ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PfunctionType.i_outType).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Type)), (common.StringCatter)(new common.StringCatter(" )")))))); } };
		// t.ast_Type = abs:functionType(inType.ast_Type, outType.ast_Type,)
		lambda_calculus.host.concretesyntax.PfunctionType.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Type__ON__lambda_calculus_host_concretesyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NType)new lambda_calculus.host.abstractsyntax.PfunctionType(context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PfunctionType.i_inType, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Type__ON__lambda_calculus_host_concretesyntax_Type), context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PfunctionType.i_outType, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Type__ON__lambda_calculus_host_concretesyntax_Type))); } };

	}

	public static final common.NodeFactory<PfunctionType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PfunctionType> {

		@Override
		public PfunctionType invoke(final Object[] children, final Object[] annotations) {
			return new PfunctionType(children[0], children[1], children[2]);
		}
	};

}
