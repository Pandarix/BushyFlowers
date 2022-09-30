package net.Pandarix.bushierflowers.item;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(BushierFlowers.MOD_ID, name), item);
    }

    public static void registerModItems(){
        BushierFlowers.LOGGER.debug("Registering Mod Items for " + BushierFlowers.MOD_ID);
    }

}
