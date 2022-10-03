package net.Pandarix.bushierflowers.world.gen;

import net.Pandarix.bushierflowers.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGen {
    public static void generateFlowers(){
        //DANDELION
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.SWAMP, BiomeKeys.BADLANDS, BiomeKeys.MUSHROOM_FIELDS, BiomeKeys.NETHER_WASTES, BiomeKeys.THE_END), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_DANDELION_PLACED.getKey().get());
        //POPPY
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.SWAMP, BiomeKeys.BADLANDS, BiomeKeys.MUSHROOM_FIELDS, BiomeKeys.NETHER_WASTES, BiomeKeys.THE_END), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_POPPY_PLACED.getKey().get());
        //BLUE ORCHID
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_BLUE_ORCHID_PLACED.getKey().get());
        //ALLIUM
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST, BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_ALLIUM_PLACED.getKey().get());
        //AZURE BLUET
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST, BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_AZURE_BLUET_PLACED.getKey().get());
        //TULIPS--------------------------------------------------------------------------------------------------------------------------------------------
        //RED TULIP
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_RED_TULIP_PLACED.getKey().get());
        //ORANGE TULIP
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_ORANGE_TULIP_PLACED.getKey().get());
        //WHITE TULIP
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_WHITE_TULIP_PLACED.getKey().get());
        //PINK TULIP
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_PINK_TULIP_PLACED.getKey().get());
        //--------------------------------------------------------------------------------------------------------------------------------------------------
        //OXEYE DAISY
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST, BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_OXEYE_DAISY_PLACED.getKey().get());
        //CORNFLOWER
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS, BiomeKeys.FLOWER_FOREST, BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_CORNFLOWER_PLACED.getKey().get());
        //LILY
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FOREST, BiomeKeys.BIRCH_FOREST, BiomeKeys.DARK_FOREST, BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_LILY_PLACED.getKey().get());
    }
}
