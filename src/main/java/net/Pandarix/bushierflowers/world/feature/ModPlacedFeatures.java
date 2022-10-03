package net.Pandarix.bushierflowers.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.RarityFilterPlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

public class ModPlacedFeatures {
    //DANDELION
    public static final RegistryEntry<PlacedFeature> GROWN_DANDELION_PLACED = PlacedFeatures.register("grown_dandelion_placed", ModConfiguredFeatures.GROWN_DANDELION_FLOWER, RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
    //POPPY
    public static final RegistryEntry<PlacedFeature> GROWN_POPPY_PLACED = PlacedFeatures.register("grown_poppy_placed", ModConfiguredFeatures.GROWN_POPPY_FLOWER, RarityFilterPlacementModifier.of(1), SquarePlacementModifier.of(), PlacedFeatures.MOTION_BLOCKING_HEIGHTMAP, BiomePlacementModifier.of());
}
