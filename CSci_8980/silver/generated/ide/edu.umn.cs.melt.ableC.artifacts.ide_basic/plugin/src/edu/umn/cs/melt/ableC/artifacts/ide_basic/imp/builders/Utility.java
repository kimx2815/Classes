/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders;

import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.runtime.CoreException;

import ide.NIdeMessage;
import edu.umn.cs.melt.ide.silver.misc.Problem;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.SILVERService;
import edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.resource.LinkedResourceTracker;

public class Utility {

	/**
	 * Render messages given in a list (in Silver type [IdeMessage]) properly
	 * in workbench. The concrete processing of each message is delegated to
	 * handler, which is passed along as a callback function, but which can be
	 * null as well.
	 *  
	 * @param list
	 * @param project
	 * @param handler a user-provided message handler for processing each message
	 * in the list. If null, a default handler will be used, which marks location
	 * of problem for source-level problem, and adds a new entry into problem view
	 * for project-level problem.
	 * @return true if no error-level message is present in the list, indicating
     * a success of the action.
	 */
	public static boolean renderMessages(List<NIdeMessage> list, IProject project, MessageHandler handler){
		//If no handler is given, use default one
		if(handler==null){
			handler = HANDLER;
		}
		
		//Clean markers
		try {
			project.deleteMarkers(EDUBuilder.PROBLEM_MARKER_ID, false, IResource.DEPTH_INFINITE);
		} catch (CoreException e) {
			e.printStackTrace();
		}

		boolean success = true;
		
		//Add markers
		for(NIdeMessage message:list){
			Problem p = Utility.extractProblem(project, message);
			
			if(!p.isProjectProblem()){
				handler.handleSourceProblem(p);
			} else {
				handler.handleProjectProblem(project, p.getLevel(), p.getMessage());
			}
			
			if(p.getLevel()==Problem.ERROR){
				success = false;
			}
		}
		
		return success;
	}
	
	public interface MessageHandler {
		
		/**
		 * Handle a project-level problem.
		 * 
		 * @param project
		 * @param level
		 * @param message
		 * @return
		 */
		void handleProjectProblem(IProject project, int level, String message);
		
		/**
		 * Handle a source-level problem. The problem is associated with a 
		 * specific location in a source file.
		 * 
		 * @param problem
		 * @return
		 */
		void handleSourceProblem(Problem problem);
		
	}
	
	public static class DefaultMessageHandler implements MessageHandler {
		
		public void handleProjectProblem(IProject project, int level, String message) {
			try {
				IMarker marker = project.createMarker(EDUBuilder.PROBLEM_MARKER_ID);
				marker.setAttribute(IMarker.MESSAGE, message);
				marker.setAttribute(IMarker.SEVERITY, level);
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		
		public void handleSourceProblem(Problem p) {
			IFile file = p.getFile();
			try {
				if(!file.exists()){
					System.err.println(
						"A problem is reported on file \"" + file.getName() + "\", which however doesn't exist");
					return;
				}

				//Reuse ErrorMarkerID for whatever kind of problem
				IMarker marker = file.createMarker(EDUBuilder.PROBLEM_MARKER_ID);
				marker.setAttribute(IMarker.MESSAGE, p.getMessage());
				marker.setAttribute(IMarker.LINE_NUMBER, p.getLine());
				int index = p.getStartInd();
				if(index!=Problem.UNKNOWN){
					marker.setAttribute(IMarker.CHAR_START, index);
				}
				index = p.getEndInd();
				if(index!=Problem.UNKNOWN){
					marker.setAttribute(IMarker.CHAR_END, index);
				}
				marker.setAttribute(IMarker.SEVERITY, p.getLevel());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	private static DefaultMessageHandler HANDLER = new DefaultMessageHandler();

	static Problem extractProblem(IProject project, NIdeMessage ideMsg) {
		//Extract values
    	common.DecoratedNode ideMsgDecNode = ideMsg.decorate(common.TopNode.singleton, (common.Lazy[])null);
    	
    	common.StringCatter msg = (common.StringCatter) ideMsgDecNode.synthesized(
        	ide.Init.ide_msg__ON__ide_IdeMessage);
    	
    	Integer severity = (Integer) ideMsgDecNode.synthesized(
    		ide.Init.ide_severity__ON__ide_IdeMessage);
    
    	Boolean isProjMsg = (Boolean) ideMsgDecNode.synthesized(
    		ide.Init.ide_systemLevel__ON__ide_IdeMessage);
    	
    	if(!isProjMsg){
        	common.StringCatter resPath = (common.StringCatter) ideMsgDecNode.synthesized(
            		ide.Init.ide_resPath__ON__ide_IdeMessage);
        	
        	core.NLocation loc = (core.NLocation) ideMsgDecNode.synthesized(
            	ide.Init.ide_loc__ON__ide_IdeMessage);
        	  	
        	common.DecoratedNode locDecNode = loc.decorate(common.TopNode.singleton, (common.Lazy[])null);
        	
        	common.StringCatter fileName = (common.StringCatter) locDecNode.synthesized(
        		core.Init.core_filename__ON__core_Location);
        	
        	Integer lineNo = (Integer) locDecNode.synthesized(
        		core.Init.core_line__ON__core_Location);
        	
        	Integer columnNo = (Integer) locDecNode.synthesized(
    	    	core.Init.core_column__ON__core_Location);
        	
        	Integer startInd = (Integer) locDecNode.synthesized(
            		core.Init.core_index__ON__core_Location);
        
        	Integer endInd = (Integer) locDecNode.synthesized(
            		core.Init.core_endIndex__ON__core_Location);
        	
        	boolean isLinked = (Boolean) ideMsgDecNode.synthesized(
            		ide.Init.ide_isLinked__ON__ide_IdeMessage);

        	if(isLinked){
            	common.StringCatter rootPath = (common.StringCatter) ideMsgDecNode.synthesized(
                		ide.Init.ide_rootPath__ON__ide_IdeMessage);
            	
            	LinkedResourceTracker tracker = 
            		EDUService.getInstance().getLinkedResourceTracker(project);
            	
            	String linkedFolderPath = tracker.get(rootPath.toString());
            	
            	//Assemble a problem
            	//IProject project, String pathRelativeToProjectRoot, String fileName, 
        		//int line, int column, int startInd, int endInd, int severity, String message, 
            	return Problem.createFileProblem(
                		project, linkedFolderPath + resPath.toString(), fileName.toString(), 
                		lineNo, columnNo, startInd, endInd, severity, msg.toString());
        	} 

        	//Assemble a problem
        	//IProject project, String pathRelativeToProjectRoot, String fileName, 
    		//int line, int column, int startInd, int endInd, int severity, String message, 
        	return Problem.createFileProblem(
        		project, resPath.toString(), fileName.toString(), 
        		lineNo, columnNo, startInd, endInd, severity, msg.toString());
    	} else {
        	return Problem.createProjectProblem(severity, msg.toString());
    	}
    	
    }
	
}
