package com.multiteam.mt.items;

import com.multiteam.mt.Reference;
import net.minecraft.item.Item;

public class ItemDataScreen extends Item {

    public ItemDataScreen() {
        setRegistryName("datascreen");
        setUnlocalizedName(Reference.MOD_ID + ".datascreen");   // Used for lang files (en_US.lang)
    }
}
