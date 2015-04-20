/*
 * Variables used:
 *   PKG_NAME
 *   PARSER_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.coloring;

import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.services.ITokenColorer;
import org.eclipse.imp.services.base.TokenColorerBase;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.TextAttribute;

import edu.umn.cs.melt.ide.copper.CopperToken;
import edu.umn.cs.melt.ide.copper.IToken;
import edu.umn.cs.melt.ide.copper.coloring.CopperTextAttributeDecider;

public class Colorer extends TokenColorerBase implements ITokenColorer {

	private CopperTextAttributeDecider decider = 
		Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TextAttributeDecider.getInstance();
	
	public Colorer() {
		super();
	}

	public TextAttribute getColoring(IParseController controller, Object o) {
		if (o == null)
			return null;
		
		IToken token = (CopperToken) o;
		
		TextAttribute attr = decider.getAddTextAttribute(token);
		
		return (attr!=null)?attr:super.getColoring(controller, token);

	}

	public IRegion calculateDamageExtent(IRegion seed) {
		return seed;
	}
}
