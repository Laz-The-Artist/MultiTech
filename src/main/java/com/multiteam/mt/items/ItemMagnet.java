package com.multiteam.mt.items;

import com.multiteam.mt.Reference;
import net.minecraft.item.Item;

public class ItemMagnet extends Item {

    public ItemMagnet() {
        setRegistryName("magnet");
        setUnlocalizedName(Reference.MOD_ID + ".magnet");   // Used for lang files (en_US.lang)
    }
}
