/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.actions;

import org.eclipse.core.resources.IProject;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders.EDUNature;


public class EnableEDUNature implements IWorkbenchWindowActionDelegate {
	private IProject fProject;

	public EnableEDUNature() {
	}

	public void dispose() {
	}

	public void init(IWorkbenchWindow window) {
	}

	public void run(IAction action) {
		new EDUNature().addToProject(fProject);
	}

	public void selectionChanged(IAction action, ISelection selection) {
		if (selection instanceof IStructuredSelection) {
			IStructuredSelection ss = (IStructuredSelection) selection;
			Object first = ss.getFirstElement();

			if (first instanceof IProject) {
				fProject = (IProject) first;
			} else if (first instanceof IJavaProject) {
				fProject = ((IJavaProject) first).getProject();
			}
		}
	}
}
