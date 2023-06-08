package net.Pandarix.bushierflowers.world.feature;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.util.collection.DataPool;
import net.minecraft.util.dynamic.Range;
import net.minecraft.util.math.noise.DoublePerlinNoiseSampler;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.*;

import java.util.List;

public class ModConfiguredFeatures {
    public static final RegistryKey<ConfiguredFeature<?, ?>> GROWN_FLOWER_DEFAULT_KEY = registerKey("grown_flower_default");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GROWN_FLOWER_FLOWER_FOREST_KEY = registerKey("grown_flower_flower_forest");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GROWN_FLOWER_SWAMP_KEY = registerKey("grown_flower_swamp");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GROWN_FLOWER_PLAIN_KEY = registerKey("grown_flower_plain");
    public static final RegistryKey<ConfiguredFeature<?, ?>> GROWN_FLOWER_MEADOW_KEY = registerKey("grown_flower_meadow");

    //--------------------------------------------------------------------------------------------------------------------------------------------------

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        register(context, GROWN_FLOWER_DEFAULT_KEY, Feature.FLOWER, createRandomPatchFeatureConfig(
                new WeightedBlockStateProvider(DataPool.<BlockState>builder()
                        .add(ModBlocks.GROWN_POPPY.getDefaultState(), 2)
                        .add(ModBlocks.GROWN_DANDELION.getDefaultState(), 1)), 64));

        register(context, GROWN_FLOWER_FLOWER_FOREST_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                128, 4, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(
                        new NoiseBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0, 0), 0.020833334F,
                                List.of(ModBlocks.GROWN_DANDELION.getDefaultState(), ModBlocks.GROWN_POPPY.getDefaultState(), ModBlocks.GROWN_ALLIUM.getDefaultState(), ModBlocks.GROWN_AZURE_BLUET.getDefaultState(), ModBlocks.GROWN_RED_TULIP.getDefaultState(), ModBlocks.GROWN_ORANGE_TULIP.getDefaultState(), ModBlocks.GROWN_WHITE_TULIP.getDefaultState(), ModBlocks.GROWN_PINK_TULIP.getDefaultState(), ModBlocks.GROWN_OXEYE_DAISY.getDefaultState(), ModBlocks.GROWN_CORNFLOWER.getDefaultState(), ModBlocks.GROWN_LILY.getDefaultState()))))));

        register(context, GROWN_FLOWER_SWAMP_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                96, 4, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK,
                        new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_BLUE_ORCHID)))));

        register(context, GROWN_FLOWER_PLAIN_KEY, Feature.FLOWER, new RandomPatchFeatureConfig(
                96, 4, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new NoiseThresholdBlockStateProvider(2345L, new DoublePerlinNoiseSampler.NoiseParameters(0, 1.0, 0), 0.005F, -0.8F, 0.33333334F,
                        ModBlocks.GROWN_DANDELION.getDefaultState(),
                        List.of(ModBlocks.GROWN_ORANGE_TULIP.getDefaultState(), ModBlocks.GROWN_RED_TULIP.getDefaultState(), ModBlocks.GROWN_PINK_TULIP.getDefaultState(), ModBlocks.GROWN_WHITE_TULIP.getDefaultState()),
                        List.of(ModBlocks.GROWN_POPPY.getDefaultState(), ModBlocks.GROWN_AZURE_BLUET.getDefaultState(), ModBlocks.GROWN_OXEYE_DAISY.getDefaultState(), ModBlocks.GROWN_CORNFLOWER.getDefaultState()))))));

        register(context, GROWN_FLOWER_MEADOW_KEY, Feature.FLOWER,  new RandomPatchFeatureConfig(
                96, 4, 2,
                PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(new DualNoiseBlockStateProvider(new Range<>(1, 3), new DoublePerlinNoiseSampler.NoiseParameters(-10, 1.0, 0), 1.0F, 2345L, new DoublePerlinNoiseSampler.NoiseParameters(-3, 1.0, 0), 1.0F,
                        List.of(Blocks.TALL_GRASS.getDefaultState(), ModBlocks.GROWN_ALLIUM.getDefaultState(), ModBlocks.GROWN_POPPY.getDefaultState(), ModBlocks.GROWN_AZURE_BLUET.getDefaultState(), ModBlocks.GROWN_DANDELION.getDefaultState(), ModBlocks.GROWN_CORNFLOWER.getDefaultState(), ModBlocks.GROWN_OXEYE_DAISY.getDefaultState(), Blocks.GRASS.getDefaultState()))))));
    }

    //--------------------------------------------------------------------------------------------------------------------------------------------------

    public static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, new Identifier(BushierFlowers.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context, RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

    private static RandomPatchFeatureConfig createRandomPatchFeatureConfig(BlockStateProvider block, int tries) {
        return ConfiguredFeatures.createRandomPatchFeatureConfig(tries, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(block)));
    }
}
