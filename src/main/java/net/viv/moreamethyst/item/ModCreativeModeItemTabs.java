package net.viv.moreamethyst.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeItemTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MoreAmethyst.MOD_ID);

    public static final Supplier<CreativeModeTab> MORE_AMETHYST_ITEMS_TAB = CREATIVE_MODE_TAB.register("more_amethyst_items_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.AMETHYST_SHARD_RED.get()))
                    .withTabsBefore(ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "more_amethyst_blocks_tab"))
                    .title(Component.translatable("creativetab.moreamethyst.moreamethyst_items"))
                    .displayItems((itemDisplayParameters, output) -> {

                        output.accept(ModItems.AMETHYST_SHARD_RED);
                        output.accept(ModItems.AMETHYST_SHARD_ORANGE);
                        output.accept(ModItems.AMETHYST_SHARD_YELLOW);
                        output.accept(ModItems.AMETHYST_SHARD_LIME);
                        output.accept(ModItems.AMETHYST_SHARD_GREEN);
                        output.accept(ModItems.AMETHYST_SHARD_CYAN);
                        output.accept(ModItems.AMETHYST_SHARD_LIGHT_BLUE);
                        output.accept(ModItems.AMETHYST_SHARD_BLUE);
                        output.accept(ModItems.AMETHYST_SHARD_MAGENTA);
                        output.accept(ModItems.AMETHYST_SHARD_PINK);
                        output.accept(ModItems.AMETHYST_SHARD_WHITE);
                        output.accept(ModItems.AMETHYST_SHARD_LIGHT_GRAY);
                        output.accept(ModItems.AMETHYST_SHARD_GRAY);
                        output.accept(ModItems.AMETHYST_SHARD_BLACK);
                        output.accept(ModItems.AMETHYST_SHARD_BROWN);

                    }).build());

    public static final Supplier<CreativeModeTab> MORE_AMETHYST_BLOCKS_TAB = CREATIVE_MODE_TAB.register("more_amethyst_blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.AMETHYST_BLOCK_RED.get()))
                    .title(Component.translatable("creativetab.moreamethyst.moreamethyst_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {

                        // All amethyst blocks
                        output.accept(ModBlocks.AMETHYST_BLOCK_RED);
                        output.accept(ModBlocks.AMETHYST_BLOCK_ORANGE);
                        output.accept(ModBlocks.AMETHYST_BLOCK_YELLOW);
                        output.accept(ModBlocks.AMETHYST_BLOCK_LIME);
                        output.accept(ModBlocks.AMETHYST_BLOCK_GREEN);
                        output.accept(ModBlocks.AMETHYST_BLOCK_CYAN);
                        output.accept(ModBlocks.AMETHYST_BLOCK_LIGHT_BLUE);
                        output.accept(ModBlocks.AMETHYST_BLOCK_BLUE);
                        output.accept(ModBlocks.AMETHYST_BLOCK_MAGENTA);
                        output.accept(ModBlocks.AMETHYST_BLOCK_PINK);
                        output.accept(ModBlocks.AMETHYST_BLOCK_WHITE);
                        output.accept(ModBlocks.AMETHYST_BLOCK_LIGHT_GRAY);
                        output.accept(ModBlocks.AMETHYST_BLOCK_GRAY);
                        output.accept(ModBlocks.AMETHYST_BLOCK_BLACK);
                        output.accept(ModBlocks.AMETHYST_BLOCK_BROWN);

                        // All Budding amethyst blocks
                        output.accept(ModBlocks.BUDDING_AMETHYST_RED);
                        output.accept(ModBlocks.BUDDING_AMETHYST_ORANGE);
                        output.accept(ModBlocks.BUDDING_AMETHYST_YELLOW);
                        output.accept(ModBlocks.BUDDING_AMETHYST_LIME);
                        output.accept(ModBlocks.BUDDING_AMETHYST_GREEN);
                        output.accept(ModBlocks.BUDDING_AMETHYST_CYAN);
                        output.accept(ModBlocks.BUDDING_AMETHYST_LIGHT_BLUE);
                        output.accept(ModBlocks.BUDDING_AMETHYST_BLUE);
                        output.accept(ModBlocks.BUDDING_AMETHYST_MAGENTA);
                        output.accept(ModBlocks.BUDDING_AMETHYST_PINK);
                        output.accept(ModBlocks.BUDDING_AMETHYST_WHITE);
                        output.accept(ModBlocks.BUDDING_AMETHYST_GRAY);
                        output.accept(ModBlocks.BUDDING_AMETHYST_LIGHT_GRAY);
                        output.accept(ModBlocks.BUDDING_AMETHYST_BLACK);
                        output.accept(ModBlocks.BUDDING_AMETHYST_BROWN);

                        // All amethyst clusters
                        output.accept(ModBlocks.AMETHYST_CLUSTER_RED);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_ORANGE);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_YELLOW);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_LIME);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_GREEN);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_CYAN);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_LIGHT_BLUE);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_BLUE);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_MAGENTA);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_PINK);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_WHITE);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_LIGHT_GRAY);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_GRAY);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_BLACK);
                        output.accept(ModBlocks.AMETHYST_CLUSTER_BROWN);

                        // All Amethyst large buds
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_RED);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_ORANGE);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_YELLOW);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_LIME);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_GREEN);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_CYAN);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_LIGHT_BLUE);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_BLUE);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_MAGENTA);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_PINK);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_WHITE);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_LIGHT_GRAY);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_GRAY);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_BLACK);
                        output.accept(ModBlocks.LARGE_AMETHYST_BUD_BROWN);

                        // ALl Amethyst medium buds
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_RED);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_ORANGE);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_YELLOW);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_LIME);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_GREEN);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_CYAN);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_LIGHT_BLUE);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_BLUE);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_MAGENTA);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_PINK);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_WHITE);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_LIGHT_GRAY);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_GRAY);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_BLACK);
                        output.accept(ModBlocks.MEDIUM_AMETHYST_BUD_BROWN);

                        // All small amethyst buds
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_RED);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_ORANGE);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_YELLOW);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_LIME);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_GREEN);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_CYAN);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_LIGHT_BLUE);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_BLUE);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_MAGENTA);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_PINK);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_WHITE);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_LIGHT_GRAY);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_GRAY);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_BLACK);
                        output.accept(ModBlocks.SMALL_AMETHYST_BUD_BROWN);

                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
