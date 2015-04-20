/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders;

import org.eclipse.core.resources.IProject;
import org.eclipse.imp.builder.ProjectNatureBase;
import org.eclipse.imp.runtime.IPluginLog;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.EDUPlugin;

public class EDUNature extends ProjectNatureBase {
	public static final String k_natureID = EDUPlugin.kPluginID + ".imp.nature";
 
    public String getNatureID() {
        return k_natureID;
    }

    public String getBuilderID() {
        return EDUBuilder.BUILDER_ID;
    }
    
	public void addToProject(IProject project) {
		super.addToProject(project);
	}

    protected void refreshPrefs() {
        // TODO implement preferences and hook in here
    }

    public IPluginLog getLog() {
        return EDUPlugin.getInstance();
    }

    protected String getDownstreamBuilderID() {
        // TODO If needed, specify the builder that will consume artifacts created by this nature's builder, or null if none
        //return "org.eclipse.jdt.core.javabuilder";
        return null;
    }
}
