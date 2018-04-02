package com.multiteam.mt.items;

import com.multiteam.mt.Reference;
import net.minecraft.item.Item;

public class ItemSteelIngot extends Item{

    public ItemSteelIngot() {
        setRegistryName("steelingot");
        setUnlocalizedName(Reference.MOD_ID + ".steelingot");   // Used for lang files (en_US.lang)
    }

}
