package me.restonic4.oredetector;

import me.restonic4.oredetector.item.ItemManager;
import me.restonic4.oredetector.sound.SoundManager;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.sound.SoundRegistry;

public class OreDetector
{
	public static final String MOD_ID = "oredetector";

	public static void init() {
		ItemRegistry.CreateRegistry(MOD_ID);
		SoundRegistry.CreateRegistry(MOD_ID);

		ItemManager.register();
		SoundManager.register();
	}
}
