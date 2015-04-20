
package lambda_calculus.host.concretesyntax;

// l::LamExpr ::= e::Expr 
public final class PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0 extends lambda_calculus.host.concretesyntax.NLamExpr {

	public static final int i_e = 0;


	public static final Class<?> childTypes[] = {lambda_calculus.host.concretesyntax.NExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_concretesyntax_P_lambda_calculus_host_concretesyntaxSyntax_sv_70_0;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NLamExpr.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NLamExpr.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_e] = new common.Lazy[lambda_calculus.host.concretesyntax.NExpr.num_inh_attrs];

	}

	public PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0(final Object c_e) {
		super();
		this.child_e = c_e;

	}

	private Object child_e;
	public final lambda_calculus.host.concretesyntax.NExpr getChild_e() {
		return (lambda_calculus.host.concretesyntax.NExpr) (child_e = common.Util.demand(child_e));
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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_70_0 erroneously claimed to forward");
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
		return "lambda_calculus:host:concretesyntax:P_lambda_calculus_host_concretesyntaxSyntax_sv_70_0";
	}

	static void initProductionAttributeDefinitions() {
		// l.pp = e.pp
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_LamExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0.i_e).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Expr)); } };
		// l.ast_Expr = e.ast_Expr
		lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_LamExpr] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NExpr)context.childDecorated(lambda_calculus.host.concretesyntax.PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0.i_e).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_Expr)); } };

	}

	public static final common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0> {

		@Override
		public PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0 invoke(final Object[] children, final Object[] annotations) {
			return new PP_lambda_calculus_host_concretesyntaxSyntax_sv_70_0(children[0]);
		}
	};

}
