package me.restonic4.oredetector.fabric;

import me.restonic4.oredetector.OreDetector;
import net.fabricmc.api.ModInitializer;

public class OreDetectorFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        OreDetector.init();
    }
}