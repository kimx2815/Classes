
package edu.umn.cs.melt.ableC.concretesyntax.gcc_exts;

// top::CompoundStatement_c ::= '{' ll::LabelDeclarations_c dcls::BlockItemList_c '}' 
public final class PlocalLabelsCompoundBlock_c extends edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c {

	public static final int i__G_3 = 0;
	public static final int i_ll = 1;
	public static final int i_dcls = 2;
	public static final int i__G_0 = 3;


	public static final Class<?> childTypes[] = {common.TerminalRecord.class,edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NLabelDeclarations_c.class,edu.umn.cs.melt.ableC.concretesyntax.NBlockItemList_c.class,common.TerminalRecord.class};

	public static final int num_local_attrs = Init.count_local__ON__edu_umn_cs_melt_ableC_concretesyntax_gcc_exts_localLabelsCompoundBlock_c;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[] forwardInheritedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c.num_inh_attrs];

	public static final common.Lazy[] synthesizedAttributes = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NCompoundStatement_c.num_syn_attrs];
	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[4][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static {
	childInheritedAttributes[i_ll] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NLabelDeclarations_c.num_inh_attrs];
	childInheritedAttributes[i_dcls] = new common.Lazy[edu.umn.cs.melt.ableC.concretesyntax.NBlockItemList_c.num_inh_attrs];

	}

	public PlocalLabelsCompoundBlock_c(final Object c__G_3, final Object c_ll, final Object c_dcls, final Object c__G_0, final Object a_core_location) {
		super(a_core_location);
		this.child__G_3 = c__G_3;
		this.child_ll = c_ll;
		this.child_dcls = c_dcls;
		this.child__G_0 = c__G_0;

	}

	private Object child__G_3;
	public final common.TerminalRecord getChild__G_3() {
		return (common.TerminalRecord) (child__G_3 = common.Util.demand(child__G_3));
	}

	private Object child_ll;
	public final edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NLabelDeclarations_c getChild_ll() {
		return (edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NLabelDeclarations_c) (child_ll = common.Util.demand(child_ll));
	}

	private Object child_dcls;
	public final edu.umn.cs.melt.ableC.concretesyntax.NBlockItemList_c getChild_dcls() {
		return (edu.umn.cs.melt.ableC.concretesyntax.NBlockItemList_c) (child_dcls = common.Util.demand(child_dcls));
	}

	private Object child__G_0;
	public final common.TerminalRecord getChild__G_0() {
		return (common.TerminalRecord) (child__G_0 = common.Util.demand(child__G_0));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i__G_3: return getChild__G_3();
			case i_ll: return getChild_ll();
			case i_dcls: return getChild_dcls();
			case i__G_0: return getChild__G_0();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i__G_3: return child__G_3;
			case i_ll: return child_ll;
			case i_dcls: return child_dcls;
			case i__G_0: return child__G_0;

			default: return null;
		}
	}

	@Override
	public final int getNumberOfChildren() {
		return 4;
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
		throw new common.exceptions.SilverInternalError("Production edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:localLabelsCompoundBlock_c erroneously claimed to forward");
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
		return "edu:umn:cs:melt:ableC:concretesyntax:gcc_exts:localLabelsCompoundBlock_c";
	}

	static void initProductionAttributeDefinitions() {
		// top.ast = foldr(ast:compoundStmt, ast:nullStmt(,), [ ast:warnStmt([ wrn(ll.location, "Ignoring label declarations",) ],) ] ++ dcls.ast,)
		edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PlocalLabelsCompoundBlock_c.synthesizedAttributes[edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_CompoundStatement_c] = new common.Lazy() { public final Object eval(final common.DecoratedNode context) { return ((edu.umn.cs.melt.ableC.abstractsyntax.NStmt)core.Pfoldr.invoke(edu.umn.cs.melt.ableC.abstractsyntax.PcompoundStmt.factory, new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NStmt)new edu.umn.cs.melt.ableC.abstractsyntax.PnullStmt()); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pappend.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((edu.umn.cs.melt.ableC.abstractsyntax.NStmt)new edu.umn.cs.melt.ableC.abstractsyntax.PwarnStmt(new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pcons.invoke(new common.Thunk<Object>(context) { public final Object doEval() { return ((silver.langutil.NMessage)new silver.langutil.Pwrn(new common.Thunk<Object>(context) { public final Object doEval() { return ((core.NLocation)((edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.NLabelDeclarations_c)context.childDecorated(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PlocalLabelsCompoundBlock_c.i_ll).undecorate()).getAnno_core_location()); } }, (new common.StringCatter("Ignoring label declarations")))); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } })); } }, new common.Thunk<Object>(context) { public final Object doEval() { return ((common.ConsCell)core.Pnil.invoke()); } })); } }, context.childDecoratedSynthesizedLazy(edu.umn.cs.melt.ableC.concretesyntax.gcc_exts.PlocalLabelsCompoundBlock_c.i_dcls, edu.umn.cs.melt.ableC.concretesyntax.Init.silver_langutil_ast__ON__edu_umn_cs_melt_ableC_concretesyntax_BlockItemList_c))); } })); } };

	}

	public static final common.NodeFactory<PlocalLabelsCompoundBlock_c> factory = new Factory();

	public static final class Factory extends common.NodeFactory<PlocalLabelsCompoundBlock_c> {

		@Override
		public PlocalLabelsCompoundBlock_c invoke(final Object[] children, final Object[] annotations) {
			return new PlocalLabelsCompoundBlock_c(children[0], children[1], children[2], children[3], annotations[0]);
		}
	};

}
