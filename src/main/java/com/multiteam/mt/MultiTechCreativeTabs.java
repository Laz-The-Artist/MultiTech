package com.multiteam.mt;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

import java.util.Collections;
import java.util.Comparator;

public class MultiTechCreativeTabs extends CreativeTabs {
    private ItemStack iconItem;

    private ItemSorter itemSorter = new ItemSorter();

    public MultiTechCreativeTabs(String label, Item item)
    {
        super(label);
        iconItem = new ItemStack(item);
    }

    @Override
    public ItemStack getTabIconItem()
    {
        return iconItem;
    }

    @Override
    public void displayAllRelevantItems(NonNullList<ItemStack> items)
    {
        super.displayAllRelevantItems(items);

        Collections.sort(items, itemSorter);
    }

    //Credit to Rohzek for this

    // Sorts items in alphabetical order using their display names, blocks on top
    private static class ItemSorter implements Comparator<ItemStack>
    {

        @Override
        public int compare(ItemStack o1, ItemStack o2)
        {
            Item item1 = o1.getItem();
            Item item2 = o2.getItem();

            // If item1 is a block and item2 isn't, sort item1 before item2
            if (((item1 instanceof ItemBlock)) && (!(item2 instanceof ItemBlock)))
            {
                return -1;
            }

            // If item2 is a block and item1 isn't, sort item1 after item2
            if (((item2 instanceof ItemBlock)) && (!(item1 instanceof ItemBlock)))
            {
                return 1;
            }

            String displayName1 = o1.getDisplayName();
            String displayName2 = o2.getDisplayName();

            int result = displayName1.compareToIgnoreCase(displayName2);

            return result;
        }
    }


}
