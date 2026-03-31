package net.viv.moreamethyst.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.viv.moreamethyst.block.ModBlocks;
import net.viv.moreamethyst.item.ModItems;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries);
    }

    @Override
    protected void buildRecipes(RecipeOutput recipeOutput) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.AMETHYST_BLOCK_RED.get())
                .pattern("BB")
                .pattern("BB")
                .define('B', ModItems.AMETHYST_SHARD_RED)
                .unlockedBy("has_amethyst_shard_red", has(ModItems.AMETHYST_SHARD_RED)).save(recipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.AMETHYST_SHARD_RED.get(), 4)
                .requires(ModBlocks.AMETHYST_BLOCK_RED)
                .unlockedBy("has_amethyst_block_red", has(ModBlocks.AMETHYST_BLOCK_RED)).save(recipeOutput);

    }
}
