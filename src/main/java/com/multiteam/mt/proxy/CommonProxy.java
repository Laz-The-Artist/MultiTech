package com.multiteam.mt.proxy;

import com.multiteam.mt.blocks.BlockSteel;
import com.multiteam.mt.config.Config;
import com.multiteam.mt.items.*;
import com.multiteam.mt.registerstuff.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

import java.io.File;

@Mod.EventBusSubscriber
public class CommonProxy {

    // Config instance
    public static Configuration config;

    public void preInit(FMLPreInitializationEvent e) {
        File directory = e.getModConfigurationDirectory();
        config = new Configuration(new File(directory.getPath(), "multitech.cfg"));
        Config.readConfig();
    }

    public void init(FMLInitializationEvent e) {
    }

    public void postInit(FMLPostInitializationEvent e) {
        if (config.hasChanged()) {
            config.save();
        }
    }

    @SubscribeEvent
    public static void registerBlocks(RegistryEvent.Register<Block> event) {
        event.getRegistry().register(new BlockSteel());
    }



    @SubscribeEvent
    public static void registerItems(RegistryEvent.Register<Item> event) {
        // Items Only
        event.getRegistry().register(new ItemSteelIngot());
        event.getRegistry().register(new ItemBasicScreen());
        event.getRegistry().register(new ItemMagnet());
        event.getRegistry().register(new ItemDataScreen());
        event.getRegistry().register(new ItemGraphite());
        event.getRegistry().register(new ItemCopperWireCoil());
        event.getRegistry().register(new ItemCarbonChip());

        // Block items Only
        event.getRegistry().register(new ItemBlock(ModBlocks.blocksteel).setRegistryName(ModBlocks.blocksteel.getRegistryName()));
    }
}
