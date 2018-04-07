package com.multiteam.mt;


import com.multiteam.mt.proxy.CommonProxy;
import com.multiteam.mt.registerstuff.ModItems;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Level;

import java.util.logging.Logger;

import static jdk.nashorn.internal.objects.NativeMath.log;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME,  version = Reference.VERSION)
public class MultiTech {

    @SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
    public static CommonProxy proxy;

    @Mod.Instance
    public static MultiTech instance;

    public static Logger logger;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {
        proxy.preInit(e);

        MultiTech.logging.info("Pre Initialization Done!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

        MultiTech.logging.info("Initialization Done!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {


        MultiTech.logging.info("REEEEEEEEEEEE Post Initialization Done!");
    }


    public static class logging {
        public static void log(Level logLevel, Object object) {
            FMLLog.log(Reference.MOD_NAME, logLevel, String.valueOf(object));
        }


    public static void info(Object object) {
        log(Level.INFO, object);
    }
    }

}
