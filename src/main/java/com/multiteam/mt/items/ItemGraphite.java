package com.multiteam.mt.items;

import com.multiteam.mt.Reference;
import net.minecraft.item.Item;

public class ItemGraphite extends Item{

    public ItemGraphite() {
        setRegistryName("graphite");
        setUnlocalizedName(Reference.MOD_ID + ".graphite");   // Used for lang files (en_US.lang)
    }
}
