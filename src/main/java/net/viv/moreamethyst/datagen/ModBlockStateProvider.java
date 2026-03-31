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
        blockWithItem(ModBlocks.BUDDING_AMETHYST_RED);
        amethystCluster(ModBlocks.SMALL_AMETHYST_BUD_RED, "small_amethyst_bud_red");
        amethystCluster(ModBlocks.MEDIUM_AMETHYST_BUD_RED, "medium_amethyst_bud_red");
        amethystCluster(ModBlocks.LARGE_AMETHYST_BUD_RED, "large_amethyst_bud_red");
        amethystCluster(ModBlocks.AMETHYST_CLUSTER_RED, "amethyst_cluster_red");

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
