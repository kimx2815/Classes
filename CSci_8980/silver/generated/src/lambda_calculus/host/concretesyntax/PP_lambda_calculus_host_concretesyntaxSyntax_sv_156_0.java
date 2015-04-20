
package lambda_calculus.host.concretesyntax;

// t::AppTerm ::= f::AppTerm a::ATerm 
public final class PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0 extends lambda_calculus.host.concretesyntax.NAppTerm {

	public static final int i_f = 0;
	public static final int i_a = 1;


	public static final Class<?> childTypes[] = {lambda_calculus.host.concretesyntax.NAppTerm.class,lambda_calculus.host.concretesyntax.NATerm.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_156_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NAppTerm.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NAppTerm.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_f] = new common.Lazy[lambda_calculus.host.concretesyntax.NAppTerm.num_inh_attrs];
	childInheritedAttributes[i_a] = new common.Lazy[lambda_calculus.host.concretesyntax.NATerm.num_inh_attrs];

	}

	public PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0(final Object c_f, final Object c_a) {
		super();
		this.child_f = c_f;
		this.child_a = c_a;

	}

	private Object child_f;
	public final lambda_calculus.host.concretesyntax.NAppTerm getChild_f() {
		return (lambda_calculus.host.concretesyntax.NAppTerm) (child_f = common.Util.demand(child_f));
	}

	private Object child_a;
	public final lambda_calculus.host.concretesyntax.NATerm getChild_a() {
		return (lambda_calculus.host.concretesyntax.NATerm) (child_a = common.Util.demand(child_a));
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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_156_0 erroneously claimed to forward");
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
		return "lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_156_0";
	}

	static void initProductionAttributeDefinitions() {
		// t.pp = "( " ++ f.pp ++ " ) ( " ++ a.pp ++ " )"
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_AppTerm] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return new common.StringCatter((common.StringCatter)(new common.StringCatter("( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.i_f).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_AppTerm)), (common.StringCatter)new common.StringCatter((common.StringCatter)(new common.StringCatter(" ) ( ")), (common.StringCatter)new common.StringCatter((common.StringCatter)((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.i_a).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_ATerm)), (common.StringCatter)(new common.StringCatter(" )")))))); } };
		// t.ast_Expr = abs:application(f.ast_Expr, a.ast_Expr,)
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_AppTerm] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NExpr)new lambda_calculus.host.abstractsyntax.Papplication(context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.i_f, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_AppTerm), context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0.i_a, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_ATerm))); } };

	}

	public static final common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0> {

		@Override
		public PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_lambda_calculus_host_concretesyntaxSyntax_sv_156_0(children[0], children[1]);
		}
	};

}
