/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 *   DELEGATE_BUILDER_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.builders;

import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IMarker;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;

import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;

import org.eclipse.imp.builder.BuilderUtils;
import org.eclipse.imp.builder.MarkerCreator;
import org.eclipse.imp.builder.MarkerCreatorWithBatching;
import org.eclipse.imp.builder.BuilderBase;
import org.eclipse.imp.language.Language;
import org.eclipse.imp.language.LanguageRegistry;
import org.eclipse.imp.model.ISourceProject;
import org.eclipse.imp.model.ModelFactory;
import org.eclipse.imp.model.ModelFactory.ModelException;
import org.eclipse.imp.parser.IParseController;
import org.eclipse.imp.runtime.PluginBase;

import edu.umn.cs.melt.ableC.artifacts.ide_basic.eclipse.console.EDUConsole;
import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.EDUPlugin;
import edu.umn.cs.melt.ableC.artifacts.ide_basic.imp.controller.EDUParseController;

import edu.umn.cs.melt.ide.silver.misc.ConsoleLoggingStream;
import edu.umn.cs.melt.ide.silver.misc.Problem;

import ide.NIdeMessage;

/**
 * The builder triggered by Eclipse framework.
 * <p>
 * A new build is activated on a file containing EDU code every time 
 * it's saved since last change (when "Build automatically" is on), or when 
 * the programmer chooses to "Build" a project manually from the Eclipse menu.
 * <p>
 * When the method {@link #build(int, Map, IProgressMonitor)} is invoked, it 
 * first parses all the affected source files to see if there is any 
 * syntactic errors; if not, a delegate builder will be invoked.
 * <p> 
 * The build will be completed after delegate builder returns.
 */
public class EDUBuilder extends BuilderBase implements PostActionHandler {
    /**
     * Extension ID of the EDU builder, which matches the ID in
     * the corresponding extension definition in plugin.xml.
     */
    public static final String BUILDER_ID = EDUPlugin.kPluginID
            + ".EDU.imp.builder";

    /**
     * A marker ID that identifies problems detected by the builder
     */
    public static final String PROBLEM_MARKER_ID = EDUPlugin.kPluginID
            + ".EDU.imp.builder.problem";

    public static final String LANGUAGE_NAME = "EDU";

    public static final Language LANGUAGE = LanguageRegistry
            .findLanguage(LANGUAGE_NAME);

    protected PluginBase getPlugin() {
        return EDUPlugin.getInstance();
    }

    public String getBuilderID() {
    	return BUILDER_ID;
    }
    
    protected String getErrorMarkerID() {
        return PROBLEM_MARKER_ID;
    }

    protected String getWarningMarkerID() {
        return PROBLEM_MARKER_ID;
    }

    protected String getInfoMarkerID() {
        return PROBLEM_MARKER_ID;
    }

    /**
     * Decide whether a file needs to be build using this builder. Note that
     * <code>isNonRootSourceFile()</code> and <code>isSourceFile()</code>
     * should never return true for the same file.
     * 
     * @return true iff an arbitrary file is a EDU source file.
     */
    protected boolean isSourceFile(IFile file) {
        IPath path = file.getRawLocation();
        if (path == null)
            return false;

        String pathString = path.toString();
        if (pathString.indexOf("/bin/") != -1)
            return false;

        return LANGUAGE.hasExtension(path.getFileExtension());
    }

    /**
     * Decide whether or not to scan a file for dependencies. Note:
     * <code>isNonRootSourceFile()</code> and <code>isSourceFile()</code>
     * should never return true for the same file.
     * 
     * @return true iff the given file is a source file that this builder should
     *         scan for dependencies, but not compile as a top-level compilation
     *         unit.
     * 
     */
    protected boolean isNonRootSourceFile(IFile resource) {
        return false;
    }

    /**
     * Collects compilation-unit dependencies for the given file, and records
     * them via calls to <code>fDependency.addDependency()</code>.
     */
    protected void collectDependencies(IFile file) {
        String fromPath = file.getFullPath().toString();
        
        getPlugin().writeInfoMsg("Collecting dependencies from EDU file: " + file.getName());
        
        // TODO: implement dependency collector
        // E.g. for each dependency:
        // fDependencyInfo.addDependency(fromPath, uponPath);
    }

    /**
     * @return true iff this resource identifies the output folder
     */
    protected boolean isOutputFolder(IResource resource) {
        return resource.getFullPath().lastSegment().equals("bin");
    }

    public static final String EDU_BUILDER_CONSOLE = "EDU Builder";
    
    /**
     * The method is overriden because we need to explicitly show the console,
     * which the ANT builder may close.
     */
    @Override
    protected MessageConsoleStream getConsoleStream() {
    	MessageConsole console = findConsole(getConsoleName());
    	ConsolePlugin.getDefault().getConsoleManager().showConsoleView(console);
    	return console.newMessageStream();
    }
    
    @Override
    protected String getConsoleName(){
    	return EDU_BUILDER_CONSOLE;
    }
    
