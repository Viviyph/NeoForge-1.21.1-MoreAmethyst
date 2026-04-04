package net.viv.moreamethyst.worldgen;

import net.minecraft.core.Holder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.placement.*;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.worldgen.geode.GeodeDataList;

import java.util.List;

public class ModPlacedFeatures {

    public static void bootstrap(BootstrapContext<PlacedFeature> context) {
        var configuredFeatures = context.lookup(Registries.CONFIGURED_FEATURE);

        for(GeodeDataList.GeodeData geodeData : GeodeDataList.GEODE_DATA_LIST) {
            ResourceKey<PlacedFeature> placedKey = ResourceKey.create(Registries.PLACED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "geode_placed_" + geodeData.name()));

            ResourceKey<ConfiguredFeature<?, ?>> configKey = ResourceKey.create(Registries.CONFIGURED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "geode_" + geodeData.name()));


            context.register(placedKey, new PlacedFeature(configuredFeatures.getOrThrow(configKey), List.of(
                    RarityFilter.onAverageOnceEvery(24),
                    InSquarePlacement.spread(),
                    HeightRangePlacement.uniform(VerticalAnchor.absolute(6), VerticalAnchor.absolute(30)),
                    BiomeFilter.biome()
            )));

        }
    }

    private static ResourceKey<PlacedFeature> RegisterKey(String name) {
        return ResourceKey.create(Registries.PLACED_FEATURE, ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, name));
    }
    private static void register(BootstrapContext<PlacedFeature> context, ResourceKey<PlacedFeature> key, Holder<ConfiguredFeature<?, ?>> configuration,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));

    }
}
