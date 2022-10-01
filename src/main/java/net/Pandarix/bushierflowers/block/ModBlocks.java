package net.Pandarix.bushierflowers.block;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.custom.GrowablePoppy;
import net.Pandarix.bushierflowers.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block GROWN_POPPY = registerBlock("grown_poppy", new GrowablePoppy(FabricBlockSettings.copy(Blocks.POPPY)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_RED_TULIP = registerBlock("grown_red_tulip", new Block(FabricBlockSettings.copy(Blocks.RED_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_ORANGE_TULIP = registerBlock("grown_orange_tulip", new Block(FabricBlockSettings.copy(Blocks.ORANGE_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_PINK_TULIP = registerBlock("grown_pink_tulip", new Block(FabricBlockSettings.copy(Blocks.PINK_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_WHITE_TULIP = registerBlock("grown_white_tulip", new Block(FabricBlockSettings.copy(Blocks.WHITE_TULIP)), ModItemGroup.BUSHIER_FLOWERS);

    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(BushierFlowers.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(BushierFlowers.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        BushierFlowers.LOGGER.debug("Registering ModBlocks for " + BushierFlowers.MOD_ID);
    }

}