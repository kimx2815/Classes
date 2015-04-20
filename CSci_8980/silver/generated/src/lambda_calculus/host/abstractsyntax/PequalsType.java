
package lambda_calculus.host.abstractsyntax;

public final class PequalsType extends common.FunctionNode {

	public static final int i_t1 = 0;
	public static final int i_t2 = 1;


	public static final Class<?> childTypes[] = { lambda_calculus.host.abstractsyntax.NType.class,lambda_calculus.host.abstractsyntax.NType.class };

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_equalsType;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_t1] = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_t2] = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];

	}

	public PequalsType(final Object c_t1, final Object c_t2) {
		this.child_t1 = c_t1;
		this.child_t2 = c_t2;

	}

	private Object child_t1;
	public final lambda_calculus.host.abstractsyntax.NType getChild_t1() {
		return (lambda_calculus.host.abstractsyntax.NType) (child_t1 = common.Util.demand(child_t1));
	}

	private Object child_t2;
	public final lambda_calculus.host.abstractsyntax.NType getChild_t2() {
		return (lambda_calculus.host.abstractsyntax.NType) (child_t2 = common.Util.demand(child_t2));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_t1: return getChild_t1();
			case i_t2: return getChild_t2();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_t1: return child_t1;
			case i_t2: return child_t2;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 2;
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
		return "lambda_calculus:host:abstractsyntax:equalsType";
	}

	public static Boolean invoke(final Object c_t1, final Object c_t2) {
		try {
		final common.DecoratedNode context = new PequalsType(c_t1, c_t2).decorate();
		//t1.equalsTo
		return (Boolean)(((Boolean)context.childDecorated(lambda_calculus.host.abstractsyntax.PequalsType.i_t1).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_equalsTo__ON__lambda_calculus_host_abstractsyntax_Type)));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function lambda_calculus:host:abstractsyntax:equalsType", t);
		}
	}

	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {
		@Override
		public Boolean invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PequalsType.invoke(children[0], children[1]);
		}
	};
}