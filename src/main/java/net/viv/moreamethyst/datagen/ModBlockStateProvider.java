package net.viv.moreamethyst.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.block.ModBlocks;

import static com.ibm.icu.lang.UCharacter.GraphemeClusterBreak.T;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MoreAmethyst.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.AMETHYST_BLOCK_RED);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_ORANGE);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_YELLOW);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_LIME);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_GREEN);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_CYAN);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_LIGHT_BLUE);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_BLUE);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_MAGENTA);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_PINK);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_WHITE);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_LIGHT_GRAY);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_GRAY);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_BLACK);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_BROWN);

        blockWithItem(ModBlocks.BUDDING_AMETHYST_RED);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_ORANGE);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_YELLOW);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_LIME);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_GREEN);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_CYAN);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_LIGHT_BLUE);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_BLUE);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_MAGENTA);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_PINK);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_WHITE);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_LIGHT_GRAY);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_GRAY);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_BLACK);
        blockWithItem(ModBlocks.BUDDING_AMETHYST_BROWN);

        amethystCluster(ModBlocks.AMETHYST_CLUSTER_RED, "amethyst_cluster_red");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_ORANGE, "amethyst_cluster_orange");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_YELLOW, "amethyst_cluster_yellow");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_LIME, "amethyst_cluster_lime");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_GREEN, "amethyst_cluster_green");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_CYAN, "amethyst_cluster_cyan");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_LIGHT_BLUE, "amethyst_cluster_light_blue");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_BLUE, "amethyst_cluster_blue");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_MAGENTA, "amethyst_cluster_magenta");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_PINK, "amethyst_cluster_pink");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_WHITE, "amethyst_cluster_white");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_LIGHT_GRAY, "amethyst_cluster_light_gray");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_GRAY, "amethyst_cluster_gray");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_BLACK, "amethyst_cluster_black");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_BROWN, "amethyst_cluster_brown");

        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_RED, "large_amethyst_bud_red");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_ORANGE, "large_amethyst_bud_orange");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_YELLOW, "large_amethyst_bud_yellow");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_LIME, "large_amethyst_bud_lime");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_GREEN, "large_amethyst_bud_green");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_CYAN, "large_amethyst_bud_cyan");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_LIGHT_BLUE, "large_amethyst_bud_light_blue");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_BLUE, "large_amethyst_bud_blue");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_MAGENTA, "large_amethyst_bud_magenta");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_PINK, "large_amethyst_bud_pink");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_WHITE, "large_amethyst_bud_white");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_LIGHT_GRAY, "large_amethyst_bud_light_gray");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_GRAY, "large_amethyst_bud_gray");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_BLACK, "large_amethyst_bud_black");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_BROWN, "large_amethyst_bud_brown");

        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_RED, "medium_amethyst_bud_red");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_ORANGE, "medium_amethyst_bud_orange");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_YELLOW, "medium_amethyst_bud_yellow");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_LIME, "medium_amethyst_bud_lime");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_GREEN, "medium_amethyst_bud_green");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_CYAN, "medium_amethyst_bud_cyan");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_LIGHT_BLUE, "medium_amethyst_bud_light_blue");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_BLUE, "medium_amethyst_bud_blue");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_MAGENTA, "medium_amethyst_bud_magenta");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_PINK, "medium_amethyst_bud_pink");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_WHITE, "medium_amethyst_bud_white");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_LIGHT_GRAY, "medium_amethyst_bud_light_gray");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_GRAY, "medium_amethyst_bud_gray");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_BLACK, "medium_amethyst_bud_black");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_BROWN, "medium_amethyst_bud_brown");

        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_RED, "small_amethyst_bud_red");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_ORANGE, "small_amethyst_bud_orange");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_YELLOW, "small_amethyst_bud_yellow");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_LIME, "small_amethyst_bud_lime");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_GREEN, "small_amethyst_bud_green");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_CYAN, "small_amethyst_bud_cyan");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_LIGHT_BLUE, "small_amethyst_bud_light_blue");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_BLUE, "small_amethyst_bud_blue");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_MAGENTA, "small_amethyst_bud_magenta");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_PINK, "small_amethyst_bud_pink");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_WHITE, "small_amethyst_bud_white");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_LIGHT_GRAY, "small_amethyst_bud_light_gray");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_GRAY, "small_amethyst_bud_gray");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_BLACK, "small_amethyst_bud_black");
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_BROWN, "small_amethyst_bud_brown");

            }

    private void amethystCluster(DeferredBlock<?> block, String name) {
        ModelFile blockModel = models().cross(name, modLoc("block/" + name))
                .renderType("cutout");
        directionalBlock(block.get(), blockModel);
        itemModels().withExistingParent(name, mcLoc("item/generated"))
                .texture("layer0", modLoc("block/" + name));
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
