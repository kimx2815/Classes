
package lambda_calculus.host.abstractsyntax;

// e::Expr ::= l::Expr r::Expr 
public final class PgreaterEqual extends lambda_calculus.host.abstractsyntax.NExpr {

	public static final int i_l = 0;
	public static final int i_r = 1;


	public static final Class<?> childTypes[] = {lambda_calculus.host.abstractsyntax.NExpr.class,lambda_calculus.host.abstractsyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_abstractsyntax_greaterEqual;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_l] = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[lambda_calculus.host.abstractsyntax.NExpr.num_inh_attrs];

	}

	public PgreaterEqual(final Object c_l, final Object c_r) {
		super();
		this.child_l = c_l;
		this.child_r = c_r;

	}

	private Object child_l;
	public final lambda_calculus.host.abstractsyntax.NExpr getChild_l() {
		return (lambda_calculus.host.abstractsyntax.NExpr) (child_l = common.Util.demand(child_l));
	}

	private Object child_r;
	public final lambda_calculus.host.abstractsyntax.NExpr getChild_r() {
		return (lambda_calculus.host.abstractsyntax.NExpr) (child_r = common.Util.demand(child_r));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();
			case i_r: return getChild_r();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;
			case i_r: return child_r;

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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:abstractsyntax:greaterEqual erroneously claimed to forward");
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
		return "lambda_calculus:host:abstractsyntax:greaterEqual";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = "( " ++ l.pp ++ " >= " ++ r.pp ++ " )"
		lambda_calculus.host.abstractsyntax.PgreaterEqual.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.PgreaterEqual.i_l).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" >= ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.abstractsyntax.PgreaterEqual.i_r).synthesized(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_pp__ON__lambda_calculus_host_abstractsyntax_Expr)), (common.StringCatter)(new common.StringCatter(" )")))))); } };
		// e.errors := []
		if(lambda_calculus.host.abstractsyntax.PgreaterEqual.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr] == null)
			lambda_calculus.host.abstractsyntax.PgreaterEqual.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr] = new lambda_calculus.host.abstractsyntax.CAerrors(lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr);
		((common.CollectionAttribute)lambda_calculus.host.abstractsyntax.PgreaterEqual.synthesizedAttributes[lambda_calculus.host.abstractsyntax.Init.lambda_calculus_host_abstractsyntax_errors__ON__lambda_calculus_host_abstractsyntax_Expr]).setBase(new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.ConsCell)core.Pnil.invoke()); } });

	}

	public static final common.NodeFactory<PgreaterEqual> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PgreaterEqual> {

		@Override
		public PgreaterEqual invoke(final Object[] children, final Object[] annotations) {
			return new PgreaterEqual(children[0], children[1]);
		}
	};

}
