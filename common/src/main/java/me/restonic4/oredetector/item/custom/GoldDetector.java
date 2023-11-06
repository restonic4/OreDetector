package me.restonic4.oredetector.item.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class GoldDetector extends OreDetectorItem {
    public GoldDetector(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBlock(BlockState state) {
        return state.is(Blocks.GOLD_ORE) || state.is(Blocks.DEEPSLATE_GOLD_ORE);
    }
}
