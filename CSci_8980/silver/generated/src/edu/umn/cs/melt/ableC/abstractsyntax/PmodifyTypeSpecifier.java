
package edu.umn.cs.melt.ableC.abstractsyntax;

// top::TypeSpecifierMutator ::= f::(BaseTypeExpr ::= [Qualifier] BaseTypeExpr) 
public final class PmodifyTypeSpecifier extends edu.umn.cs.melt.ableC.abstractsyntax.NTypeSpecifierMutator {

	public static final int i_f = 0;


	public static final Class<?> childTypes[] = {common.NodeFactory.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_modifyTypeSpecifier;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeSpecifierMutator.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.abstractsyntax.NTypeSpecifierMutator.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {

	}

	public PmodifyTypeSpecifier(final Object c_f) {
		super();
		this.child_f = c_f;

	}

	private Object child_f;
	public final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr> getChild_f() {
		return (common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NBaseTypeExpr>) (child_f = common.Util.demand(child_f));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_f: return getChild_f();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_f: return child_f;

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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:abstractsyntax:modifyTypeSpecifier erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:abstractsyntax:modifyTypeSpecifier";
	}

	static void initProductionAttributeDefinitions() {

	}

	public static final common.NodeFactory<PmodifyTypeSpecifier> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PmodifyTypeSpecifier> {

		@Override
		public PmodifyTypeSpecifier invoke(final Object[] children, final Object[] annotations) {
			return new PmodifyTypeSpecifier(children[0]);
		}
	};

}
