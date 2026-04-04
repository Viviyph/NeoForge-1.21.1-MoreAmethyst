package net.viv.moreamethyst.datagen;

import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.MatchTool;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;
import net.neoforged.neoforge.registries.DeferredItem;
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
        add(ModBlocks.BUDDING_AMETHYST_RED.get(), noDrop());
        add(ModBlocks.SMALL_AMETHYST_BUD_RED.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.SMALL_AMETHYST_BUD_RED.get()));
        add(ModBlocks.MEDIUM_AMETHYST_BUD_RED.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.MEDIUM_AMETHYST_BUD_RED.get()));
        add(ModBlocks.LARGE_AMETHYST_BUD_RED.get(),
                block -> createSilkTouchOnlyTable(ModBlocks.LARGE_AMETHYST_BUD_RED.get()));
        add(ModBlocks.AMETHYST_CLUSTER_RED.get(),
                block -> createAmethystClusterDrops(ModBlocks.AMETHYST_CLUSTER_RED.get(), ModItems.AMETHYST_SHARD_RED.get()));

    }

    HolderLookup.RegistryLookup<Enchantment> enchantmentLookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
    Holder<Enchantment> fortuneHolder = enchantmentLookup.getOrThrow(Enchantments.FORTUNE);

    protected LootTable.Builder createAmethystClusterDrops(Block block, Item item) {
        return createSilkTouchDispatchTable(block,
                this.applyExplosionDecay(block,
                                LootItem.lootTableItem(item)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(4.0F)))
                                        .apply(ApplyBonusCount.addOreBonusCount(fortuneHolder))
                                        .when(MatchTool.toolMatches(ItemPredicate.Builder.item().of(ItemTags.CLUSTER_MAX_HARVESTABLES))))
                        .otherwise(this.applyExplosionDecay(block, LootItem.lootTableItem(item)
                                        .apply(SetItemCountFunction.setCount(ConstantValue.exactly(2.0F))))));
    }

        //Giving all blocks from ModBlocks
        @Override
        protected Iterable<Block> getKnownBlocks () {
            return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
        }
    }