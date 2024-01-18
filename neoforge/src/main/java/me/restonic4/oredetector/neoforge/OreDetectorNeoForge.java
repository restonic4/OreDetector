package me.restonic4.oredetector.neoforge;

import me.restonic4.oredetector.OreDetector;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(OreDetector.MOD_ID)
public class OreDetectorNeoForge {
	public OreDetectorNeoForge(IEventBus modEventBus) {
		OreDetector.init();
	}
}
