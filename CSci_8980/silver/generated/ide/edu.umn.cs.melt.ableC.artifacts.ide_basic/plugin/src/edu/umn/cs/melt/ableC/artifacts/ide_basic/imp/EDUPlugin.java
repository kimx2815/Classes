/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp;

import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceChangeListener;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.imp.runtime.PluginBase;
import org.osgi.framework.BundleContext;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.resource.ResourceChangeListener;

public class EDUPlugin extends PluginBase {

    public static final String kPluginID = "EDU_IDE";
    public static final String kLanguageID = "EDU";
    
    /**
     * The unique instance of this plugin class
     */
    protected static EDUPlugin sPlugin;

    private static IResourceChangeListener RC_LISTENER = new ResourceChangeListener();

    public static EDUPlugin getInstance() {
    	if (sPlugin == null)
    		new EDUPlugin();
        return sPlugin;
    }

    public EDUPlugin() {
    	super();
    	sPlugin = this;
    }

    public void start(BundleContext context) throws Exception {
        super.start(context);

        ResourcesPlugin.getWorkspace().addResourceChangeListener(
        	RC_LISTENER, IResourceChangeEvent.POST_CHANGE);
    }

    @Override
    public void shutdown() {        
        ResourcesPlugin.getWorkspace().removeResourceChangeListener(RC_LISTENER);
    }

    @Override
    public String getID() {
    	return kPluginID;
    }  

    @Override
    public String getLanguageID() {
        return kLanguageID;
    }
}
