package net.viv.moreamethyst.worldgen.geode;

import net.minecraft.tags.BiomeTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.fml.common.Mod;
import net.viv.moreamethyst.block.ModBlocks;

import java.util.List;

public class GeodeDataList {

    public record GeodeData(String name, Block inner, Block filler, Block cluster, Block large, Block medium, Block small, Block middle, Block outer, TagKey<Biome> targetBiomes) {}

    public static final List<GeodeData> GEODE_DATA_LIST = List.of(
            new GeodeData ("red",
                    ModBlocks.AMETHYST_BLOCK_RED.get(),
                    ModBlocks.BUDDING_AMETHYST_RED.get(),
                    ModBlocks.AMETHYST_CLUSTER_RED.get(),
                    ModBlocks.LARGE_AMETHYST_BUD_RED.get(),
                    ModBlocks.MEDIUM_AMETHYST_BUD_RED.get(),
                    ModBlocks.SMALL_AMETHYST_BUD_RED.get(),
                    Blocks.CALCITE,
                    Blocks.SMOOTH_BASALT,
                    BiomeTags.IS_OVERWORLD)
    );

}
