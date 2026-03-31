package net.viv.moreamethyst.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreAmethyst.MOD_ID);

    public static final  DeferredBlock<Block> AMETHYST_BLOCK_RED = registerBlock("amethyst_block_red",
            () -> new Block(BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .requiresCorrectToolForDrops()
                    .sound(SoundType.AMETHYST)));

    public static final  DeferredBlock<Block> SMALL_AMETHYST_BUD_RED = registerBlock("small_amethyst_bud_red",
            () -> new AmethystClusterBlock(3f, 4f, BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.SMALL_AMETHYST_BUD)
                    .lightLevel((p_187409_) -> 1)));

    public static final  DeferredBlock<Block> MEDIUM_AMETHYST_BUD_RED = registerBlock("medium_amethyst_bud_red",
            () -> new AmethystClusterBlock(4f, 3f, BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.MEDIUM_AMETHYST_BUD)
                    .lightLevel((p_152617_) -> 2)));

    public static final  DeferredBlock<Block> LARGE_AMETHYST_BUD_RED = registerBlock("large_amethyst_bud_red",
            () -> new AmethystClusterBlock(5f, 3f, BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.LARGE_AMETHYST_BUD)
                    .lightLevel((p_152629_) -> 4)));

    public static final  DeferredBlock<Block> AMETHYST_CLUSTER_RED = registerBlock("amethyst_cluster_red",
            () -> new AmethystClusterBlock(7f, 3f, BlockBehaviour.Properties.of()
                    .strength(1.5f)
                    .sound(SoundType.AMETHYST_CLUSTER)
                    .lightLevel((p_152632_) -> 5)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, DeferredBlock<T> block) {
        ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
