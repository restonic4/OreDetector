package me.restonic4.oredetector.sound;

import me.restonic4.restapi.sound.SoundRegistry;

import static me.restonic4.oredetector.OreDetector.MOD_ID;

public class SoundManager {
    public static Object notFound = SoundRegistry.RegisterSound(MOD_ID, "not_found");
    public static Object found = SoundRegistry.RegisterSound(MOD_ID, "found");

    public static void register() {
        SoundRegistry.Register(MOD_ID);
    }
}
