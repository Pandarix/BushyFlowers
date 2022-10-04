package net.Pandarix.bushierflowers.mixin;


import com.google.common.base.Suppliers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.ItemEntity;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.random.Random;
import net.minecraft.world.World;
import net.minecraft.world.event.GameEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Mixin(BoneMealItem.class)
public abstract class ModFlowerGrowHelper {
    private static final List<Block> bushyflowers$validFlowers = Arrays.asList(Blocks.POPPY, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.PINK_TULIP, Blocks.WHITE_TULIP, Blocks.AZURE_BLUET, Blocks.OXEYE_DAISY, Blocks.BLUE_ORCHID, Blocks.CORNFLOWER, Blocks.DANDELION, Blocks.ALLIUM, Blocks.WITHER_ROSE, Blocks.LILY_OF_THE_VALLEY);
    private final Supplier<List<Block>> bushyflowers$grownFlowers = Suppliers.memoize(() -> List.of(ModBlocks.GROWN_POPPY, ModBlocks.GROWN_RED_TULIP, ModBlocks.GROWN_ORANGE_TULIP, ModBlocks.GROWN_PINK_TULIP, ModBlocks.GROWN_WHITE_TULIP, ModBlocks.GROWN_AZURE_BLUET, ModBlocks.GROWN_OXEYE_DAISY, ModBlocks.GROWN_BLUE_ORCHID, ModBlocks.GROWN_CORNFLOWER, ModBlocks.GROWN_DANDELION, ModBlocks.GROWN_ALLIUM, ModBlocks.GROWN_WITHER_ROSE, ModBlocks.GROWN_LILY));

    //injecting this method into the Bonemeal Blockinteraction
    @Inject(method = "useOnBlock", at = @At("HEAD"))
    protected void injectWriteMethod(ItemUsageContext context, CallbackInfoReturnable info) {

        World bushyflowers$world = context.getWorld();
        BlockPos bushyflowers$blockPos = context.getBlockPos();
        Block bushyflowers$testedBlock = bushyflowers$world.getBlockState(bushyflowers$blockPos).getBlock();

        //testing if the clicked Block is a Block our mod will want to replace
        if (bushyflowers$validFlowers.contains(bushyflowers$testedBlock)) {
            //only execute if we are on Server Level to prevent syncing issues
            if (!bushyflowers$world.isClient()) {
                //getting the grown flower block that corresponds to the flower in question
                Block bushyflowers$correspondingFlower = bushyflowers$grownFlowers.get().get(bushyflowers$validFlowers.indexOf(bushyflowers$testedBlock));
                //replacing the Vanilla flower with our custom Mod variant
                bushyflowers$world.setBlockState(bushyflowers$blockPos, bushyflowers$correspondingFlower.getDefaultState());
                //additional Sounds and Particles
                bushyflowers$world.playSound(null, (double)bushyflowers$blockPos.getX() + 0.5, (double)bushyflowers$blockPos.getY() + 0.5, (double)bushyflowers$blockPos.getZ() + 0.5, SoundEvents.ITEM_BONE_MEAL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                context.getStack().decrement(1);
            }
            //particles
            Random bushyflowers$random = bushyflowers$world.getRandom();
            for(int particle=0; particle<10; particle++) {
                bushyflowers$world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double) bushyflowers$blockPos.getX() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, (double) bushyflowers$blockPos.getY() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, (double) bushyflowers$blockPos.getZ() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, 0.0, 0.0, 0.0);
            }
        }

        //testing if the clicked Block is a Block of our mod
        if (bushyflowers$grownFlowers.get().contains(bushyflowers$testedBlock)) {
            //only execute if we are on Server Level to prevent syncing issues
            if (!bushyflowers$world.isClient()) {
                //getting the vanilla flower block that corresponds to the grown flower in question
                Block bushyflowers$correspondingFlower = bushyflowers$validFlowers.get(bushyflowers$grownFlowers.get().indexOf(bushyflowers$testedBlock));
                //spawning the item
                bushyflowers$world.spawnEntity(new ItemEntity(bushyflowers$world, bushyflowers$blockPos.getX() + 0.5, bushyflowers$blockPos.getY() + 0.5, bushyflowers$blockPos.getZ() + 0.5, bushyflowers$correspondingFlower.getPickStack(bushyflowers$world, bushyflowers$blockPos, bushyflowers$world.getBlockState(bushyflowers$blockPos))));
                bushyflowers$world.emitGameEvent((Entity) null, GameEvent.ENTITY_PLACE, bushyflowers$blockPos);
                //additional Sounds and Particles
                bushyflowers$world.playSound(null, (double)bushyflowers$blockPos.getX() + 0.5, (double)bushyflowers$blockPos.getY() + 0.5, (double)bushyflowers$blockPos.getZ() + 0.5, SoundEvents.ITEM_BONE_MEAL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                context.getStack().decrement(1);
            }
            //particles
            Random bushyflowers$random = bushyflowers$world.getRandom();
            for(int particle=0; particle<10; particle++) {
                bushyflowers$world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double) bushyflowers$blockPos.getX() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, (double) bushyflowers$blockPos.getY() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, (double) bushyflowers$blockPos.getZ() + (bushyflowers$random.nextGaussian() * 0.25) + 0.5, 0.0, 0.0, 0.0);
            }
        }

    }
}
