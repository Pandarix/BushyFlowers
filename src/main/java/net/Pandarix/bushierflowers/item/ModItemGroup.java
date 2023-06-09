package net.Pandarix.bushierflowers.item;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    /*Gets called in onInitialize before the Item-Registration
    Creates FabricItemGroup with an ItemStack as a Symbol
    The Name of the Tab is located in the .lang file under "itemGroup.betterarcheology"*/
    public static final RegistryKey<ItemGroup> BUSHIER_FLOWERS = RegistryKey.of(RegistryKeys.ITEM_GROUP, new Identifier(BushierFlowers.MOD_ID, "bushier_flowers"));

    public static void registerTab() {
        Registry.register(Registries.ITEM_GROUP, BUSHIER_FLOWERS, FabricItemGroup.builder().displayName(Text.translatable("itemGroup." + BushierFlowers.MOD_ID)).icon(() -> new ItemStack(ModBlocks.GROWN_ALLIUM.asItem())).entries((context, entries) -> {
        }).build());
    }
}
