package net.Pandarix.bushierflowers.block;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.custom.*;
import net.Pandarix.bushierflowers.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModBlocks {

    public static final Block GROWN_POPPY = registerBlock("grown_poppy", new GrowableFlower(StatusEffects.NIGHT_VISION, 8, FabricBlockSettings.copy(Blocks.POPPY)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_RED_TULIP = registerBlock("grown_red_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12, FabricBlockSettings.copy(Blocks.RED_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_ORANGE_TULIP = registerBlock("grown_orange_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12, FabricBlockSettings.copy(Blocks.ORANGE_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_PINK_TULIP = registerBlock("grown_pink_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12,FabricBlockSettings.copy(Blocks.PINK_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_WHITE_TULIP = registerBlock("grown_white_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12,FabricBlockSettings.copy(Blocks.WHITE_TULIP)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_AZURE_BLUET = registerBlock("grown_azure_bluet", new GrowableFlower(StatusEffects.BLINDNESS, 11, FabricBlockSettings.copy(Blocks.AZURE_BLUET)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_OXEYE_DAISY = registerBlock("grown_oxeye_daisy", new GrowableFlower(StatusEffects.REGENERATION, 11,FabricBlockSettings.copy(Blocks.OXEYE_DAISY)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_BLUE_ORCHID = registerBlock("grown_blue_orchid", new GrowableFlower(StatusEffects.SATURATION, 1,FabricBlockSettings.copy(Blocks.BLUE_ORCHID)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_CORNFLOWER = registerBlock("grown_cornflower", new GrowableFlower(StatusEffects.JUMP_BOOST, 9,FabricBlockSettings.copy(Blocks.CORNFLOWER)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_DANDELION = registerBlock("grown_dandelion", new GrowableFlower(StatusEffects.SATURATION, 1,FabricBlockSettings.copy(Blocks.DANDELION)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_ALLIUM = registerBlock("grown_allium", new GrowableFlower(StatusEffects.FIRE_RESISTANCE, 8,FabricBlockSettings.copy(Blocks.ALLIUM)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_WITHER_ROSE = registerBlock("grown_wither_rose", new GrowableFlower(StatusEffects.WITHER, 11,FabricBlockSettings.copy(Blocks.WITHER_ROSE)), ModItemGroup.BUSHIER_FLOWERS);
    public static final Block GROWN_LILY = registerBlock("grown_lily", new GrowableFlower(StatusEffects.POISON, 15 , FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY)), ModItemGroup.BUSHIER_FLOWERS);

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
