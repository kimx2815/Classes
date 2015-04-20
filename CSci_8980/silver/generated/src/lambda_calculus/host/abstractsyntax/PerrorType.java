
package lambda_calculus.host.abstractsyntax;

// t::Type ::= 
public final class PerrorType extends lambda_calculus.host.abstractsyntax.NType {



	public static final Class<?> childTypes[] = {};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_errorType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[0][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PerrorType() {
		super();

	}



	@Override
	public Object getChild(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 0;
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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:abstractsyntax:errorType erroneously claimed to forward");
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
		return "lambda_calculus:host:abstractsyntax:errorType";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = "Error"
		lambda_calculus.host.abstractsyntax.PerrorType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Type] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return (new common.StringCatter("Error")); } };
		// t.errors := []
		if(lambda_calculus.host.abstractsyntax.PerrorType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type] == null)
			lambda_calculus.host.abstractsyntax.PerrorType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type] = new lambda_calculus.host.abstractsyntax.CAerrors(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type);
		((common.CollectionAttribute)lambda_calculus.host.abstractsyntax.PerrorType.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Type]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<PerrorType> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PerrorType> {

		@Override
		public PerrorType invoke(final Object[] children, final Object[] annotations) {
			return new PerrorType();
		}
	};

}
