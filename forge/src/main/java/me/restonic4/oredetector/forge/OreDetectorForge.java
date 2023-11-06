package me.restonic4.oredetector.forge;

import dev.architectury.platform.forge.EventBuses;
import me.restonic4.oredetector.OreDetector;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(OreDetector.MOD_ID)
public class OreDetectorForge {
    public OreDetectorForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(OreDetector.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
        OreDetector.init();
    }
}