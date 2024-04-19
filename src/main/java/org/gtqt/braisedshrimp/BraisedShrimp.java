package org.gtqt.braisedshrimp;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;

/**
 * Entry Class: All Lifecycle Events Inside.
 * <b> !! PLEASE FOLLOW THE ENUM SINGLETON PARADIGM</b>
 *
 * @author Timicasto
 * @since 1.0
 */
@Mod(modid = "braisedshrimp", name = "Braised Shrimp", version = "1.0", useMetadata = true)
public enum BraisedShrimp {
	INSTANCE;

	@Mod.InstanceFactory
	public static BraisedShrimp getInstance() {
		return INSTANCE;
	}

	@Mod.EventHandler
	public void construction(FMLConstructionEvent evt) {

	}

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent evt) {

	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent evt) {

	}

	@Mod.EventHandler
	public void interModComms(FMLInterModComms.IMCEvent evt) {

	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent evt) {

	}

	@Mod.EventHandler
	public void complete(FMLLoadCompleteEvent evt) {

	}
}
