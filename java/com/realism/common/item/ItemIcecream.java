package com.realism.common.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemFood;

public class ItemIcecream extends ItemFood {

	public ItemIcecream(int amount, float saturation, boolean isWolfFood) {
		super(amount, saturation, isWolfFood);
		this.setCreativeTab(CreativeTabs.tabFood);
	}

}
