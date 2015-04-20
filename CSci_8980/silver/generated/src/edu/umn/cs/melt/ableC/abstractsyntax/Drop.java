package edu.umn.cs.melt.ableC.abstractsyntax;

import java.util.*;

public class Drop extends common.Decorator {

public static final Drop singleton = new Drop();

	public void decorate(Class production) {
		decorateAutoCopy(production, "edu:umn:cs:melt:ableC:abstractsyntax:rop");
	}
}
