
package lambda_calculus.host.abstractsyntax;

// e::Expr ::= f::Expr a::Expr 
public final class Papplication extends lambda_calculus.host.abstractsyntax.NExpr {

	public static final int i_f = 0;
	public static final int i_a = 1;


	public static final Class<?> childTypes[] = {lambda_calculus.host.abstractsyntax.NExpr.class,lambda_calculus.host.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_application;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_f] = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_a] = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	}

	public Papplication(final Object c_f, final Object c_a) {
		super();
		this.child_f = c_f;
		this.child_a = c_a;

	}

	private Object child_f;
	public final lambda_calculus.host.abstractsyntax.NExpr getChild_f() {
		return (lambda_calculus.host.abstractsyntax.NExpr) (child_f = common.Util.demand(child_f));
	}

	private Object child_a;
	public final lambda_calculus.host.abstractsyntax.NExpr getChild_a() {
		return (lambda_calculus.host.abstractsyntax.NExpr) (child_a = common.Util.demand(child_a));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_f: return getChild_f();
			case i_a: return getChild_a();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_f: return child_f;
			case i_a: return child_a;

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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:abstractsyntax:application erroneously claimed to forward");
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
		return "lambda_calculus:host:abstractsyntax:application";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = "( " ++ f.pp ++ " ) ( " ++ a.pp ++ " )"
		lambda_calculus.host.abstractsyntax.Papplication.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.Papplication.i_f).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ) ( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.Papplication.i_a).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(" )")))))); } };
		// e.errors := []
		if(lambda_calculus.host.abstractsyntax.Papplication.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr] == null)
			lambda_calculus.host.abstractsyntax.Papplication.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr] = new lambda_calculus.host.abstractsyntax.CAerrors(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr);
		((common.CollectionAttribute)lambda_calculus.host.abstractsyntax.Papplication.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<Papplication> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Papplication> {

		@Override
		public Papplication invoke(final Object[] children, final Object[] annotations) {
			return new Papplication(children[0], children[1]);
		}
	};

}
