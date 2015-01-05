package com.realism.proxy;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraftforge.client.MinecraftForgeClient;
import net.minecraftforge.fml.client.registry.ClientRegistry;

import com.realism.client.renderer.RenderTestBlock;
import com.realism.common.block.tileentity.TileEntityTestBlock;

public class ServerProxy {
	public void registerRenderThings() {
		//TestTable
		TileEntitySpecialRenderer renderer = new RenderTestBlock();
		ClientRegistry.registerTileEntity(TileEntityTestBlock.class, "testblock", renderer);
	}
	
	public void registerTileEntitySpecialRenderer() {
		
	}
}
