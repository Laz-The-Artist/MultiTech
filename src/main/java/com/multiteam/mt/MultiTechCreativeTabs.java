package com.multiteam.mt;

import com.multiteam.mt.registerstuff.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Collections;
import java.util.Comparator;

public class MultiTechCreativeTabs extends CreativeTabs {

    public MultiTechCreativeTabs(String label) {
        super("MultiTech");
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.basicScreen);
    }
}
