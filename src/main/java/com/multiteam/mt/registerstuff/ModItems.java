package com.multiteam.mt.registerstuff;

import com.multiteam.mt.items.*;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("mt:steelingot")
    public static ItemSteelIngot steelIngot;
    @GameRegistry.ObjectHolder("mt:magnet")
    public static ItemMagnet magnet;
    @GameRegistry.ObjectHolder("mt:graphite")
    public static ItemGraphite graphite;
    @GameRegistry.ObjectHolder("mt:datascreen")
    public static ItemDataScreen dataScreen;
    @GameRegistry.ObjectHolder("mt:copperwirecoil")
    public static ItemCopperWireCoil copperWireCoil;
    @GameRegistry.ObjectHolder("mt:carbonchip")
    public static ItemCarbonChip carbonChip;
    @GameRegistry.ObjectHolder("mt:basicscreen")
    public static ItemBasicScreen basicScreen;


    @SideOnly(Side.CLIENT)
    public static void initModels() {
        dataScreen.initModel();
        basicScreen.initModel();
        carbonChip.initModel();
        copperWireCoil.initModel();
        graphite.initModel();
        magnet.initModel();
        steelIngot.initModel();

    }
}

