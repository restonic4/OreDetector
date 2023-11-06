package me.restonic4.oredetector.item.custom;

import dev.architectury.registry.registries.DeferredSupplier;
import me.restonic4.oredetector.sound.SoundManager;
import me.restonic4.restapi.RestApi;
import me.restonic4.restapi.sound.SoundRegistry;
import net.minecraft.client.resources.language.I18n;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;

import static me.restonic4.oredetector.OreDetector.MOD_ID;

public class OreDetectorItem extends Item {
    public OreDetectorItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext pContext) {
        if(!pContext.getLevel().isClientSide()) {
            Player player = pContext.getPlayer();
            BlockPos positionClicked = pContext.getClickedPos();

            int radius = 1;

            boolean foundBlock = false;

            outer_loop:
            for (int x = -radius; x <= radius; x++) {
                for (int z = -radius; z <= radius; z++) {
                    BlockPos checkPos = positionClicked.offset(x, 0, z);

                    for(int i = -64; i <= positionClicked.getY() + 5; i++) {
                        BlockState state = pContext.getLevel().getBlockState(checkPos.atY(i));

                        if (isValidBlock(state)) {
                            foundBlock = true;
                            break outer_loop;
                        }
                    }
                }
            }

            if(!foundBlock) {
                oreNotFound(player, pContext.getLevel());
            }
            else {
                oreFound(player, pContext.getLevel());
            }
        }

        damageTool(pContext);

        return InteractionResult.SUCCESS;
    }

    private void damageTool(UseOnContext pContext) {
        pContext.getItemInHand().hurtAndBreak(
                1,
                pContext.getPlayer(),
                player -> player.broadcastBreakEvent(player.getUsedItemHand())
        );
    }

    public boolean isValidBlock(BlockState state) {
        return false;
    }

    private void oreFound(Player player, Level level) {
        RestApi.Log("Ore found", MOD_ID);

        SoundEvent sound = ((DeferredSupplier<SoundEvent>)  SoundManager.found).get();

        level.playSound(null, player.getOnPos(), sound, SoundSource.PLAYERS);
    }

    private void oreNotFound(Player player, Level level) {
        RestApi.Log("Ore not found found", MOD_ID);

        SoundEvent sound = ((DeferredSupplier<SoundEvent>)  SoundManager.notFound).get();

        level.playSound(null, player.getOnPos(), sound, SoundSource.PLAYERS);
    }
}
