package edu.umn.cs.melt.ableC.abstractsyntax;

import java.util.*;

public class DbaseType extends common.Decorator {

public static final DbaseType singleton = new DbaseType();

	public void decorate(Class production) {
		decorateAutoCopy(production, "edu:umn:cs:melt:ableC:abstractsyntax:baseType");
	}
}
