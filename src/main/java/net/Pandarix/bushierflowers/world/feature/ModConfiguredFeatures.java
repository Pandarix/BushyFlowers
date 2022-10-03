package net.Pandarix.bushierflowers.world.feature;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    //DANDELION
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_DANDELION_FLOWER = ConfiguredFeatures.register("grown_dandelion_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_DANDELION)))));
    //POPPY
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_POPPY_FLOWER = ConfiguredFeatures.register("grown_poppy_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(64, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_POPPY)))));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BushierFlowers.MOD_ID);
    }

}
