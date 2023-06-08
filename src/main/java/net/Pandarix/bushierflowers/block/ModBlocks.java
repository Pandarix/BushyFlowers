package net.Pandarix.bushierflowers.block;

import net.Pandarix.bushierflowers.BushierFlowers;
import net.Pandarix.bushierflowers.block.custom.GrowableFlower;
import net.Pandarix.bushierflowers.block.custom.GrowableWitherRose;
import net.Pandarix.bushierflowers.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModBlocks {

    //FLOWERS-----------------------------------------------------------------------------------------------------------
    public static final Block GROWN_POPPY = registerBlock("grown_poppy", new GrowableFlower(StatusEffects.NIGHT_VISION, 8, FabricBlockSettings.copy(Blocks.POPPY)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_RED_TULIP = registerBlock("grown_red_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12, FabricBlockSettings.copy(Blocks.RED_TULIP)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_ORANGE_TULIP = registerBlock("grown_orange_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12, FabricBlockSettings.copy(Blocks.ORANGE_TULIP)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_PINK_TULIP = registerBlock("grown_pink_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12, FabricBlockSettings.copy(Blocks.PINK_TULIP)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_WHITE_TULIP = registerBlock("grown_white_tulip", new GrowableFlower(StatusEffects.WEAKNESS, 12, FabricBlockSettings.copy(Blocks.WHITE_TULIP)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_AZURE_BLUET = registerBlock("grown_azure_bluet", new GrowableFlower(StatusEffects.BLINDNESS, 11, FabricBlockSettings.copy(Blocks.AZURE_BLUET)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_OXEYE_DAISY = registerBlock("grown_oxeye_daisy", new GrowableFlower(StatusEffects.REGENERATION, 11, FabricBlockSettings.copy(Blocks.OXEYE_DAISY)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_BLUE_ORCHID = registerBlock("grown_blue_orchid", new GrowableFlower(StatusEffects.SATURATION, 1, FabricBlockSettings.copy(Blocks.BLUE_ORCHID)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_CORNFLOWER = registerBlock("grown_cornflower", new GrowableFlower(StatusEffects.JUMP_BOOST, 9, FabricBlockSettings.copy(Blocks.CORNFLOWER)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_DANDELION = registerBlock("grown_dandelion", new GrowableFlower(StatusEffects.SATURATION, 1, FabricBlockSettings.copy(Blocks.DANDELION)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_ALLIUM = registerBlock("grown_allium", new GrowableFlower(StatusEffects.FIRE_RESISTANCE, 8, FabricBlockSettings.copy(Blocks.ALLIUM)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_WITHER_ROSE = registerBlock("grown_wither_rose", new GrowableWitherRose(FabricBlockSettings.copy(Blocks.WITHER_ROSE)), ModItemGroup.BUSHIER_FLOWERS);

    public static final Block GROWN_LILY = registerBlock("grown_lily", new GrowableFlower(StatusEffects.POISON, 15, FabricBlockSettings.copy(Blocks.LILY_OF_THE_VALLEY)), ModItemGroup.BUSHIER_FLOWERS);


    //POTTED FLOWERS----------------------------------------------------------------------------------------------------
    public static final Block POTTED_GROWN_POPPY = registerBlockWithoutItem("potted_grown_poppy", new FlowerPotBlock(ModBlocks.GROWN_POPPY, FabricBlockSettings.copy(Blocks.POTTED_POPPY)));

    public static final Block POTTED_GROWN_RED_TULIP = registerBlockWithoutItem("potted_grown_red_tulip", new FlowerPotBlock(ModBlocks.GROWN_RED_TULIP, FabricBlockSettings.copy(Blocks.POTTED_RED_TULIP)));

    public static final Block POTTED_GROWN_ORANGE_TULIP = registerBlockWithoutItem("potted_grown_orange_tulip", new FlowerPotBlock(ModBlocks.GROWN_ORANGE_TULIP, FabricBlockSettings.copy(Blocks.POTTED_ORANGE_TULIP)));

    public static final Block POTTED_GROWN_PINK_TULIP = registerBlockWithoutItem("potted_grown_pink_tulip", new FlowerPotBlock(ModBlocks.GROWN_PINK_TULIP, FabricBlockSettings.copy(Blocks.POTTED_PINK_TULIP)));

    public static final Block POTTED_GROWN_WHITE_TULIP = registerBlockWithoutItem("potted_grown_white_tulip", new FlowerPotBlock(ModBlocks.GROWN_WHITE_TULIP, FabricBlockSettings.copy(Blocks.POTTED_WHITE_TULIP)));

    public static final Block POTTED_GROWN_AZURE_BLUET = registerBlockWithoutItem("potted_grown_azure_bluet", new FlowerPotBlock(ModBlocks.GROWN_AZURE_BLUET, FabricBlockSettings.copy(Blocks.POTTED_AZURE_BLUET)));

    public static final Block POTTED_GROWN_OXEYE_DAISY = registerBlockWithoutItem("potted_grown_oxeye_daisy", new FlowerPotBlock(ModBlocks.GROWN_OXEYE_DAISY, FabricBlockSettings.copy(Blocks.POTTED_OXEYE_DAISY)));

    public static final Block POTTED_GROWN_BLUE_ORCHID = registerBlockWithoutItem("potted_grown_blue_orchid", new FlowerPotBlock(ModBlocks.GROWN_BLUE_ORCHID, FabricBlockSettings.copy(Blocks.POTTED_BLUE_ORCHID)));

    public static final Block POTTED_GROWN_CORNFLOWER = registerBlockWithoutItem("potted_grown_cornflower", new FlowerPotBlock(ModBlocks.GROWN_CORNFLOWER, FabricBlockSettings.copy(Blocks.POTTED_CORNFLOWER)));

    public static final Block POTTED_GROWN_DANDELION = registerBlockWithoutItem("potted_grown_dandelion", new FlowerPotBlock(ModBlocks.GROWN_DANDELION, FabricBlockSettings.copy(Blocks.POTTED_DANDELION)));

    public static final Block POTTED_GROWN_ALLIUM = registerBlockWithoutItem("potted_grown_allium", new FlowerPotBlock(ModBlocks.GROWN_ALLIUM, FabricBlockSettings.copy(Blocks.POTTED_ALLIUM)));

    public static final Block POTTED_GROWN_WITHER_ROSE = registerBlockWithoutItem("potted_grown_wither_rose", new FlowerPotBlock(ModBlocks.GROWN_WITHER_ROSE, FabricBlockSettings.copy(Blocks.POTTED_WITHER_ROSE)));

    public static final Block POTTED_GROWN_LILY = registerBlockWithoutItem("potted_grown_lily", new FlowerPotBlock(ModBlocks.GROWN_LILY, FabricBlockSettings.copy(Blocks.POTTED_LILY_OF_THE_VALLEY)));


    //REGISTRY----------------------------------------------------------------------------------------------------------
    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registries.BLOCK, new Identifier(BushierFlowers.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        Item item = Registry.register(Registries.ITEM, new Identifier(BushierFlowers.MOD_ID, name), new BlockItem(block, new FabricItemSettings()));

        ItemGroupEvents.modifyEntriesEvent(tab).register(entries -> entries.add(item));
        return item;
    }

    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registries.BLOCK, new Identifier(BushierFlowers.MOD_ID, name), block);
    }

    public static void registerModBlocks() {
        BushierFlowers.LOGGER.debug("Registering ModBlocks for " + BushierFlowers.MOD_ID);
    }

}
