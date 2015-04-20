
package lambda_calculus.host.concretesyntax;

// r::Root ::= l::LamExpr 
public final class Proot extends lambda_calculus.host.concretesyntax.NRoot {

	public static final int i_l = 0;


	public static final Class<?> childTypes[] = {lambda_calculus.host.concretesyntax.NLamExpr.class};

	public static final int num_local_attrs = Init.count_local__ON__lambda_calculus_host_concretesyntax_root;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NRoot.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[lambda_calculus.host.concretesyntax.NRoot.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_l] = new common.Lazy[lambda_calculus.host.concretesyntax.NLamExpr.num_inh_attrs];

	}

	public Proot(final Object c_l) {
		super();
		this.child_l = c_l;

	}

	private Object child_l;
	public final lambda_calculus.host.concretesyntax.NLamExpr getChild_l() {
		return (lambda_calculus.host.concretesyntax.NLamExpr) (child_l = common.Util.demand(child_l));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_l: return getChild_l();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_l: return child_l;

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
		throw new common.exceptions.SilverInternalError("Production lambda_calculus:host:concretesyntax:root erroneously claimed to forward");
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
		return "lambda_calculus:host:concretesyntax:root";
	}

	static void initProductionAttributeDefinitions() {
		// r.pp = l.pp
		lambda_calculus.host.concretesyntax.Proot.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((common.StringCatter)context.childDecorated(lambda_calculus.host.concretesyntax.Proot.i_l).synthesized(lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_pp__ON__lambda_calculus_host_concretesyntax_LamExpr)); } };
		// r.ast_Root = abs:root(l.ast_Expr,)
		lambda_calculus.host.concretesyntax.Proot.synthesizedAttributes[lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Root__ON__lambda_calculus_host_concretesyntax_Root] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((lambda_calculus.host.abstractsyntax.NRoot)new lambda_calculus.host.abstractsyntax.Proot(context.childDecoratedSynthesizedLazy(lambda_calculus.host.concretesyntax.Proot.i_l, lambda_calculus.host.concretesyntax.Init.lambda_calculus_host_concretesyntax_ast_Expr__ON__lambda_calculus_host_concretesyntax_LamExpr))); } };

	}

	public static final common.NodeFactory<Proot> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Proot> {

		@Override
		public Proot invoke(final Object[] children, final Object[] annotations) {
			return new Proot(children[0]);
		}
	};

}
