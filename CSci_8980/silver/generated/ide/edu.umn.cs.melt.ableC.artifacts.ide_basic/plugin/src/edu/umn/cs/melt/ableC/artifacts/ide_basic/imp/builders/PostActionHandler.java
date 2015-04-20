/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders;

import java.util.List;
import ide.NIdeMessage;

public interface PostActionHandler {

	/**
	 * Handle the IDE message list returned by Builder.
	 * 
	 * @param list the message list. 
	 * @return true if the handling is considered successful; false otherwise
	 */
	boolean handleBuild(List<NIdeMessage> list);
	
	/**
	 * Handle the IDE message list returned by Post-Builder.
	 * 
	 * @param list the message list. 
	 * @return true if the handling is considered successful; false otherwise
	 */
	boolean handlePostBuild(List<NIdeMessage> list);

}
