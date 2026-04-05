package net.viv.moreamethyst.block.custom.budding;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.BuddingAmethystBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Fluids;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.viv.moreamethyst.block.ModBlocks;

public class BuddingAmethystYellow extends BuddingAmethystBlock {
    public BuddingAmethystYellow(Properties properties) {
        super(properties);
    }

    @Override
    protected void randomTick( BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if(random.nextInt(5) == 0 ) {
            Direction direction = Direction.values()[random.nextInt(Direction.values().length)];
            BlockPos blockpos = pos.relative(direction);
            BlockState blockstate = level.getBlockState(blockpos);
            DeferredBlock<?> block = null;
            if (canClusterGrowAtState(blockstate)) {
                block = ModBlocks.SMALL_AMETHYST_BUD_YELLOW;
            } else if (blockstate.is(ModBlocks.SMALL_AMETHYST_BUD_YELLOW) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.MEDIUM_AMETHYST_BUD_YELLOW;
            } else if (blockstate.is(ModBlocks.MEDIUM_AMETHYST_BUD_YELLOW) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.LARGE_AMETHYST_BUD_YELLOW;
            } else if (blockstate.is(ModBlocks.LARGE_AMETHYST_BUD_YELLOW) && blockstate.getValue(AmethystClusterBlock.FACING) == direction) {
                block = ModBlocks.AMETHYST_CLUSTER_YELLOW;
            }

            if (block != null) {
                BlockState blockState = block.get().defaultBlockState()
                        .setValue(AmethystClusterBlock.FACING, direction)
                        .setValue(AmethystClusterBlock.WATERLOGGED,
                                blockstate.getFluidState().getType() == Fluids.WATER);
                level.setBlockAndUpdate(blockpos, blockState);
            }
        }
    }
}

