package com.realism.common.init;
import com.realism.client.model.ModelHelper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Toby on 07/10/2014.
 */
public class RealismItems
{
    public void registerItem(Item item, String name)
    {
        GameRegistry.registerItem(item, name);
        ModelHelper.registerItem(item, name);
    }
}