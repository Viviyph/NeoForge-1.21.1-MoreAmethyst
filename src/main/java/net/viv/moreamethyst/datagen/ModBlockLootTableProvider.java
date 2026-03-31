package net.viv.moreamethyst.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.viv.moreamethyst.block.ModBlocks;
import net.viv.moreamethyst.item.ModItems;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.AMETHYST_BLOCK_RED.get());

        add(ModBlocks.SMALL_AMETHYST_BUD_RED.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.SMALL_AMETHYST_BUD_RED.get()));
        add(ModBlocks.MEDIUM_AMETHYST_BUD_RED.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.MEDIUM_AMETHYST_BUD_RED.get()));
        add(ModBlocks.LARGE_AMETHYST_BUD_RED.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.LARGE_AMETHYST_BUD_RED.get()));
       // add(ModBlocks.AMETHYST_CLUSTER_RED.get(),
            //    block -> create // drop 2 when mined with hand, 4 with pick, and apply fortune bonus ;-;


    }

    //Giving all blocks from ModBlocks
    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}