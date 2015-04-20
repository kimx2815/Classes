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
 * The builder called after syntactical parsing in incremental 
 * {@link EDUBuilder#build(int, Map, IProgressMonitor)}.
 * <p>
 * There are two implementations to this interface: Single-stage builder or 
 * Two-stage builder. If language developer defines only builder function for 
 * EDU, the single-stage builder will be used; if both builder and
 * post-builder are defined, the two-stage builder used instead.
 */
public interface DelegateBuilder {

    /**
     * 
     * @param builder		The incremental builder triggered by Eclipse
     * @param cls			a console stream
     * @param projectPath	the path of the project being built
     * @param kind			build type, same to 1st arg in {@link EDUBuilder#build(int, Map, IProgressMonitor)}
     * @param args			a build parameter map, same to 2nd arg in {@link EDUBuilder#build(int, Map, IProgressMonitor)}
     * @param monitor		progress monitor, same to 3rd arg in {@link EDUBuilder#build(int, Map, IProgressMonitor)}
     * @return
     */
	@SuppressWarnings("unchecked")
	IProject[] build(
			EDUBuilder builder, 
			ConsoleLoggingStream cls,
			IProject project,
			int kind, Map args, IProgressMonitor monitor);
}
