package com.multiteam.mt.items;

import com.multiteam.mt.Reference;
import net.minecraft.item.Item;

public class ItemBasicScreen extends Item {

    public ItemBasicScreen() {
        setRegistryName("basicscreen");
        setUnlocalizedName(Reference.MOD_ID + ".basicscreen");   // Used for lang files (en_US.lang)
    }
}
