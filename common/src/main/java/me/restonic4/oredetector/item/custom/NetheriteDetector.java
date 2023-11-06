package me.restonic4.oredetector.item.custom;

import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

public class NetheriteDetector extends OreDetectorItem {
    public NetheriteDetector(Properties properties) {
        super(properties);
    }

    @Override
    public boolean isValidBlock(BlockState state) {
        return state.is(Blocks.ANCIENT_DEBRIS);
    }
}
