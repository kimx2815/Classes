/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.resource;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.runtime.CoreException;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.EDUService;
import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders.EDUNature;

public class ResourceChangeListener implements IResourceChangeListener {

	@Override
	public void resourceChanged(IResourceChangeEvent event) {
		//Workspace delta
		IResourceDelta delta = event.getDelta();
		//All project (under workspace) delta 
		IResourceDelta projsDelta[] = delta.getAffectedChildren(IResourceDelta.CHANGED);
		
		//For each project
		for(IResourceDelta projDelta:projsDelta){
			IResource _proj = projDelta.getResource();
			if(_proj instanceof IProject){
				IProject proj = (IProject) _proj;
				
				try {
					//If it's a EDU project
					if(proj.hasNature(EDUNature.k_natureID)){
						LinkedResourceTracker tracker = EDUService.getInstance().getLinkedResourceTracker(proj);
						
						IResourceDelta ressDelta[] = projDelta.getAffectedChildren(IResourceDelta.REMOVED);		
						
						//Retrieve all first-level folders removed
						for(IResourceDelta resDelta:ressDelta){
							IResource _fldr = resDelta.getResource();
							//And remove it from resource tracker
							if (_fldr instanceof IFolder){
								//Ideally, we should delete using key, which is the absolute path of the 
								//deleted folder. This however cannot be done with current Eclipse API (3.5),
								//where IResource's getLocation() and getRawLocation() method will return 
								//the symbolic address when the resource is retrieved from a delta.
								//Possibly an Eclipse bug.
								tracker.deleteByRelativePath(LinkedResourceTracker.getRelPath(_fldr));
							}
						}
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
