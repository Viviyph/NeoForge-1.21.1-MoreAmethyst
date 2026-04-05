package net.viv.moreamethyst.block;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.AmethystClusterBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.PushReaction;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.block.custom.budding.BuddingAmethystRed;
import net.viv.moreamethyst.item.ModItems;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MoreAmethyst.MOD_ID);

    // Registers all amethyst blocks

    private static DeferredBlock<Block> registerAmethystBlock(String colour) {
        return registerBlock("amethyst_block_" + colour,
                () -> new Block(BlockBehaviour.Properties.of()
                        .strength(1.5f)
                        .requiresCorrectToolForDrops()
                        .sound(SoundType.AMETHYST)
                ));
    }
    public static final DeferredBlock<Block> AMETHYST_BLOCK_RED = registerAmethystBlock("red" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_ORANGE = registerAmethystBlock("orange" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_YELLOW = registerAmethystBlock("yellow" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_LIME = registerAmethystBlock("lime" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_GREEN = registerAmethystBlock("green" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_CYAN = registerAmethystBlock("cyan" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_LIGHT_BLUE = registerAmethystBlock("light_blue" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_BLUE = registerAmethystBlock("blue" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_MAGENTA = registerAmethystBlock("magenta" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_PINK = registerAmethystBlock("pink" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_WHITE = registerAmethystBlock("white" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_LIGHT_GRAY = registerAmethystBlock("light_gray" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_GRAY = registerAmethystBlock("gray" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_BLACK = registerAmethystBlock("black" );
    public static final DeferredBlock<Block> AMETHYST_BLOCK_BROWN = registerAmethystBlock("brown" );

    // Registers all budding blocks

    private static DeferredBlock<Block> registerBuddingBlock(String colour) {
        return registerBlock("budding_amethyst_" + colour,
                () -> new BuddingAmethystRed(BlockBehaviour.Properties.of()
                        .strength(1.5f)
                        .sound(SoundType.AMETHYST)
                        .pushReaction(PushReaction.BLOCK)
                        .randomTicks()
                        .requiresCorrectToolForDrops()
                ));
    }
    public static final DeferredBlock<Block> BUDDING_AMETHYST_RED = registerBuddingBlock("red");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_ORANGE = registerBuddingBlock("orange");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_YELLOW = registerBuddingBlock("yellow");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_LIME = registerBuddingBlock("lime");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_GREEN = registerBuddingBlock("green");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_CYAN = registerBuddingBlock("cyan");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_LIGHT_BLUE = registerBuddingBlock("light_blue");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_BLUE = registerBuddingBlock("blue");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_MAGENTA = registerBuddingBlock("magenta");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_PINK = registerBuddingBlock("pink");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_WHITE = registerBuddingBlock("white");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_LIGHT_GRAY = registerBuddingBlock("light_gray");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_GRAY = registerBuddingBlock("gray");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_BLACK = registerBuddingBlock("black");
    public static final DeferredBlock<Block> BUDDING_AMETHYST_BROWN = registerBuddingBlock("brown");

    // Registers all small bud blocks

    private static DeferredBlock<Block> registerSmallBud(String colour) {
        return registerBlock("small_amethyst_bud_" + colour,
                () -> new AmethystClusterBlock(3f, 4f, BlockBehaviour.Properties.of()
                        .strength(1.5f)
                        .pushReaction(PushReaction.DESTROY)
                        .sound(SoundType.SMALL_AMETHYST_BUD)
                        .lightLevel((p_187409_) -> 1)
                ));
    }
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_RED = registerSmallBud("red");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_ORANGE = registerSmallBud("orange");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_YELLOW = registerSmallBud("yellow");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_LIME = registerSmallBud("lime");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_GREEN = registerSmallBud("green");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_CYAN = registerSmallBud("cyan");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_LIGHT_BLUE = registerSmallBud("light_blue");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_BLUE = registerSmallBud("blue");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_MAGENTA = registerSmallBud("magenta");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_PINK = registerSmallBud("pink");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_WHITE = registerSmallBud("white");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_LIGHT_GRAY = registerSmallBud("light_gray");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_GRAY = registerSmallBud("gray");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_BLACK = registerSmallBud("black");
    public static final DeferredBlock<Block> SMALL_AMETHYST_BUD_BROWN = registerSmallBud("brown");

    // Registers all medium bud blocks

    private static DeferredBlock<Block> registerMediumBud(String colour) {
        return registerBlock("medium_amethyst_bud_" + colour,
                () -> new AmethystClusterBlock(4f, 3f, BlockBehaviour.Properties.of()
                        .strength(1.5f)
                        .pushReaction(PushReaction.DESTROY)
                        .sound(SoundType.MEDIUM_AMETHYST_BUD)
                        .lightLevel((p_152617_) -> 2)
                ));
    }
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_RED = registerMediumBud("red");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_ORANGE = registerMediumBud("orange");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_YELLOW = registerMediumBud("yellow");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_LIME = registerMediumBud("lime");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_GREEN = registerMediumBud("green");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_CYAN = registerMediumBud("cyan");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_LIGHT_BLUE = registerMediumBud("light_blue");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_BLUE = registerMediumBud("blue");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_MAGENTA = registerMediumBud("magenta");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_PINK = registerMediumBud("pink");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_WHITE = registerMediumBud("white");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_LIGHT_GRAY = registerMediumBud("light_gray");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_GRAY = registerMediumBud("gray");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_BLACK = registerMediumBud("black");
    public static final DeferredBlock<Block> MEDIUM_AMETHYST_BUD_BROWN = registerMediumBud("brown");

    // Registers all large bud blocks

    private static DeferredBlock<Block> registerLargeBud(String colour) {
        return registerBlock("large_amethyst_bud_" + colour,
                () -> new AmethystClusterBlock(5f, 3f, BlockBehaviour.Properties.of()
                        .strength(1.5f)
                        .pushReaction(PushReaction.DESTROY)
                        .sound(SoundType.LARGE_AMETHYST_BUD)
                        .lightLevel((p_152629_) -> 4)
                ));
    }
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_RED = registerLargeBud("red");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_ORANGE = registerLargeBud("orange");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_YELLOW = registerLargeBud("yellow");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_LIME = registerLargeBud("lime");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_GREEN = registerLargeBud("green");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_CYAN = registerLargeBud("cyan");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_LIGHT_BLUE = registerLargeBud("light_blue");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_BLUE = registerLargeBud("blue");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_MAGENTA = registerLargeBud("magenta");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_PINK = registerLargeBud("pink");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_WHITE = registerLargeBud("white");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_LIGHT_GRAY = registerLargeBud("light_gray");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_GRAY = registerLargeBud("gray");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_BLACK = registerLargeBud("black");
    public static final DeferredBlock<Block> LARGE_AMETHYST_BUD_BROWN = registerLargeBud("brown");

    // Registers all cluster blocks

    private static DeferredBlock<Block> registerAmethystCluster(String colour) {
        return registerBlock("amethyst_cluster_" + colour,
                () -> new AmethystClusterBlock(7f, 3f, BlockBehaviour.Properties.of()
                        .strength(1.5f)
                        .pushReaction(PushReaction.DESTROY)
                        .sound(SoundType.AMETHYST_CLUSTER)
                        .lightLevel((p_152632_) -> 5)
                ));
    }
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_RED = registerAmethystCluster("red");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_ORANGE = registerAmethystCluster("orange");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_YELLOW = registerAmethystCluster("yellow");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_LIME = registerAmethystCluster("lime");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_GREEN = registerAmethystCluster("green");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_CYAN = registerAmethystCluster("cyan");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_LIGHT_BLUE = registerAmethystCluster("light_blue");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_BLUE = registerAmethystCluster("blue");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_MAGENTA = registerAmethystCluster("magenta");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_PINK = registerAmethystCluster("pink");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_WHITE = registerAmethystCluster("white");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_LIGHT_GRAY = registerAmethystCluster("light_gray");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_GRAY = registerAmethystCluster("gray");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_BLACK = registerAmethystCluster("black");
    public static final DeferredBlock<Block> AMETHYST_CLUSTER_BROWN = registerAmethystCluster("brown");


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
