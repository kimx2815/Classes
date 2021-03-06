/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */

package edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.perspective;

import org.eclipse.ui.IFolderLayout;
import org.eclipse.ui.IPageLayout;
import org.eclipse.ui.IPerspectiveFactory;
import org.eclipse.ui.console.IConsoleConstants;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.EDUPlugin;

public class EDUPerspective implements IPerspectiveFactory {

	public static final String PERSPECTIVE_ID = EDUPlugin.kPluginID + ".perspective";
	
	/**
	 * The EDU IDE's development perspective has the following layout:
	 * <p>
	 * <code>
	 * ____________________________________  	<br>
	 * |Projec|---------------------------|  	<br>
	 * |t-Expl|---------------------------|  	<br> 
	 * |orer--|---------------------------|  	<br>
	 * |------|---------------------------|  	<br>
	 * |------|---------------------------| 	<br>
	 * |------|___________________________| 	<br>
	 * |------|Console|Progress|Problem|--|  	<br>
	 * |------|---------------------------|  	<br>
	 * |______|___________________________| 	<br>
	 * </code>
	 */
	@Override
	public void createInitialLayout(IPageLayout layout) {
		//Basic settings
		layout.setEditorAreaVisible(true);
		layout.setFixed(false); 
		
		//Get Editor Area
		String editorArea = layout.getEditorArea();
		
		//Project Explorer
		layout.addView(IPageLayout.ID_PROJECT_EXPLORER, IPageLayout.LEFT, 0.20f, editorArea);

		//Bottom Folder
		IFolderLayout bottom = layout.createFolder("bottom", IPageLayout.BOTTOM, 0.66f, editorArea);
		
		//Console
		bottom.addView(IConsoleConstants.ID_CONSOLE_VIEW);
		
		//Progress
		bottom.addView(IPageLayout.ID_PROGRESS_VIEW);
	
		//Problem
		bottom.addView(IPageLayout.ID_PROBLEM_VIEW);
		
		//And a place-holder
		bottom.addPlaceholder("*");
	}

}
