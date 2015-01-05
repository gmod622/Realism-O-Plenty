package com.realism.common.block;

import com.realism.common.block.tileentity.TileEntityTestBlock;

import net.minecraft.block.BlockContainer;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class TestBlock extends BlockContainer {

	public TestBlock(Material materialIn) {
		super(materialIn);
		this.setCreativeTab(CreativeTabs.tabBlock);
		this.setHardness(1f);
		this.setResistance(2f);
	}
	
	public int getRenderType() {
		return -1;
	}
	
	public boolean isOpaqueCube() {
		return false;
	}
	
	public boolean renderAsNormalBlock() {
		return false;
	}

	@Override
	public TileEntity createNewTileEntity(World worldIn, int meta) {
		return new TileEntityTestBlock();
	}

}