    private ConsoleLoggingStream getConsoleLoggingStream(){    	
        return EDUConsole.getConsoleLoggingStream();
    }
    
    private DelegateBuilder delegateBuilder = new DummyBuilder();
    
    @SuppressWarnings("unchecked")
    protected IProject[] build(int kind, Map args, IProgressMonitor monitor) {
    	final IProject project = getProject();
		
    	boolean buildSuccessful = true;
    	//Let's parse files first to see if there is any syntactic errors. 
		if(!parseAll(project, monitor)){
			buildSuccessful = false;
		}
    	
		if(!buildSuccessful){
			monitor.setCanceled(true);
			getConsoleLoggingStream().error("Build failed.");
			return new IProject[0];
		}
		
		IFolder gen = getGenFolder(project);
		
		IProject[] toReturn = delegateBuilder.build(
			this, getConsoleLoggingStream(), project, kind, args, monitor);
	
		try {
			gen.refreshLocal(IResource.DEPTH_INFINITE, null);
		} catch (CoreException e) {
			getConsoleLoggingStream().error("Refresh failed.");
			e.printStackTrace();
		}
		
		return toReturn;
    }
    
    /** The per-project folder holding derived (generated) resources */
    public static final String GEN_FOLDER = "bin";
    
    private IFolder getGenFolder(IProject project){
    	IFolder gen = project.getFolder(GEN_FOLDER);
    	if(!gen.exists()){
    		try {
				gen.create(IResource.FORCE|IResource.DERIVED|IResource.HIDDEN, true, null);
			} catch (CoreException e) {
				e.printStackTrace();
			}
    	}
    	
    	return gen;
    }
	
	/**
	 * Handle the message list returned by EDUBuildInvoker.
	 */
	@Override
	public boolean handleBuild(List<NIdeMessage> list) {
		boolean result =  handleMsgList(list);
		
		//Add customized code here
		
		return result;
	}
	
	/**
	 * Handle the message list returned by EDUPostBuildInvoker.
	 * <p>
	 * This method will be called back by EDUPostBuildInvoker, if user 
	 * defines a post-builder function.
	 */
	@Override
	public boolean handlePostBuild(List<NIdeMessage> list) {
		boolean result =  handleMsgList(list);
		
		//Add customized code here
		
		return result;
	}
	
	private boolean handleMsgList(List<NIdeMessage> list){
		IProject project = getProject();
		
		return lastBuildState = Utility.renderMessages(list, project, BUILD_HANDLER);
	}
	
	/** 
     * The state of last build action. Useful for export or other actions 
     * depending on successful build. 
     */
	private boolean lastBuildState = false;
	
    /**
     * Message handler for build action. Different from default handler only 
     * in that it also prints the message out to the console for project 
     * problem.
     */
	private Utility.MessageHandler BUILD_HANDLER = new Utility.DefaultMessageHandler(){
		public void handleProjectProblem(IProject project, int level, String message) {
			switch(level){
			case Problem.ERROR:
				getConsoleLoggingStream().error("[BUILD ERROR] " + message);
				try {
					IMarker marker = project.createMarker(getErrorMarkerID());
					marker.setAttribute(IMarker.MESSAGE, message);
					marker.setAttribute(IMarker.SEVERITY, level);
				} catch (CoreException e) {
					e.printStackTrace();
				}
				break;
			case Problem.WARNING:
				getConsoleLoggingStream().error("[BUILD WARNING] " + message);
				try {
					IMarker marker = project.createMarker(getWarningMarkerID());
					marker.setAttribute(IMarker.MESSAGE, message);
					marker.setAttribute(IMarker.SEVERITY, level);
				} catch (CoreException e) {
					e.printStackTrace();
				}
				break;		
			default:
				getConsoleLoggingStream().info("[BUILD INFO] " + message);
			}
		}
	};

    /**
     * Parse all the affected files.
     * 
     * @param project
     * @param monitor
     * @return
     */
	private boolean parseAll(IProject project, final IProgressMonitor monitor) {
		PROJECT_PARSER.reset(monitor);
		
		IResourceDelta delta = EDUBuilder.this.getDelta(project);
		
		try {
			if(delta!=null){
				delta.accept(PROJECT_PARSER);
			}
			return PROJECT_PARSER.isSuccessful();
		} catch (CoreException e) {
			getPlugin().logException(
	            "The builder encounters a fatal problem during build.", e);
			return false;
		}
	}
	
	/** 
	 * A delta visitor used to walk through the project and parse source files
	 * affected by last edit. 
	 */
	private final ResourceDeltaVisitor PROJECT_PARSER = new ResourceDeltaVisitor();

	private class ResourceDeltaVisitor implements IResourceDeltaVisitor {
		
		private boolean success;
		private IProgressMonitor monitor;
		
		@Override
		public boolean visit(IResourceDelta delta)
				throws CoreException {
			IResource resource = delta.getResource();
            if(resource instanceof IFile){
                IFile file = (IFile)resource;
                if(file.exists()){
                    if(isSourceFile(file)){
                    	clearMarkersOn(file);
                    	success &= parseSourceFile(file, monitor);
                    }
                }
            }
            
            //Continue walk-through if any children is affected
            IResourceDelta children[] = delta.getAffectedChildren();
            if(children!=null && children.length>0){
            	return true;
            }
            
			return false;
		}

