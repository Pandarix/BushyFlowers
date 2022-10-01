package net.Pandarix.bushierflowers.item;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BUSHIER_FLOWERS = FabricItemGroupBuilder.build(new Identifier(BushierFlowers.MOD_ID, "bushier_flowers"), () -> new ItemStack(ModBlocks.GROWN_POPPY.asItem()));
}
