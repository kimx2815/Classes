
package lambda_calculus.host.concretesyntax;

// l::LamExpr ::= lambda::Lambda_t n::Name_t ':' t::Type '.' b::LamExpr 
public final class PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0 extends lambda_calculus.host.concretesyntax.NLamExpr {

	public static final int i_lambda = 0;
	public static final int i_n = 1;
	public static final int i__G_3 = 2;
	public static final int i_t = 3;
	public static final int i__G_1 = 4;
	public static final int i_b = 5;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,common.TerminalRecord.class,common.TerminalRecord.class,lambda_calculus.host.concretesyntax.NType.class,common.TerminalRecord.class,lambda_calculus.host.concretesyntax.NLamExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_65_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NLamExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NLamExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[6][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_t] = new common.Lazy[lambda_calculus.host.concretesyntax.NType.num_inh_attrs];
	childInheritedAttributes[i_b] = new common.Lazy[lambda_calculus.host.concretesyntax.NLamExpr.num_inh_attrs];

	}

	public PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0(final Object c_lambda, final Object c_n, final Object c__G_3, final Object c_t, final Object c__G_1, final Object c_b) {
		super();
		this.child_lambda = c_lambda;
		this.child_n = c_n;
		this.child__G_3 = c__G_3;
		this.child_t = c_t;
		this.child__G_1 = c__G_1;
		this.child_b = c_b;

	}

	private Object child_lambda;
	public final common.TerminalRecord getChild_lambda() {
		return (common.TerminalRecord) (child_lambda = common.Util.demand(child_lambda));
	}

	private Object child_n;
	public final common.TerminalRecord getChild_n() {
		return (common.TerminalRecord) (child_n = common.Util.demand(child_n));
	}

	private Object child__G_3;
	public final common.TerminalRecord getChild__G_3() {
		return (common.TerminalRecord) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_t;
	public final lambda_calculus.host.concretesyntax.NType getChild_t() {
		return (lambda_calculus.host.concretesyntax.NType) (child_t = common.Util.demand(child_t));
	}

	private Object child__G_1;
	public final common.TerminalRecord getChild__G_1() {
		return (common.TerminalRecord) (child__G_1 = common.Util.demand(child__G_1));
	}

	private Object child_b;
	public final lambda_calculus.host.concretesyntax.NLamExpr getChild_b() {
		return (lambda_calculus.host.concretesyntax.NLamExpr) (child_b = common.Util.demand(child_b));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_lambda: return getChild_lambda();
			case i_n: return getChild_n();
			case i__G_3: return getChild__G_3();
			case i_t: return getChild_t();
			case i__G_1: return getChild__G_1();
			case i_b: return getChild_b();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_lambda: return child_lambda;
			case i_n: return child_n;
			case i__G_3: return child__G_3;
			case i_t: return child_t;
			case i__G_1: return child__G_1;
			case i_b: return child_b;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 6;
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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_65_0 erroneously claimed to forward");
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
		return "lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_65_0";
	}

	static void initProductionAttributeDefinitions() {
		// l.pp = "( \\ " ++ n.lexeme ++ " : " ++ t.pp ++ " . " ++ b.pp ++ " )"
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_LamExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( \\ ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)((common.TerminalRecord)context.childAsIs(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.i_n)).lexeme), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" : ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.i_t).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Type)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" . ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.i_b).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_LamExpr)), (common.StringCatter)(new common.StringCatter(" )")))))))); } };
		// l.ast_Expr = abs:lambda(n.lexeme, t.ast_Type, b.ast_Expr,)
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_LamExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NExpr)new lambda_calculus.host.abstractsyntax.Plambda(((common.StringCatter)((common.TerminalRecord)context.childAsIs(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.i_n)).lexeme), context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.i_t, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Type__ON__lambda_calculus_host_concretesyntax_Type), context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0.i_b, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_LamExpr))); } };

	}

	public static final common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0> {

		@Override
		public PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_lambda_calculus_host_concretesyntaxSyntax_sv_65_0(children[0], children[1], children[2], children[3], children[4], children[5]);
		}
	};

}
