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
                .add(ModBlocks.BUDDING_AMETHYST_RED.get())
                .add(ModBlocks.SMALL_AMETHYST_BUD_RED.get())
                .add(ModBlocks.MEDIUM_AMETHYST_BUD_RED.get())
                .add(ModBlocks.LARGE_AMETHYST_BUD_RED.get())
                .add(ModBlocks.AMETHYST_CLUSTER_RED.get());
    }
}
