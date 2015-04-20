
package lambda_calculus.host.abstractsyntax;

// e::Expr ::= n::String t::Type b::Expr 
public final class Plambda extends lambda_calculus.host.abstractsyntax.NExpr {

	public static final int i_n = 0;
	public static final int i_t = 1;
	public static final int i_b = 2;


	public static final Class<?> childTypes[] = {common.StringCatter.class,lambda_calculus.host.abstractsyntax.NType.class,lambda_calculus.host.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_lambda;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_t] = new common.Lazy[lambda_calculus.host.abstractsyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_b] = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	}

	public Plambda(final Object c_n, final Object c_t, final Object c_b) {
		super();
		this.child_n = c_n;
		this.child_t = c_t;
		this.child_b = c_b;

	}

	private Object child_n;
	public final common.StringCatter getChild_n() {
		return (common.StringCatter) (child_n = common.Util.demand(child_n));
	}

	private Object child_t;
	public final lambda_calculus.host.abstractsyntax.NType getChild_t() {
		return (lambda_calculus.host.abstractsyntax.NType) (child_t = common.Util.demand(child_t));
	}

	private Object child_b;
	public final lambda_calculus.host.abstractsyntax.NExpr getChild_b() {
		return (lambda_calculus.host.abstractsyntax.NExpr) (child_b = common.Util.demand(child_b));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_n: return getChild_n();
			case i_t: return getChild_t();
			case i_b: return getChild_b();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_n: return child_n;
			case i_t: return child_t;
			case i_b: return child_b;

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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:abstractsyntax:lambda erroneously claimed to forward");
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
		return "lambda_calculus:host:abstractsyntax:lambda";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = "( \\ " ++ n ++ " : " ++ t.pp ++ " . " ++ b.pp ++ " )"
		lambda_calculus.host.abstractsyntax.Plambda.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( \\ ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childAsIs(lambda_calculus.host.abstractsyntax.Plambda.i_n)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" : ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.Plambda.i_t).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Type)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" . ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.Plambda.i_b).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(" )")))))))); } };
		// e.errors := []
		if(lambda_calculus.host.abstractsyntax.Plambda.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr] == null)
			lambda_calculus.host.abstractsyntax.Plambda.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr] = new lambda_calculus.host.abstractsyntax.CAerrors(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr);
		((common.CollectionAttribute)lambda_calculus.host.abstractsyntax.Plambda.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<Plambda> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Plambda> {

		@Override
		public Plambda invoke(final Object[] children, final Object[] annotations) {
			return new Plambda(children[0], children[1], children[2]);
		}
	};

}
