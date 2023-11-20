package me.restonic4.oredetector.item;

import me.restonic4.oredetector.creative_tab.CreativeTabManager;
import me.restonic4.oredetector.item.custom.*;
import me.restonic4.restapi.holder.RestItem;
import me.restonic4.restapi.item.ItemRegistry;
import me.restonic4.restapi.util.CustomItemProperties;
import net.minecraft.world.item.CreativeModeTabs;

import static me.restonic4.oredetector.OreDetector.MOD_ID;

public class ItemManager {
    public static RestItem IRON_DETECTOR = ItemRegistry.CreateCustom(
            MOD_ID,
            "iron_detector",
            () -> new IronDetector(
                    new CustomItemProperties()
                            .tab(CreativeTabManager.mainTab)
                            .build()
            )
    );

    public static RestItem GOLD_DETECTOR = ItemRegistry.CreateCustom(
            MOD_ID,
            "gold_detector",
            () -> new GoldDetector(
                    new CustomItemProperties()
                            .tab(CreativeTabManager.mainTab)
                            .build()
            )
    );

    public static RestItem DIAMOND_DETECTOR = ItemRegistry.CreateCustom(
            MOD_ID,
            "diamond_detector",
            () -> new DiamondDetector(
                    new CustomItemProperties()
                            .tab(CreativeTabManager.mainTab)
                            .build()
            )
    );

    public static RestItem NETHERITE_DETECTOR = ItemRegistry.CreateCustom(
            MOD_ID,
            "netherite_detector",
            () -> new NetheriteDetector(
                    new CustomItemProperties()
                            .tab(CreativeTabManager.mainTab)
                            .build()
            )
    );

    public static void register() {
        ItemRegistry.Register(MOD_ID);
    }
}
