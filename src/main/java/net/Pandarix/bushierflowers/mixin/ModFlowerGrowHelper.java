package net.Pandarix.bushierflowers.mixin;


import com.google.common.base.Suppliers;
import net.Pandarix.bushierflowers.block.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BoneMealItem;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

@Mixin(BoneMealItem.class)
public abstract class ModFlowerGrowHelper {
    private static final List<Block> bushyflowers$validFlowers = Arrays.asList(Blocks.POPPY, Blocks.RED_TULIP, Blocks.ORANGE_TULIP, Blocks.PINK_TULIP, Blocks.WHITE_TULIP);
    private final Supplier<List<Block>> bushyflowers$grownFlowers = Suppliers.memoize(() -> List.of(ModBlocks.GROWN_POPPY, ModBlocks.GROWN_RED_TULIP, ModBlocks.GROWN_ORANGE_TULIP, ModBlocks.GROWN_PINK_TULIP, ModBlocks.GROWN_WHITE_TULIP));

    //injecting this method into the Bonemeal Blockinteraction
    @Inject(method = "useOnBlock", at = @At("HEAD"))
    protected void injectWriteMethod(ItemUsageContext context, CallbackInfoReturnable info) {
        //testing if the clicked Block is a Block our mod will want to replace
        if (bushyflowers$validFlowers.contains(context.getWorld().getBlockState(context.getBlockPos()).getBlock())) {
            World world = context.getWorld();
            //only execute if we are on Server Level to prevent syncing issues
            if (!world.isClient()) {
                BlockPos blockPos = context.getBlockPos(); //position of targeted Block

                //getting the grown flower block that corresponds to the flower in question
                Block correspondingFlower = bushyflowers$grownFlowers.get().get(bushyflowers$validFlowers.indexOf(world.getBlockState(blockPos).getBlock()));
                //replacing the Vanilla flower with our custom Mod variant
                world.setBlockState(blockPos, correspondingFlower.getDefaultState());
                //additional Sounds and Particles
                world.playSound(null, (double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.5, (double)blockPos.getZ() + 0.5, SoundEvents.ITEM_BONE_MEAL_USE, SoundCategory.BLOCKS, 1.0F, 1.0F);
                world.addParticle(ParticleTypes.HAPPY_VILLAGER, (double)blockPos.getX() + 0.5, (double)blockPos.getY() + 0.5, (double)blockPos.getZ() + 0.5, 0.0, 0.0, 0.0);
            }
        }
    }
}
