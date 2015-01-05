package com.realism.common.main;


import com.realism.common.block.TestBlock;
import com.realism.common.resource.RealismVariables;
import com.realism.proxy.ClientProxy;
import com.realism.proxy.ServerProxy;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = RealismVariables.MODID, version = RealismVariables.VERSION)
public class RealismOPlenty
{
	@Mod.Instance(RealismVariables.MODID)
    public static RealismOPlenty instance;

    @SidedProxy(clientSide = RealismVariables.CLIENT_PROXY, serverSide = RealismVariables.SERVER_PROXY, modId = RealismVariables.MODID)
    public static ServerProxy Sproxy;
    public static ClientProxy Cproxy;
    
    public static Block modelTestBlock;
    
    
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
    	//Blocks
    	
    	modelTestBlock = new TestBlock(Material.iron).setUnlocalizedName("testblock");
  

    }
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
    	GameRegistry.registerBlock(modelTestBlock, "testblock");
    	// Renderer(s) 

    	Sproxy.registerRenderThings();
    }
    

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
