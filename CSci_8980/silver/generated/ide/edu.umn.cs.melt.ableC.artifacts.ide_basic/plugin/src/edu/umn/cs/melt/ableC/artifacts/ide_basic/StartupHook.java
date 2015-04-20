/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic;

import org.eclipse.ant.core.AntRunner;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.ui.IStartup;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.console.EDUConsole;
import edu.umn.cs.melt.ableC.artifacts.ide_basic.silver.cst.DefinitionFinder;
import edu.umn.cs.melt.ide.util.ISilverTypeWrapper;
import edu.umn.cs.melt.ide.util.ProjectUtil;
import edu.umn.cs.melt.ide.util.Util;
import edu.umn.cs.melt.ide.util.Util.IAntRunnable;
import edu.umn.cs.melt.ide.util.cst.Locator;

public class StartupHook implements IStartup {

	@Override
	public void earlyStartup() {
        //Initialize execution environment for EDU 
		EDUInitializer.initialize();

        //Set up console logger
        Util.setConsoleLoggingStream(EDUConsole.getConsoleLoggingStream());

        //Set up ant runner
        Util.setAntRunnable(new IAntRunnable(){

			@Override
			public void ant(String buildFile, String arguments, String target) {
				AntRunner runner = new AntRunner();
				runner.setBuildFileLocation(buildFile);
				runner.setArguments(arguments);
				if(target != null && !"".equals(target.trim())){
					runner.setExecutionTargets(new String[]{target});
				}
				try {
					runner.run();
				} catch (CoreException e) {
					e.printStackTrace();
				}
			}
        	
        });

        ProjectUtil.setSilverTypeWrapper(new ISilverTypeWrapper(){
			@Override
			public Object wrapInIOVal(Object io, Object arg) {
				return new core.Pioval(io, arg);
			}

			@Override
			public Object wrapInMaybe(Object arg) {
				if(arg!=null){
					return new core.Pjust(arg);
				} else {
					return new core.Pnothing(); 
				}
			}
        });
    
        //Set up definition locator
        Locator.setDefinitionFinder(new DefinitionFinder());
	}
	
}
