package net.Pandarix.bushierflowers.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationConfiguredFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.*;

public class ModPlacedFeatures {

    public static final RegistryEntry<PlacedFeature> GROWN_FLOWER_DEFAULT;
    public static final RegistryEntry<PlacedFeature> GROWN_FLOWER_FLOWER_FOREST;
    public static final RegistryEntry<PlacedFeature> GROWN_FLOWER_SWAMP;
    public static final RegistryEntry<PlacedFeature> GROWN_FLOWER_PLAIN;
    public static final RegistryEntry<PlacedFeature> GROWN_FLOWER_MEADOW;

    static {
        GROWN_FLOWER_DEFAULT = PlacedFeatures.register("grown_flower_default", ModConfiguredFeatures.GROWN_FLOWER_DEFAULT, new PlacementModifier[]{RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});
        GROWN_FLOWER_FLOWER_FOREST = PlacedFeatures.register("grown_flower_flower_forest", ModConfiguredFeatures.GROWN_FLOWER_FLOWER_FOREST, new PlacementModifier[]{CountPlacementModifier.of(3), RarityFilterPlacementModifier.of(16), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});
        GROWN_FLOWER_SWAMP = PlacedFeatures.register("grown_flower_swamp", ModConfiguredFeatures.GROWN_FLOWER_SWAMP, new PlacementModifier[]{RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});
        GROWN_FLOWER_PLAIN = PlacedFeatures.register("grown_flower_plains", ModConfiguredFeatures.GROWN_FLOWER_PLAIN, new PlacementModifier[]{NoiseThresholdCountPlacementModifier.of(-0.8, 15, 4), RarityFilterPlacementModifier.of(128), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});
        GROWN_FLOWER_MEADOW = PlacedFeatures.register("grown_flower_meadow", ModConfiguredFeatures.GROWN_FLOWER_MEADOW, new PlacementModifier[]{SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of()});
    }
}
