package me.restonic4.oredetector.item;

import me.restonic4.oredetector.item.custom.GoldDetector;
import me.restonic4.oredetector.item.custom.IronDetector;
import me.restonic4.oredetector.item.custom.OreDetectorItem;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.util.CustomItemProperties;
import net.minecraft.world.item.CreativeModeTabs;

import static me.restonic4.oredetector.OreDetector.MOD_ID;

public class ItemManager {
    public static Object IRON_DETECTOR = ItemRegistry.CreateCustom(
            MOD_ID,
            "iron_detector",
            () -> new IronDetector(
                    new CustomItemProperties()
                            .tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                            .build()
            )
    );

    public static Object GOLD_DETECTOR = ItemRegistry.CreateCustom(
            MOD_ID,
            "gold_detector",
            () -> new GoldDetector(
                    new CustomItemProperties()
                            .tab(CreativeModeTabs.TOOLS_AND_UTILITIES)
                            .build()
            )
    );

    public static void register() {
        ItemRegistry.Register(MOD_ID);
    }
}
