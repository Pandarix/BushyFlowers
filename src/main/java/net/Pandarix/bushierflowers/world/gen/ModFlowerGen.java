package net.Pandarix.bushierflowers.world.gen;

import net.Pandarix.bushierflowers.world.feature.ModPlacedFeatures;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.BiomeKeys;
import net.minecraft.world.gen.GenerationStep;

public class ModFlowerGen {
    public static void generateFlowers(){
        //DANDELION
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.SWAMP, BiomeKeys.BADLANDS, BiomeKeys.MUSHROOM_FIELDS, BiomeKeys.NETHER_WASTES, BiomeKeys.THE_END), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_DANDELION_PLACED.getKey().get());
        //POPPY
        BiomeModifications.addFeature(BiomeSelectors.excludeByKey(BiomeKeys.SWAMP, BiomeKeys.BADLANDS, BiomeKeys.MUSHROOM_FIELDS, BiomeKeys.NETHER_WASTES, BiomeKeys.THE_END), GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.GROWN_POPPY_PLACED.getKey().get());
    }
}
