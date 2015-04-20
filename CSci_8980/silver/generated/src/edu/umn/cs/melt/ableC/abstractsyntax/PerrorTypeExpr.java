
package edu.umn.cs.melt.ableC.abstractsyntax;

public final class PerrorTypeExpr extends common.FunctionNode {

	public static final int i_msg = 0;


	public static final Class<?> childTypes[] = { common.DecoratedNode.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_errorTypeExpr;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PerrorTypeExpr(final Object c_msg) {
		this.child_msg = c_msg;

	}

	private Object child_msg;
	public final common.ConsCell getChild_msg() {
		return (common.ConsCell) (child_msg = common.Util.demand(child_msg));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_msg: return getChild_msg();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_msg: return child_msg;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 1;
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:errorTypeExpr";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr invoke(final Object c_msg) {
		try {
		final common.DecoratedNode context = new PerrorTypeExpr(c_msg).decorate();
		//warnTypeExpr(msg, directTypeExpr(errorType(,),),)
		return (edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)(((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PwarnTypeExpr(context.childAsIsLazy(edu.umn.cs.melt.ableC.abstractsyntax.PerrorTypeExpr.i_msg), new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr)new edu.umn.cs.melt.ableC.abstractsyntax.PdirectTypeExpr(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NType)new edu.umn.cs.melt.ableC.abstractsyntax.PerrorType()); } })); } })));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:abstractsyntax:errorTypeExpr", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PerrorTypeExpr.invoke(children[0]);
		}
	};
}