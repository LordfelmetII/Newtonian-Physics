package com.Lordfelmet.NP;


import java.reference.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.BlockContainer;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION)
public class NP
{
	//  @SidedProxy(clientSide="com.Lordfelmet.Proxies.ClientProxy", serverSide="com.Lordfelmet.Proxies.CommonProxy")
    
	  
    @Mod.Instance(Reference.MOD_ID)
    public static NP instance;

    //@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    //public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	 
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
    	//Block test1 = new Test1();
    	//proxy.registerRenderThings();
        //GameRegistry.registerTileEntity(TileEntityTest1.class, test1.getLocalizedName());
        //GameRegistry.registerBlock(test1, test1.getLocalizedName());
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
       
    }
}