package com.Lordfelmet.NP;

import com.Lordfelmet.NP.config.ConfigHandler;
import com.Lordfelmet.NP.init.ModItems;
import com.Lordfelmet.NP.proxy.IProxy;
import com.Lordfelmet.NP.reference.Reference;
import com.Lordfelmet.NP.utility.LogHelper;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NP
{

    
	  
    @Mod.Instance(Reference.MOD_ID)
    public static NP instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;
    

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	ConfigHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigHandler());

        ModItems.init();

        LogHelper.info("Pre Initialization Complete!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    
    	
    	
    	LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
       
    	
    	LogHelper.info("Post Initialization Complete!");
    }
}
