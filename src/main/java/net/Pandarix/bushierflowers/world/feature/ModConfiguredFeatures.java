package net.Pandarix.bushierflowers.world.feature;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;

public class ModConfiguredFeatures {

    //DANDELION
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_DANDELION_FLOWER = ConfiguredFeatures.register("grown_dandelion_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_DANDELION)))));
    //POPPY
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_POPPY_FLOWER = ConfiguredFeatures.register("grown_poppy_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_POPPY)))));
    //BLUE ORCHID
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_BLUE_ORCHID_FLOWER = ConfiguredFeatures.register("grown_blue_orchid_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_BLUE_ORCHID)))));
    //ALLIUM
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_ALLIUM_FLOWER = ConfiguredFeatures.register("grown_allium_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_ALLIUM)))));
    //AZURE BLUET
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_AZURE_BLUET_FLOWER = ConfiguredFeatures.register("grown_azure_bluet_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_AZURE_BLUET)))));
    //TULIPS--------------------------------------------------------------------------------------------------------------------------------------------
    //RED TULIP
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_RED_TULIP_FLOWER = ConfiguredFeatures.register("grown_red_tulip_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_RED_TULIP)))));
    //ORANGE TULIP
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_ORANGE_TULIP_FLOWER = ConfiguredFeatures.register("grown_orange_tulip_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_ORANGE_TULIP)))));
    //WHITE TULIP
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_WHITE_TULIP_FLOWER = ConfiguredFeatures.register("grown_white_tulip_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_WHITE_TULIP)))));
    //PINK TULIP
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_PINK_TULIP_FLOWER = ConfiguredFeatures.register("grown_pink_tulip_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(1, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_PINK_TULIP)))));
    //--------------------------------------------------------------------------------------------------------------------------------------------------
    //OXEYE DAISY
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_OXEYE_DAISY_FLOWER = ConfiguredFeatures.register("grown_oxeye_daisy_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_OXEYE_DAISY)))));
    //CORNFLOWER
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_CORNFLOWER_FLOWER = ConfiguredFeatures.register("grown_cornflower_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_CORNFLOWER)))));
    //LILY
    public static final RegistryEntry<ConfiguredFeature<RandomPatchFeatureConfig, ?>> GROWN_LILY_FLOWER = ConfiguredFeatures.register("grown_lily_flower", Feature.FLOWER, ConfiguredFeatures.createRandomPatchFeatureConfig(2, PlacedFeatures.createEntry(Feature.SIMPLE_BLOCK, new SimpleBlockFeatureConfig(BlockStateProvider.of(ModBlocks.GROWN_LILY)))));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + BushierFlowers.MOD_ID);
    }

}
