package net.viv.moreamethyst.worldgen;

import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstrapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BiomeTags;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;
import net.neoforged.neoforge.common.world.BiomeModifier;
import net.neoforged.neoforge.common.world.BiomeModifiers;
import net.neoforged.neoforge.registries.NeoForgeRegistries;
import net.viv.moreamethyst.MoreAmethyst;
import net.viv.moreamethyst.worldgen.geode.GeodeDataList;

public class ModBiomeModifiers {

    public static void bootstrap(BootstrapContext<BiomeModifier> context) {
        var placedFeatures = context.lookup(Registries.PLACED_FEATURE);
        var biomes = context.lookup(Registries.BIOME);

        for(GeodeDataList.GeodeData geodeData : GeodeDataList.GEODE_DATA_LIST) {
            ResourceKey<BiomeModifier> modifierKey = ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS,
                    ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "geode_modifier_" + geodeData.name()));

            ResourceKey<PlacedFeature> placedKey = ResourceKey.create(Registries.PLACED_FEATURE,
                    ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, "geode_placed_" + geodeData.name()));

            context.register(modifierKey, new BiomeModifiers.AddFeaturesBiomeModifier(
                    biomes.getOrThrow(geodeData.targetBiomes()),
                    HolderSet.direct(placedFeatures.getOrThrow(placedKey)),
                    GenerationStep.Decoration.LOCAL_MODIFICATIONS
            ));
        }
    }

    private static ResourceKey<BiomeModifier> registerKey(String name) {
        return ResourceKey.create(NeoForgeRegistries.Keys.BIOME_MODIFIERS, ResourceLocation.fromNamespaceAndPath(MoreAmethyst.MOD_ID, name));
    }

}
