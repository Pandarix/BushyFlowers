package net.Pandarix.bushierflowers.world.feature;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModPlacedFeatures {

    public static final RegistryKey<PlacedFeature> GROWN_FLOWER_DEFAULT_PLACED_KEY = registerKey("grown_flower_default_placed");
    public static final RegistryKey<PlacedFeature> GROWN_FLOWER_FLOWER_FOREST_PLACED_KEY = registerKey("grown_flower_flower_forest_placed");
    public static final RegistryKey<PlacedFeature> GROWN_FLOWER_SWAMP_PLACED_KEY = registerKey("grown_flower_swamp_placed");
    public static final RegistryKey<PlacedFeature> GROWN_FLOWER_PLAIN_PLACED_KEY = registerKey("grown_flower_plain_placed");
    public static final RegistryKey<PlacedFeature> GROWN_FLOWER_MEADOW_PLACED_KEY = registerKey("grown_flower_meadow_placed");

    //--------------------------------------------------------------------------------------------------------------------------------------------------

    public static void bootstrap(Registerable<PlacedFeature> context) {
        var configuredFeatureRegistryEntryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, GROWN_FLOWER_DEFAULT_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GROWN_FLOWER_DEFAULT_KEY),RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, GROWN_FLOWER_FLOWER_FOREST_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GROWN_FLOWER_FLOWER_FOREST_KEY),CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, GROWN_FLOWER_SWAMP_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GROWN_FLOWER_SWAMP_KEY),RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, GROWN_FLOWER_PLAIN_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GROWN_FLOWER_PLAIN_KEY),NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4), RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());

        register(context, GROWN_FLOWER_MEADOW_PLACED_KEY, configuredFeatureRegistryEntryLookup.getOrThrow(ModConfiguredFeatures.GROWN_FLOWER_MEADOW_KEY),SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    }


    //--------------------------------------------------------------------------------------------------------------------------------------------------

    public static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, new Identifier(BushierFlowers.MOD_ID, name));
    }

    private static void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(configuration, List.copyOf(modifiers)));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<PlacedFeature> context, RegistryKey<PlacedFeature> key, RegistryEntry<ConfiguredFeature<?, ?>> configuration, PlacementModifier... modifiers) {
        register(context, key, configuration, List.of(modifiers));
    }
}
