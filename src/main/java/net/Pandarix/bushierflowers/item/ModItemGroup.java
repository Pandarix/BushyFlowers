package net.Pandarix.bushierflowers.item;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static ItemGroup BUSHIER_FLOWERS;    //CreativeTab for Better Archeology

    /*
    Gets called in onInitialise before the Item-Registration
    Creates FabricItemGroup with an ItemStack as a Symbol
    The Name of the Tab is located in the .lang file under "itemGroup.bushier_flowers"
     */
    public static void registerTab() {
        BUSHIER_FLOWERS = FabricItemGroup.builder(
                        new Identifier(BushierFlowers.MOD_ID))
                .displayName(Text.translatable("itemGroup.bushier_flowers"))
                .icon(() -> new ItemStack(ModBlocks.GROWN_ALLIUM.asItem()))
                .build();
    }
}
