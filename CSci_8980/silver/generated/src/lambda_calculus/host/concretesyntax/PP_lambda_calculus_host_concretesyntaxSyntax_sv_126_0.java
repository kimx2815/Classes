
package lambda_calculus.host.concretesyntax;

// e::Expr ::= l::Expr '&&' r::Expr 
public final class PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0 extends lambda_calculus.host.concretesyntax.NExpr {

	public static final int i_l = 0;
	public static final int i__G_1 = 1;
	public static final int i_r = 2;


	public static final Class<?> childTypes[] = {lambda_calculus.host.concretesyntax.NExpr.class,common.TerminalRecord.class,lambda_calculus.host.concretesyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_126_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[3][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_l] = new common.Lazy[lambda_calculus.host.concretesyntax.NExpr.num_inh_attrs];
	childInheritedAttributes[i_r] = new common.Lazy[lambda_calculus.host.concretesyntax.NExpr.num_inh_attrs];

	}

	public PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0(final Object c_l, final Object c__G_1, final Object c_r) {
		super();
		this.child_l = c_l;
		this.child__G_1 = c__G_1;
		this.child_r = c_r;

	}

	private Object child_l;
	public final lambda_calculus.host.concretesyntax.NExpr getChild_l() {
		return (lambda_calculus.host.concretesyntax.NExpr) (child_l = common.Util.demand(child_l));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child_r;
	public final lambda_calculus.host.concretesyntax.NExpr getChild_r() {
		return (lambda_calculus.host.concretesyntax.NExpr) (child_r = common.Util.demand(child_r));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();
			case i__G_1: return getChild__G_1();
			case i_r: return getChild_r();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;
			case i__G_1: return child__G_1;
			case i_r: return child_r;

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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_126_0 erroneously claimed to forward");
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
		return "lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_126_0";
	}

	static void initProductionAttributeDefinitions() {
		// e.pp = "( " ++ l.pp ++ " && " ++ r.pp ++ " )"
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.i_l).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Expr)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" && ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.i_r).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Expr)), (common.StringCatter)(new common.StringCatter(" )")))))); } };
		// e.ast_Expr = abs:andOperator(l.ast_Expr, r.ast_Expr,)
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_Expr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NExpr)new lambda_calculus.host.abstractsyntax.PandOperator(context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.i_l, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_Expr), context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0.i_r, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_Expr))); } };

	}

	public static final common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0> {

		@Override
		public PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_lambda_calculus_host_concretesyntaxSyntax_sv_126_0(children[0], children[1], children[2]);
		}
	};

}
