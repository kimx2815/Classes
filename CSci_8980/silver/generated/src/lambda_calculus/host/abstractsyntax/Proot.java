
package lambda_calculus.host.abstractsyntax;

// r::Root ::= e::Expr 
public final class Proot extends lambda_calculus.host.abstractsyntax.NRoot {

	public static final int i_e = 0;


	public static final Class<?> childTypes[] = {lambda_calculus.host.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_root;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NRoot.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NRoot.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	}

	public Proot(final Object c_e) {
		super();
		this.child_e = c_e;

	}

	private Object child_e;
	public final lambda_calculus.host.abstractsyntax.NExpr getChild_e() {
		return (lambda_calculus.host.abstractsyntax.NExpr) (child_e = common.Util.demand(child_e));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_e: return getChild_e();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_e: return child_e;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:abstractsyntax:root erroneously claimed to forward");
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
		return "lambda_calculus:host:abstractsyntax:root";
	}

	static void initProductionAttributeDefinitions() {
		// r.pp = e.pp
		lambda_calculus.host.abstractsyntax.Proot.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.Proot.i_e).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr)); } };
		// r.errors := []
		if(lambda_calculus.host.abstractsyntax.Proot.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root] == null)
			lambda_calculus.host.abstractsyntax.Proot.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root] = new lambda_calculus.host.abstractsyntax.CAerrors(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root);
		((common.CollectionAttribute)lambda_calculus.host.abstractsyntax.Proot.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Root]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<Proot> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Proot> {

		@Override
		public Proot invoke(final Object[] children, final Object[] annotations) {
			return new Proot(children[0]);
		}
	};

}
