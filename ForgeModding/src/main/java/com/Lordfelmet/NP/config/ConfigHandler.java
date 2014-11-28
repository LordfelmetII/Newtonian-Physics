package com.Lordfelmet.NP.config;

import com.Lordfelmet.NP.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigHandler
{
    public static Configuration configuration;
    public static boolean FFBMode = false;
    public static int epiphanyFrequency = 1;

    public static void init(File configFile)
    {
        // Create the configuration object from the given configuration file
        if (configuration == null)
        {
            configuration = new Configuration(configFile);
            loadConfiguration();
        }
    }

    private static void loadConfiguration()
    {
        FFBMode = configuration.getBoolean("Fifty Freaking Billion Mode", "Atomic Physics", false, "creates one in fifty freaking billion chance to kill player on activation of LHC");
        epiphanyFrequency = configuration.getInt("Epiphany Frequency", "Research", 5, 1, 10, "determines the frequency of random epiphanies for ideas (boosted in FFB mode)");
        if (configuration.hasChanged())
        {
            configuration.save();
        }
    }

    @SubscribeEvent
    public void onConfigurationChangedEvent(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if (event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfiguration();
        }
    }
}