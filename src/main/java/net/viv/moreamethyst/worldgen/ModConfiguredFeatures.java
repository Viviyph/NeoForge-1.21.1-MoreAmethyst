package net.viv.moreamethyst.worldgen;

import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.GeodeBlockSettings;
import net.minecraft.world.level.levelgen.GeodeCrackSettings;
import net.minecraft.world.level.levelgen.GeodeLayerSettings;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.GeodeConfiguration;
import net.minecraft.world.level.levelgen.feature.stateproviders.BlockStateProvider;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.worldgen.geode.GeodeDataList;

import java.util.List;

public class ModConfiguredFeatures {

    public static void bootstrap(BootstrapContext<ConfiguredFeature<?, ?>> context) {
        // Loop to create resource keys for geodes so the helper method is only called once? (I don't actually know)
        for (GeodeDataList.GeodeData geodeData : GeodeDataList.GEODE_DATA_LIST) {
            ResourceKey<ConfiguredFeature<?, ?>> key = ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "geode_" + geodeData.name()));

            // Uses the geodeData inside the helper method.
            // This can be used to modify the middle and outer blocks, make sure to change/create the helper method to recognise these ", geodeData.middle(), geodeData.outer()"
            registerGeode(context, key, geodeData.inner(), geodeData.filler(), geodeData.cluster(), geodeData.large(), geodeData.medium(), geodeData.small(), geodeData.middle(), geodeData.outer());
        }
    }

//  I've taken the middleLayer and outer variables out because I don't want to change them right now, though I might in the future, so I may just create a second helper method.
    private static void registerGeode(BootstrapContext<ConfiguredFeature<?, ?>> context, ResourceKey<ConfiguredFeature<?, ?>> key,
                                      Block inner, Block filler, Block cluster, Block large, Block medium, Block small, Block middle, Block outer) {
                                                // Block middleLayer, Block outer
        context.register(key, new ConfiguredFeature<>(Feature.GEODE,
                new GeodeConfiguration(
                        new GeodeBlockSettings(
                            BlockStateProvider.simple(Blocks.AIR),
                            BlockStateProvider.simple(inner),
                            BlockStateProvider.simple(filler),
                            BlockStateProvider.simple(middle),
                            BlockStateProvider.simple(outer),
                            List.of(cluster.defaultBlockState(), large.defaultBlockState(), medium.defaultBlockState(), small.defaultBlockState()),
                            BlockTags.FEATURES_CANNOT_REPLACE, BlockTags.GEODE_INVALID_BLOCKS),
                        new GeodeLayerSettings(1.7D, 2.2D, 3.2, 4.2D),
                        new GeodeCrackSettings(0.95D, 2.0D, 2),
                        0.35D, 0.083D, true,
                        UniformInt.of(1, 8), UniformInt.of(1, 8), UniformInt.of(1, 8),
                        -16 , 16, 0.05D, 1)));
    }


    public static ResourceKey<ConfiguredFeature<?, ?>> RegisterKey(String name) {
        return ResourceKey.create(Registries.CONFIGURED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, name));
    }
    private static <FC extends FeatureConfiguration, F extends Feature<FC>> void register(BootstrapContext<ConfiguredFeature<?, ?>> context,
                                                                                      ResourceKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
        }
}
