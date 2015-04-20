
package silver.langutil;

public final class PmessageLte extends common.FunctionNode {

	public static final int i_m1 = 0;
	public static final int i_m2 = 1;


	public static final Class<?> childTypes[] = { silver.langutil.NMessage.class,silver.langutil.NMessage.class };

	public static final int num_local_attrs = Init.count_local__ON__silver_langutil_messageLte;
	public static final String[] occurs_local = new String[num_local_attrs];

	public static final common.Lazy[][] childInheritedAttributes = new common.Lazy[2][];

	public static final common.Lazy[] localAttributes = new common.Lazy[num_local_attrs];
	public static final common.Lazy[][] localInheritedAttributes = new common.Lazy[num_local_attrs][];

	static{
	childInheritedAttributes[i_m1] = new common.Lazy[silver.langutil.NMessage.num_inh_attrs];
	childInheritedAttributes[i_m2] = new common.Lazy[silver.langutil.NMessage.num_inh_attrs];

	}

	public PmessageLte(final Object c_m1, final Object c_m2) {
		this.child_m1 = c_m1;
		this.child_m2 = c_m2;

	}

	private Object child_m1;
	public final silver.langutil.NMessage getChild_m1() {
		return (silver.langutil.NMessage) (child_m1 = common.Util.demand(child_m1));
	}

	private Object child_m2;
	public final silver.langutil.NMessage getChild_m2() {
		return (silver.langutil.NMessage) (child_m2 = common.Util.demand(child_m2));
	}



	@Override
	public Object getChild(final int index) {
		switch(index) {
			case i_m1: return getChild_m1();
			case i_m2: return getChild_m2();

			default: return null;
		}
	}

	@Override
	public Object getChildLazy(final int index) {
		switch(index) {
			case i_m1: return child_m1;
			case i_m2: return child_m2;

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
		return "silver:langutil:messageLte";
	}

	public static Boolean invoke(final Object c_m1, final Object c_m2) {
		try {
		final common.DecoratedNode context = new PmessageLte(c_m1, c_m2).decorate();
		//locationLte(m1.where, m2.where,)
		return (Boolean)(((Boolean)core.PlocationLte.invoke(context.childDecoratedSynthesizedLazy(silver.langutil.PmessageLte.i_m1, silver.langutil.Init.silver_langutil_where__ON__silver_langutil_Message), context.childDecoratedSynthesizedLazy(silver.langutil.PmessageLte.i_m2, silver.langutil.Init.silver_langutil_where__ON__silver_langutil_Message))));

		} catch(Throwable t) {
			throw new common.exceptions.TraceException("Error while evaluating function silver:langutil:messageLte", t);
		}
	}

	public static final common.NodeFactory<Boolean> factory = new Factory();

	public static final class Factory extends common.NodeFactory<Boolean> {
		@Override
		public Boolean invoke(final Object[] children, final Object[] namedNotApplicable) {
			return PmessageLte.invoke(children[0], children[1]);
		}
	};
}