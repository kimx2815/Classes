
package lambda_calculus.host.abstractsyntax;

// t::Type ::= inType::Type outType::Type 
public final class PfunctionType extends lambda_calculus.host.abstractsyntax.NType {

	public static final int i_inType = 0;
	public static final int i_outType = 1;


	public static final Class<?> childTypes[] = {lambda_calculus.host.abstractsyntax.NType.class,lambda_calculus.host.abstractsyntax.NType.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_functionType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_inType] = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_outType] = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];

	}

	public PfunctionType(final Object c_inType, final Object c_outType) {
		super();
		this.child_inType = c_inType;
		this.child_outType = c_outType;

	}

	private Object child_inType;
	public final lambda_calculus.host.abstractsyntax.NType getChild_inType() {
		return (lambda_calculus.host.abstractsyntax.NType) (child_inType = common.Util.demand(child_inType));
	}

	private Object child_outType;
	public final lambda_calculus.host.abstractsyntax.NType getChild_outType() {
		return (lambda_calculus.host.abstractsyntax.NType) (child_outType = common.Util.demand(child_outType));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_inType: return getChild_inType();
			case i_outType: return getChild_outType();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_inType: return child_inType;
			case i_outType: return child_outType;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:abstractsyntax:functionType erroneously claimed to forward");
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
		return "lambda_calculus:host:abstractsyntax:functionType";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = "( " ++ inType.pp ++ " -> " ++ outType.pp ++ " )"
		lambda_calculus.host.abstractsyntax.PfunctionType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.PfunctionType.i_inType).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Type)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" -> ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.PfunctionType.i_outType).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Type)), (common.StringCatter)(new common.StringCatter(" )")))))); } };
		// t.errors := []
		if(lambda_calculus.host.abstractsyntax.PfunctionType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type] == null)
			lambda_calculus.host.abstractsyntax.PfunctionType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type] = new lambda_calculus.host.abstractsyntax.CAerrors(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type);
		((common.CollectionAttribute)lambda_calculus.host.abstractsyntax.PfunctionType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<PfunctionType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PfunctionType> {

		@Override
		public PfunctionType invoke(final Object[] children, final Object[] annotations) {
			return new PfunctionType(children[0], children[1]);
		}
	};

}
