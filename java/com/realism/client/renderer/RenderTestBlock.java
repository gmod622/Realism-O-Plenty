package com.realism.client.renderer;

import org.lwjgl.opengl.GL11;

import com.realism.client.model.ModelTestTable;
import com.realism.common.resource.RealismVariables;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.OpenGlHelper;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class RenderTestBlock extends TileEntitySpecialRenderer {
	   
    private final ModelTestTable model;
    
    public RenderTestBlock() {
            this.model = new ModelTestTable();
    }
    
    private void adjustRotatePivotViaMeta(World world, int x, int y, int z) {
            GL11.glPushMatrix();
            GL11.glRotatef(180 * (-90), 0.0F, 0.0F, 1.0F);
            GL11.glPopMatrix();
    }
    
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float scale) {
            GL11.glPushMatrix();
            GL11.glTranslatef((float) x + 0.5F, (float) y + 1.5F, (float) z + 0.5F);
            ResourceLocation textures = (new ResourceLocation("[yourmodidhere]:textures/blocks/TrafficLightPoleRed.png")); 
            Minecraft.getMinecraft().renderEngine.bindTexture(textures);
            GL11.glPushMatrix();
            GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
            this.model.render((Entity)null, 0.0F, 0.0F, -0.1F, 0.0F, 0.0F, 0.0625F);
            GL11.glPopMatrix();
            GL11.glPopMatrix();
    }


	@Override
	public void renderTileEntityAt(TileEntity p_180535_1_, double posX,
			double posZ, double p_180535_6_, float p_180535_8_, int p_180535_9_) {		
	}

}
