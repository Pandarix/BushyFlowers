package net.Pandarix.bushierflowers.world.feature;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BushierFlowers.MOD_ID);
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------

    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_FLOWER_DEFAULT;
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_FLOWER_FLOWER_FOREST;
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_FLOWER_SWAMP;
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_FLOWER_PLAIN;
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_FLOWER_MEADOW;

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }

    static {
        GROWN_FLOWER_DEFAULT = ConfiguredFeatures.register("grown_flower_default", Feature.FLOWER, createRandomPatchFeatureConfig(new WeightedBlockStateProvider(DataPool.<BlockState>builder().add(ModBlocks.GROWN_POPPY.getDefaultState(), 2).add(ModBlocks.GROWN_DANDELION.getDefaultState(), 1)), 64));

        GROWN_FLOWER_FLOWER_FOREST = ConfiguredFeatures.register("grown_flower_flower_forest", Feature.FLOWER, new RandomPatchFeatureConfig(128, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new NoiseBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0, new double[0]), 0.020833334F, List.of(ModBlocks.GROWN_DANDELION.getDefaultState(), ModBlocks.GROWN_POPPY.getDefaultState(), ModBlocks.GROWN_ALLIUM.getDefaultState(), ModBlocks.GROWN_AZURE_BLUET.getDefaultState(), ModBlocks.GROWN_RED_TULIP.getDefaultState(), ModBlocks.GROWN_ORANGE_TULIP.getDefaultState(), ModBlocks.GROWN_WHITE_TULIP.getDefaultState(), ModBlocks.GROWN_PINK_TULIP.getDefaultState(), ModBlocks.GROWN_OXEYE_DAISY.getDefaultState(), ModBlocks.GROWN_CORNFLOWER.getDefaultState(), ModBlocks.GROWN_LILY.getDefaultState()))))));

        GROWN_FLOWER_SWAMP = ConfiguredFeatures.register("grown_flower_swamp", Feature.FLOWER, new RandomPatchFeatureConfig(96, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_BLUE_ORCHID)))));

        GROWN_FLOWER_PLAIN = ConfiguredFeatures.register("grown_flower_plain", Feature.FLOWER, new RandomPatchFeatureConfig(96, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0, new double[0]), 0.005F, -0.8F, 0.33333334F, ModBlocks.GROWN_DANDELION.getDefaultState(), List.of(ModBlocks.GROWN_ORANGE_TULIP.getDefaultState(), ModBlocks.GROWN_RED_TULIP.getDefaultState(), ModBlocks.GROWN_PINK_TULIP.getDefaultState(), ModBlocks.GROWN_WHITE_TULIP.getDefaultState()), List.of(ModBlocks.GROWN_POPPY.getDefaultState(), ModBlocks.GROWN_AZURE_BLUET.getDefaultState(), ModBlocks.GROWN_OXEYE_DAISY.getDefaultState(), ModBlocks.GROWN_CORNFLOWER.getDefaultState()))))));

        GROWN_FLOWER_MEADOW = ConfiguredFeatures.register("grown_flower_meadow", Feature.FLOWER, new RandomPatchFeatureConfig(96, 4, 2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range(1, 3), new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0, new double[0]), 1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0, new double[0]), 1.0F, List.of(Blocks.TALL_GRASS.getDefaultState(), ModBlocks.GROWN_ALLIUM.getDefaultState(), ModBlocks.GROWN_POPPY.getDefaultState(), ModBlocks.GROWN_AZURE_BLUET.getDefaultState(), ModBlocks.GROWN_DANDELION.getDefaultState(), ModBlocks.GROWN_CORNFLOWER.getDefaultState(), ModBlocks.GROWN_OXEYE_DAISY.getDefaultState(), Blocks.GRASS.getDefaultState()))))));
    }
}
