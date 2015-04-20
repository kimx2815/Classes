
package edu.umn.cs.melt.ableC.concretesyntax.c11;

public final class PatomicMutator extends common.FunctionNode {

	public static final int i_q = 0;
	public static final int i_bt = 1;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class,edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_c11_atomicMutator;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_bt] = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr.num_inh_attrs];

	}

	public PatomicMutator(final Object c_q, final Object c_bt) {
		this.child_q = c_q;
		this.child_bt = c_bt;

	}

	private Object child_q;
	public final common.ConsCell getChild_q() {
		return (common.ConsCell) (child_q = common.Util.demand(child_q));
	}

	private Object child_bt;
	public final edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr getChild_bt() {
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr) (child_bt = common.Util.demand(child_bt));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_q: return getChild_q();
			case i_bt: return getChild_bt();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_q: return child_q;
			case i_bt: return child_bt;

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
		return "edu:umn:cs:melt:ableC:concretesyntax:c11:atomicMutator";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr invoke(final Object c_q, final Object c_bt) {
		try {
		final common.DecoratedNode context = new PatomicMutator(c_q, c_bt).decorate();
		//ast:atomicTypeExpr(q, ast:typeName(bt, ast:baseTypeExpr(,),),)
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.c11.PatomicTypeExpr(context.childAsIsLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PatomicMutator.i_q), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeName)new edu.umn.cs.melt.ableC.abstractsyntax.PtypeName(common.Thunk.transformUndecorate(context.childDecoratedLazy(edu.umn.cs.melt.ableC.concretesyntax.c11.PatomicMutator.i_bt)), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NTypeModifierExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PbaseTypeExpr()); } })); } })));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:concretesyntax:c11:atomicMutator", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PatomicMutator.invoke(children[0], children[1]);
		}
	};
}