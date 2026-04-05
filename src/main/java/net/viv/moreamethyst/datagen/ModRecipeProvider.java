package net.viv.moreamethyst.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredItem;
import net.viv.moreamethyst.block.ModBlocks;
import net.viv.moreamethyst.item.ModItems;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }
    private record AmethystPair(DeferredBlock<Block> block, DeferredItem<Item> shard) {}

    List<String> colour = List.of("red","orange","yellow","lime","green","cyan","light_blue","blue","magenta","pink","white","light_gray","gray","black","brown");

    private static final Map<String, AmethystPair> AMETHYST_VARIANTS = Map.ofEntries(
            Map.entry("red", new AmethystPair(ModBlocks.AMETHYST_BLOCK_RED, ModItems.AMETHYST_SHARD_RED)),
            Map.entry("orange", new AmethystPair(ModBlocks.AMETHYST_BLOCK_ORANGE,ModItems.AMETHYST_SHARD_ORANGE)),
            Map.entry("yellow", new AmethystPair(ModBlocks.AMETHYST_BLOCK_YELLOW, ModItems.AMETHYST_SHARD_YELLOW)),
            Map.entry("lime", new AmethystPair(ModBlocks.AMETHYST_BLOCK_LIME, ModItems.AMETHYST_SHARD_LIME)),
            Map.entry("green", new AmethystPair(ModBlocks.AMETHYST_BLOCK_GREEN, ModItems.AMETHYST_SHARD_GREEN)),
            Map.entry("cyan", new AmethystPair(ModBlocks.AMETHYST_BLOCK_CYAN, ModItems.AMETHYST_SHARD_CYAN)),
            Map.entry("light_blue", new AmethystPair(ModBlocks.AMETHYST_BLOCK_LIGHT_BLUE, ModItems.AMETHYST_SHARD_LIGHT_BLUE)),
            Map.entry("blue", new AmethystPair(ModBlocks.AMETHYST_BLOCK_BLUE, ModItems.AMETHYST_SHARD_BLUE)),
            Map.entry("magenta", new AmethystPair(ModBlocks.AMETHYST_BLOCK_MAGENTA, ModItems.AMETHYST_SHARD_MAGENTA)),
            Map.entry("pink", new AmethystPair(ModBlocks.AMETHYST_BLOCK_PINK, ModItems.AMETHYST_SHARD_PINK)),
            Map.entry("white", new AmethystPair(ModBlocks.AMETHYST_BLOCK_WHITE, ModItems.AMETHYST_SHARD_WHITE)),
            Map.entry("light_gray", new AmethystPair(ModBlocks.AMETHYST_BLOCK_LIGHT_GRAY, ModItems.AMETHYST_SHARD_LIGHT_GRAY)),
            Map.entry("gray", new AmethystPair(ModBlocks.AMETHYST_BLOCK_GRAY, ModItems.AMETHYST_SHARD_GRAY)),
            Map.entry("black", new AmethystPair(ModBlocks.AMETHYST_BLOCK_BLACK, ModItems.AMETHYST_SHARD_BLACK)),
            Map.entry("brown", new AmethystPair(ModBlocks.AMETHYST_BLOCK_BROWN, ModItems.AMETHYST_SHARD_BROWN))
    );

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        AMETHYST_VARIANTS.forEach((colour, pair) -> {
            ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, pair.block.get())
                    .pattern("BB")
                    .pattern("BB")
                    .define('B', pair.shard().get())
                    .unlockedBy("has_amethyst_shard_" + colour, has(pair.shard().get()))
                    .save(recipeOutput, "moreamethyst:" + "amethyst_block" + colour);
        });

        AMETHYST_VARIANTS.forEach((String colour, AmethystPair pair) -> {
            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, pair.shard().get())
                    .requires(pair.block)
                    .unlockedBy("has_amethyst_block_" + colour, has(pair.block.get()))
                    .save(recipeOutput, "moreamethyst:" + "amethyst_shard" + colour);
        });
    }
}
