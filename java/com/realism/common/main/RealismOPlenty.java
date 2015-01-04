package com.realism.common.main;


import com.realism.common.resource.RealismVariables;
import com.realism.proxy.IProxy;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RealismVariables.MODID, version = RealismVariables.VERSION)
public class RealismOPlenty
{
	@Mod.Instance(RealismVariables.MODID)
    public static RealismOPlenty instance;

    @SidedProxy(clientSide = RealismVariables.CLIENT_PROXY, serverSide = RealismVariables.SERVER_PROXY, modId = RealismVariables.MODID)
    public static IProxy proxy;

    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {

    }
    
    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
