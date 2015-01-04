package com.realism.common.init;
import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.launchwrapper.Launch;
import com.realism.client.model.ModelHelper;
import net.minecraftforge.fml.common.ObfuscationReflectionHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

import java.util.Iterator;
import java.util.Map;


/**
 * Created by Toby on 07/10/2014.
 */
public class RealismBlocks
{
    public static void registerBlock(Block block, String string)
    {
        tempRegisterBlock(block, string);
        ModelHelper.registerBlock(block, "Realism:" + string);
    }

    public static Block tempRegisterBlock(Block block, String name)
    {
        block = GameRegistry.registerBlock(block, name);

        Item associatedItem = GameRegistry.findItem("Realism", name);

        Map itemBlockMap;

        if((Boolean) Launch.blackboard.get("fml.deobfuscatedEnvironment"))
        {
            itemBlockMap = (Map) ObfuscationReflectionHelper.getPrivateValue(Item.class, null, "BLOCK_TO_ITEM");
        }
        else
        {
            itemBlockMap = (Map)ObfuscationReflectionHelper.getPrivateValue(Item.class, null, "field_179220_a");
        }

        if (!itemBlockMap.containsKey(block)) itemBlockMap.put(block, associatedItem);
        Iterator iterator = block.getBlockState().getValidStates().iterator();

        while (iterator.hasNext())
        {
            IBlockState iblockstate = (IBlockState)iterator.next();
            int id = Block.blockRegistry.getIDForObject(block) << 4 | block.getMetaFromState(iblockstate);
            Block.BLOCK_STATE_IDS.put(iblockstate, id);
        }

        return block;
    }
}