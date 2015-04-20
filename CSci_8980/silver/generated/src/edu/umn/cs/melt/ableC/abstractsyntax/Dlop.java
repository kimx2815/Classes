package edu.umn.cs.melt.ableC.abstractsyntax;

import java.util.*;

public class Dlop extends common.Decorator {

public static final Dlop singleton = new Dlop();

	public void decorate(Class production) {
		decorateAutoCopy(production, "edu:umn:cs:melt:ableC:abstractsyntax:lop");
	}
}
