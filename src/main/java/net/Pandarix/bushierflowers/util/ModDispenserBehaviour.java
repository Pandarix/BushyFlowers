package net.Pandarix.bushierflowers.util;

import com.google.common.base.Suppliers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.DispenserBlock;
import net.minecraft.block.dispenser.FallibleItemDispenserBehavior;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPointer;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class ModDispenserBehaviour {
    public static void registerDispenserBehaviour() {
        DispenserBlock.registerBehavior(Items.BONE_MEAL, new FallibleItemDispenserBehavior() {
            protected ItemStack dispenseSilently(BlockPointer pointer, ItemStack stack) {

                //lists of flowers with matching indexes to ease the search
                final List<Block> bushyflowers$validFlowers = Arrays.asList(Blocks.POPPY, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.PINK_TULIP, Blocks.WHITE_TULIP, Blocks.AZURE_BLUET, Blocks.OXEYE_DAISY, Blocks.BLUE_ORCHID, Blocks.CORNFLOWER, Blocks.DANDELION, Blocks.ALLIUM, Blocks.WITHER_ROSE, Blocks.LILY_OF_THE_VALLEY);
                final Supplier<List<Block>> bushyflowers$grownFlowers = Suppliers.memoize(() -> List.of(ModBlocks.GROWN_POPPY, ModBlocks.GROWN_RED_TULIP, ModBlocks.GROWN_ORANGE_TULIP, ModBlocks.GROWN_PINK_TULIP, ModBlocks.GROWN_WHITE_TULIP, ModBlocks.GROWN_AZURE_BLUET, ModBlocks.GROWN_OXEYE_DAISY, ModBlocks.GROWN_BLUE_ORCHID, ModBlocks.GROWN_CORNFLOWER, ModBlocks.GROWN_DANDELION, ModBlocks.GROWN_ALLIUM, ModBlocks.GROWN_WITHER_ROSE, ModBlocks.GROWN_LILY));

                //help variables
                this.setSuccess(true);
                World world = pointer.getWorld();
                BlockPos blockPos = pointer.getPos().offset((Direction) pointer.getBlockState().get(DispenserBlock.FACING));
                Block block = world.getBlockState(blockPos).getBlock();

                //behaviour for when it bonemeals a vanilla flower---------------------------------------------------------------------------------
                if (bushyflowers$validFlowers.contains(block) && !world.isClient) {
                    this.setSuccess(true);
                    //getting the corresponding grown flower for the targeted vanilla one
                    Block bushyflowers$correspondingFlower = bushyflowers$grownFlowers.get().get(bushyflowers$validFlowers.indexOf(block));
                    //replacing the block
                    world.setBlockState(blockPos, bushyflowers$correspondingFlower.getDefaultState(), 3);
                    //sounds
                    world.playSound(null, (double) blockPos.getX() + 0.5, (double) blockPos.getY() + 0.5, (double) blockPos.getZ() + 0.5, SoundEvents.ITEM_BONE_MEAL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    //consuming one bonemeal
                    stack.decrement(1);

                }
                //behaviour for when it bonemeals a modded flower----------------------------------------------------------------------------------
                else if (bushyflowers$grownFlowers.get().contains(world.getBlockState(blockPos).getBlock()) && !world.isClient) {
                    this.setSuccess(true);
                    //getting the corresponding vanilla flower for the targeted modded one
                    Block bushyflowers$correspondingFlower = bushyflowers$validFlowers.get(bushyflowers$grownFlowers.get().indexOf(block));
                    //spawning the item
                    world.spawnEntity(new ItemEntity(world, blockPos.getX() + 0.5, blockPos.getY() + 0.5, blockPos.getZ() + 0.5, bushyflowers$correspondingFlower.getPickStack(world, blockPos, world.getBlockState(blockPos))));
                    //sounds
                    world.playSound(null, (double) blockPos.getX() + 0.5, (double) blockPos.getY() + 0.5, (double) blockPos.getZ() + 0.5, SoundEvents.ITEM_BONE_MEAL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                    //consuming one bonemeal
                    stack.decrement(1);
                }

                //standard Vanilla behaviour-------------------------------------------------------------------------------------------------------
                if (!BoneMealItem.useOnFertilizable(stack, world, blockPos) && !BoneMealItem.useOnGround(stack, world, blockPos, (Direction) null)) {
                    this.setSuccess(false);
                } else if (!world.isClient) {
                    world.syncWorldEvent(1505, blockPos, 0);
                }

                //added particles------------------------------------------------------------------------------------------------------------------
                if (this.isSuccess() && world.isClient) {
                    Random bushyflowers$random = world.getRandom();
                    for (int particle = 0; particle < 10; particle++) {
                        world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double) blockPos.getX() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, (double) blockPos.getY() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, (double) blockPos.getZ() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, 0.0, 0.0, 0.0);
                    }
                }

                return stack;
            }
        });
    }
}
