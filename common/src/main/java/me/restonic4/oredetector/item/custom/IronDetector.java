package me.restonic4.oredetector.item.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class IronDetector extends OreDetectorItem {
    public IronDetector(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBlock(BlockState state) {
        return state.is(Blocks.IRON_ORE) || state.is(Blocks.DEEPSLATE_IRON_ORE);
    }
}
