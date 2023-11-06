package me.restonic4.oredetector.creative_tab;

import me.restonic4.restapi.creative_tab.CreativeTabRegistry;

import static me.restonic4.oredetector.OreDetector.MOD_ID;

public class CreativeTabManager {
    public static Object mainTab = CreativeTabRegistry.CreateCreativeTab(MOD_ID, "ore_detector", "iron_detector");

    public static void register() {
        CreativeTabRegistry.Register(MOD_ID);
    }
}
