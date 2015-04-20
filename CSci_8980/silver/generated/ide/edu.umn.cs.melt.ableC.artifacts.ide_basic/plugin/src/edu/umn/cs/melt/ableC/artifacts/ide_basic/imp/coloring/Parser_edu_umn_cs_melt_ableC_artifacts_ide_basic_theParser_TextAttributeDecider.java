package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.coloring;

import org.eclipse.jface.text.TextAttribute;
import org.eclipse.swt.widgets.Display;

import edu.umn.cs.melt.ide.copper.coloring.CopperTextAttributeDecider;
import edu.umn.cs.melt.ide.copper.coloring.TextAttributeProvider;

public class Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TextAttributeDecider extends CopperTextAttributeDecider {
	
	private static Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TextAttributeDecider INSTANCE = new Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TextAttributeDecider();
	
	public static Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TextAttributeDecider getInstance(){
		return INSTANCE;
	}
	
	protected final TextAttribute[] attributes = new TextAttribute[Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TokenClassifier.TokenType.TOTAL];
	
	private Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser_TextAttributeDecider(){
		Display display = Display.getDefault();
		
		
		
		
	}

}
