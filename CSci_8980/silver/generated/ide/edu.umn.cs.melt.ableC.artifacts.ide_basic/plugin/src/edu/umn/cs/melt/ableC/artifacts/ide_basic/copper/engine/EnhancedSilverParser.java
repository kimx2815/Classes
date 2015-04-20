/*
 * Variables used:
 *   PKG_NAME
 *   PARSER_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.copper.engine;

import edu.umn.cs.melt.copper.runtime.logging.CopperParserException;
import edu.umn.cs.melt.copper.runtime.logging.CopperSyntaxError;
import edu.umn.cs.melt.ide.copper.EnhancedCopperParserException;

public class EnhancedSilverParser extends edu.umn.cs.melt.ableC.artifacts.ide_basic.copper.parser.Parser_edu_umn_cs_melt_ableC_artifacts_ide_basic_theParser {

    protected String formatError(String error) {
        return "Bad token scanned:\n  " + error;
    }
    
    protected void reportError(String message) throws CopperParserException {
    	throw createEnhancedCopperParserException(message);
    }
    
    protected void reportSyntaxError()
    throws edu.umn.cs.melt.copper.runtime.logging.CopperParserException
    {
        java.util.ArrayList<String> expectedTerminalsReal = bitVecToRealStringList(getShiftableSets()[currentState.statenum]);
        java.util.ArrayList<String> expectedTerminalsDisplay = bitVecToDisplayStringList(getShiftableSets()[currentState.statenum]);
        java.util.ArrayList<String> matchedTerminalsReal = bitVecToRealStringList(disjointMatch.terms);
        java.util.ArrayList<String> matchedTerminalsDisplay = bitVecToDisplayStringList(disjointMatch.terms);
    	CopperSyntaxError cse = new CopperSyntaxError(virtualLocation,currentState.pos,currentState.statenum,expectedTerminalsReal,expectedTerminalsDisplay,matchedTerminalsReal,matchedTerminalsDisplay);
    	throw createEnhancedCopperParserException(cse.getMessage());
    }
    
    private EnhancedCopperParserException createEnhancedCopperParserException(String message){
    	int line = virtualLocation.getLine();
    	int column = virtualLocation.getColumn();
    	String fileName = virtualLocation.getFileName();
    	long pos = currentState.pos.getPos();
    	
        return new EnhancedCopperParserException(message, line, column, pos, fileName);
    }
    
}
