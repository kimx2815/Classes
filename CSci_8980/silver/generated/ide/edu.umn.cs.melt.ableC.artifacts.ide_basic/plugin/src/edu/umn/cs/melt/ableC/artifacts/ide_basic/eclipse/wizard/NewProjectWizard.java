/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */

package edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.wizard;

import java.io.ByteArrayInputStream;
import java.net.URI;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IProjectDescription;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.dialogs.WizardNewProjectCreationPage;
import org.eclipse.ui.wizards.newresource.BasicNewProjectResourceWizard;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders.EDUNature;

/**
 * The EDU's New Project Wizard is used to create EDU project. In general
 * it follows these steps:
 * <p>
 * (1) show a page for user to name the project <br>
 * (2) create a project folder with the given name in current workspace <br>
 * (3) create a property file <br>
 * (4) add EDU nature to the project (note nature is associated with builder) <br>
 *
 */
public class NewProjectWizard extends Wizard implements INewWizard, IExecutableExtension {

	private WizardNewProjectCreationPage page1;
	
	private IConfigurationElement configElement;
	
	public NewProjectWizard() {
		setWindowTitle("EDU");
	}

	@Override
	public void init(IWorkbench workbench, IStructuredSelection selection) {

	}
	
	@Override
	public void addPages() {
	    super.addPages();

	    page1 = new WizardNewProjectCreationPage("New EDU Project Wizard");
	    page1.setTitle("EDU Project");
	    page1.setDescription("Create new EDU project");

	    addPage(page1);
	}

	@Override
	public boolean performFinish() {
	    //Get user's input
	    String name = page1.getProjectName();
	    URI location = null;
	    if (!page1.useDefaults()) {
	        location = page1.getLocationURI();
	    }
	    
	    //Create project in current workspace
	    createProject(name, location);
	    
	    //Update perspective
	    BasicNewProjectResourceWizard.updatePerspective(configElement);

	    return true;
	}
	
	@Override
	public void setInitializationData(
	    IConfigurationElement config, String propertyName, Object data) throws CoreException {
	    configElement = config;
	}

    /**
     * Create a EDU project and add nature to it.
     *
     * @param location
     * @param projectName
     */
    private void createProject(String projectName, URI location) {
        //Get the project handle by given name
        IProject project = ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);

        if (!project.exists()) {
            //Set the description
            URI projectLocation = location;
            IProjectDescription desc = 
            	project.getWorkspace().newProjectDescription(project.getName());
            if (location != null && 
            	location.equals(ResourcesPlugin.getWorkspace().getRoot().getLocationURI())) {
                projectLocation = null;
            }
            desc.setLocationURI(projectLocation);
            
            //Create and open the project
            try {
                project.create(desc, null);
                if (!project.isOpen()) {
                    project.open(null);
                }
            } catch (CoreException e) {
                e.printStackTrace();
            }
            
            //Create properties file
            try {
		project.getFile("project.properties").create(
		new ByteArrayInputStream(PropertyGenerator.getAll().getBytes()), true, null);
	    } catch (CoreException e) {
		e.printStackTrace();
	    }

        }
        
        //Add EDU nature, if not added yet
        try {
            if (!project.hasNature(EDUNature.k_natureID)) {	            
	            new EDUNature().addToProject(project);
            }
        } catch (CoreException e) {
            e.printStackTrace();
        }
    }

}

