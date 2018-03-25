package com.multiteam.mt;


import com.multiteam.mt.utility.LogHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.util.logging.Logger;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,  version = Reference.VERSION)
public class MultiTech
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance
    public static MultiTech instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e)
    {
        proxy.preInit(e);


        LogHelper.info("Pre Initialization Done!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e)
    {

        LogHelper.info("Initialization Done!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e)
    {


        LogHelper.info("Post Initialization Done!");
    }
}