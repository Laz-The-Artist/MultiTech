package com.multiteam.mt.blocks;


import com.multiteam.mt.Reference;
import net.minecraft.block.material.Material;

public class BlockSteel extends net.minecraft.block.Block {

    public BlockSteel() {
    super(Material.IRON);
    setUnlocalizedName(Reference.MOD_ID + ".blocksteel");    // Used for lang files (en_US.lang)
    setRegistryName("blocksteel");
    }



}
