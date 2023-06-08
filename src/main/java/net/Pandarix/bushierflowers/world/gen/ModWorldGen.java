package net.Pandarix.bushierflowers.world.gen;

import net.Pandarix.bushierflowers.BushierFlowers;

public class ModWorldGen {
    public static void generateModWorldGen(){
        BushierFlowers.LOGGER.info("Generating Bushier Flowers");
        ModFlowerGen.generateFlowers();
    }
}
