package me.restonic4.oredetector;

import me.restonic4.oredetector.creative_tab.CreativeTabManager;
import me.restonic4.oredetector.item.ItemManager;
import me.restonic4.oredetector.sound.SoundManager;
import me.restonic4.restapi.creative_tab.CreativeTabRegistry;
import me.restonic4.restapi.holder.Generic.RestLogger;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.sound.SoundRegistry;
import net.minecraft.world.item.CreativeModeTabs;

public class OreDetector
{
	public static final String MOD_ID = "oredetector";
	public static final RestLogger LOGGER = new RestLogger(MOD_ID);

	public static void init() {
		ItemRegistry.CreateRegistry(MOD_ID);
		CreativeTabRegistry.CreateRegistry(MOD_ID);
		SoundRegistry.CreateRegistry(MOD_ID);

		ItemManager.register();
		CreativeTabManager.register();
		SoundManager.register();
	}
}
