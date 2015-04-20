/*
 * Variables used:
 *   PKG_NAME
 *   LANG_NAME
 */
package edu.umn.cs.melt.ableC.artifacts.ide_basic;

public final class EDUInitializer {

	private static boolean DONE = false;
	
	/**
	 * Initialize EDU compiler
	 */
	public synchronized static void initialize () {
		if(!DONE){
			edu.umn.cs.melt.ableC.artifacts.ide_basic.Init.initAllStatics();
			edu.umn.cs.melt.ableC.artifacts.ide_basic.Init.init();
			edu.umn.cs.melt.ableC.artifacts.ide_basic.Init.postInit();
			DONE = true;
		}
	}
	
}
