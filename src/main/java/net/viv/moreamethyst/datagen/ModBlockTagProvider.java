package net.viv.moreamethyst.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.Block;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MoreAmethyst.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.AMETHYST_BLOCK_RED.get())
                .add(ModBlocks.AMETHYST_BLOCK_ORANGE.get())
                .add(ModBlocks.AMETHYST_BLOCK_YELLOW.get())
                .add(ModBlocks.AMETHYST_BLOCK_LIME.get())
                .add(ModBlocks.AMETHYST_BLOCK_GREEN.get())
                .add(ModBlocks.AMETHYST_BLOCK_CYAN.get())
                .add(ModBlocks.AMETHYST_BLOCK_LIGHT_BLUE.get())
                .add(ModBlocks.AMETHYST_BLOCK_BLUE.get())
                .add(ModBlocks.AMETHYST_BLOCK_MAGENTA.get())
                .add(ModBlocks.AMETHYST_BLOCK_PINK.get())
                .add(ModBlocks.AMETHYST_BLOCK_WHITE.get())
                .add(ModBlocks.AMETHYST_BLOCK_LIGHT_GRAY.get())
                .add(ModBlocks.AMETHYST_BLOCK_GRAY.get())
                .add(ModBlocks.AMETHYST_BLOCK_BLACK.get())
                .add(ModBlocks.AMETHYST_BLOCK_BROWN.get())

                .add(ModBlocks.BUDDING_AMETHYST_RED.get())
                .add(ModBlocks.BUDDING_AMETHYST_ORANGE.get())
                .add(ModBlocks.BUDDING_AMETHYST_YELLOW.get())
                .add(ModBlocks.BUDDING_AMETHYST_LIME.get())
                .add(ModBlocks.BUDDING_AMETHYST_GREEN.get())
                .add(ModBlocks.BUDDING_AMETHYST_CYAN.get())
                .add(ModBlocks.BUDDING_AMETHYST_LIGHT_BLUE.get())
                .add(ModBlocks.BUDDING_AMETHYST_BLUE.get())
                .add(ModBlocks.BUDDING_AMETHYST_MAGENTA.get())
                .add(ModBlocks.BUDDING_AMETHYST_PINK.get())
                .add(ModBlocks.BUDDING_AMETHYST_WHITE.get())
                .add(ModBlocks.BUDDING_AMETHYST_LIGHT_GRAY.get())
                .add(ModBlocks.BUDDING_AMETHYST_GRAY.get())
                .add(ModBlocks.BUDDING_AMETHYST_BLACK.get())
                .add(ModBlocks.BUDDING_AMETHYST_BROWN.get())

                .add(ModBlocks.SMALL_AMETHYST_BUD_RED.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_ORANGE.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_YELLOW.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_LIME.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_GREEN.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_CYAN.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_LIGHT_BLUE.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_BLUE.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_MAGENTA.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_PINK.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_WHITE.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_LIGHT_GRAY.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_GRAY.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_BLACK.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_BROWN.get())

                .add(ModBlocks.MEDIUM_AMETHYST_BUD_RED.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_ORANGE.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_YELLOW.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_LIME.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_GREEN.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_CYAN.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_LIGHT_BLUE.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_BLUE.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_MAGENTA.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_PINK.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_WHITE.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_LIGHT_GRAY.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_GRAY.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_BLACK.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_BROWN.get())

                .add(ModBlocks.LARGE_AMETHYST_BUD_RED.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_ORANGE.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_YELLOW.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_LIME.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_GREEN.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_CYAN.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_LIGHT_BLUE.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_BLUE.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_MAGENTA.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_PINK.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_WHITE.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_LIGHT_GRAY.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_GRAY.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_BLACK.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_BROWN.get())

                .add(ModBlocks.AMETHYST_CLUSTER_RED.get())
                .add(ModBlocks.AMETHYST_CLUSTER_ORANGE.get())
                .add(ModBlocks.AMETHYST_CLUSTER_YELLOW.get())
                .add(ModBlocks.AMETHYST_CLUSTER_LIME.get())
                .add(ModBlocks.AMETHYST_CLUSTER_GREEN.get())
                .add(ModBlocks.AMETHYST_CLUSTER_CYAN.get())
                .add(ModBlocks.AMETHYST_CLUSTER_LIGHT_BLUE.get())
                .add(ModBlocks.AMETHYST_CLUSTER_BLUE.get())
                .add(ModBlocks.AMETHYST_CLUSTER_MAGENTA.get())
                .add(ModBlocks.AMETHYST_CLUSTER_PINK.get())
                .add(ModBlocks.AMETHYST_CLUSTER_WHITE.get())
                .add(ModBlocks.AMETHYST_CLUSTER_LIGHT_GRAY.get())
                .add(ModBlocks.AMETHYST_CLUSTER_GRAY.get())
                .add(ModBlocks.AMETHYST_CLUSTER_BLACK.get())
                .add(ModBlocks.AMETHYST_CLUSTER_BROWN.get());
    }
}