		public void reset(IProgressMonitor monitor) {
			this.success = true;
			this.monitor = monitor;
		}

		public boolean isSuccessful() {
			return success;
		}
		
	}
	
	/**
	 * Parse source file.
	 * 
	 * @param file
	 * @param monitor
	 * @return true if parsing is successful (no syntax error)
	 */
    private boolean parseSourceFile(final IFile file, IProgressMonitor monitor) {
        try {
        	//Create parser controller
            IParseController parseController = new EDUParseController();
            
            //Create marker creator
            MarkerCreator markerCreator = new MarkerCreator(file, PROBLEM_MARKER_ID);
            parseController.getAnnotationTypeInfo().addProblemMarkerType(getErrorMarkerID());

            //Initialize parser controller
            ISourceProject sourceProject = ModelFactory.open(file.getProject());
            parseController.initialize(file.getProjectRelativePath(), sourceProject, markerCreator);

            //Go!
            String contents = BuilderUtils.getFileContents(file);
            Object result = parseController.parse(contents, monitor);
            
            //Nothing returned from parsing. An error must have happened.
            if(result==null){
            	return false;
            }
        } catch (ModelException e) {
            getPlugin().logException(
            	"The builder returns without parsing due to a ModelException", e);
            return false;
        }
        
        return true;
    }

    /**
     * Compile one EDU file.
     */
    protected void compile(final IFile file, IProgressMonitor monitor) {
        try {
        	//findConsole(getConsoleName()).
        	//getConsoleStream().println("Building EDU file: " + file.getName());
            getPlugin().writeInfoMsg("Building EDU file: " + file.getName());

            // START_HERE
            //EDUCompiler compiler= new EDUCompiler(PROBLEM_MARKER_ID);
            //compiler.compile(file, monitor);
            // Here we provide a substitute for the compile method that simply
            // runs the parser in place of the compiler but creates problem
            // markers for errors that will show up in the problems view
            runParserForCompiler(file, monitor);

            doRefresh(file.getParent()); // N.B.: Assumes all generated files go into parent folder
        } catch (Exception e) {
            // catch Exception, because any exception could break the
            // builder infra-structure.
            getPlugin().logException(e.getMessage(), e);
        }
    }

    /**
     * This is an example "compiler" implementation that simply uses the parse controller
     * to parse the given file, adding error markers to the file for any parse errors
     * that are reported.
     * 
     * Error markers are created by a special type of message handler (i.e., implementation
     * of IMessageHandler) known as a MarkerCreator.  The MarkerCreator is passed to the
     * parse controller.  The parser reports its error messages to the MarkerCreator, and
     * the MarkerCreator puts corresponding error markers on the file.
     * 
     * This example shows the use of two different types of marker creator:  the MarkerCreator
     * base type and an the MarkerCreatorWithBatching subtype.  In MarkerCreator the error
     * markers are added to the file one at a time, as error messages are received.  In
     * MarkerCreatorWithBatching, the information from each error message is cached; 
     * the corresponding error markers are not created until the flush(..) method is called,
     * at which point all markers are created together.  MarkerCreatorWithBatching is more
     * complicated internally and requires proper use of the flush(..) method, but it may
     * be more efficient at runtime for files that have many errors.  That is because a
     * Workspace operation is required to add the error markers to the file.  There is one
     * of these for each of the error markers added in MarkerCreator, but only one for all
     * of the markers in MarkerCreatorWithBatching.
     * 
     * In this example we have declared a marker creator of each type but commented out the
     * batching version.  The example should also execute correctly if you comment out the
     * base version and uncomment the batching version, so it should be easy to experiment
     * with them.
     * 
     * TODO remove or rename this method once an actual compiler is being called. 
     * 
     * param file    input source file
     * param monitor progress monitor
     */
    protected void runParserForCompiler(final IFile file, IProgressMonitor monitor) {
        try {
            IParseController parseController = new EDUParseController();

            // TODO:  Pick a version of the marker creator (or just go with this one)
            MarkerCreator markerCreator = new MarkerCreator(file, PROBLEM_MARKER_ID);
//          MarkerCreatorWithBatching markerCreator = new MarkerCreatorWithBatching(file, this);
            
            parseController.getAnnotationTypeInfo().addProblemMarkerType(getErrorMarkerID());

            ISourceProject sourceProject = ModelFactory.open(file.getProject());
            parseController.initialize(file.getProjectRelativePath(), sourceProject, markerCreator);

            String contents = BuilderUtils.getFileContents(file);
            parseController.parse(contents, monitor);
            
            if (markerCreator instanceof MarkerCreatorWithBatching) {
            	((MarkerCreatorWithBatching)markerCreator).flush(monitor);
            }
        } catch (ModelException e) {
            getPlugin().logException("Example builder returns without parsing due to a ModelException", e);
        }
    }
}
