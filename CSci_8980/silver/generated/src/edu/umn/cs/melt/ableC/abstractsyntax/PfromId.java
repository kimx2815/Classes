
package edu.umn.cs.melt.ableC.abstractsyntax;

public final class PfromId extends common.FunctionNode {

	public static final int i_n = 0;


	public static final Class<?> childTypes[] = { common.TerminalRecord.class };

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_abstractsyntax_fromId;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[1][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{

	}

	public PfromId(final Object c_n) {
		this.child_n = c_n;

	}

	private Object child_n;
	public final common.TerminalRecord getChild_n() {
		return (common.TerminalRecord) (child_n = common.Util.demand(child_n));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_n: return getChild_n();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_n: return child_n;

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
		return "edu:umn:cs:melt:ableC:abstractsyntax:fromId";
	}

	public static edu.umn.cs.melt.ableC.abstractsyntax.NName invoke(final Object c_n) {
		try {
		final common.DecoratedNode context = new PfromId(c_n).decorate();
		//name(n.lexeme,location=n.location)
		return (edu.umn.cs.melt.ableC.abstractsyntax.NName)(((edu.umn.cs.melt.ableC.abstractsyntax.NName)new edu.umn.cs.melt.ableC.abstractsyntax.Pname(((common.StringCatter)((common.TerminalRecord)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.PfromId.i_n)).lexeme), ((core.NLocation)((common.TerminalRecord)context.childAsIs(edu.umn.cs.melt.ableC.abstractsyntax.PfromId.i_n)).location))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function edu:umn:cs:melt:ableC:abstractsyntax:fromId", t);
		}
	}

	public static final common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NName> factory = new Factory();

	public static final class Factory extends common.NodeFactory<edu.umn.cs.melt.ableC.abstractsyntax.NName> {
		@Override
		public edu.umn.cs.melt.ableC.abstractsyntax.NName invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PfromId.invoke(children[0]);
		}
	};
}