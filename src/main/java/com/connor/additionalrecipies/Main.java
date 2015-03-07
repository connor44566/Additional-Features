package com.connor.additionalrecipies;
import com.connor.additionalrecipies.lib.Constants;
import com.connor.additionalrecipies.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkRegistry;

@Mod(modid = Constants.MODID, name = Constants.MODNAME, version = Constants.VERSION)

public class Main {
	@Mod.Instance(Constants.MODID)
	public static Main instance;
	@SidedProxy(clientSide = Constants.CLIENT_PROXY_CLASS, serverSide = Constants.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	ModBlocks.init();
    	ModItems.init();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
    	proxy.registerTileEntities();
    	NetworkRegistry.INSTANCE.registerGuiHandler(instance, new GuiHandler());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }
}
