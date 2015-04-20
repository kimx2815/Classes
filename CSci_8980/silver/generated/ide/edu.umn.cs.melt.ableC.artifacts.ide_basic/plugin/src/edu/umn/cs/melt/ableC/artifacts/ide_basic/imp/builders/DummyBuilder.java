/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders;

import java.util.Map;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;

import edu.umn.cs.melt.ide.silver.misc.ConsoleLoggingStream;

/**
 * This is a dummy builder which does nothing in response to build action,
 * since no builder function is defined by user for EDU.
 */
public class DummyBuilder implements DelegateBuilder {
    
	public IProject[] build(
		EDUBuilder builder, 
		ConsoleLoggingStream cls,
		IProject project,
		int kind, Map args, IProgressMonitor monitor) {
		
        return new IProject[0];
	}
}
