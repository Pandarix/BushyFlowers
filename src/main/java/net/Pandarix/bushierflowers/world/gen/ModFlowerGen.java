package net.Pandarix.bushierflowers.world.gen;

import net.Pandarix.bushierflowers.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGen {
    public static void generateFlowers(){
        //DEFAULT
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.SWAMP, BiomeKeys.BADLANDS, BiomeKeys.MUSHROOM_FIELDS, BiomeKeys.NETHER_WASTES, BiomeKeys.THE_END), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_FLOWER_DEFAULT_PLACED_KEY);

        //FOREST
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.FLOWER_FOREST), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_FLOWER_FLOWER_FOREST_PLACED_KEY);

        //SWAMP
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.SWAMP), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_FLOWER_SWAMP_PLACED_KEY);

        //PLAINS
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.PLAINS, BiomeKeys.SUNFLOWER_PLAINS), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_FLOWER_PLAIN_PLACED_KEY);

        //MEADOW
        BiomeModifications.addFeature(BiomeSelectors.includeByKey(BiomeKeys.MEADOW), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_FLOWER_MEADOW_PLACED_KEY);
    }
}
