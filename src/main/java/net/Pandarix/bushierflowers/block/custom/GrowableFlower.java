package net.Pandarix.bushierflowers.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;

public class GrowableFlower extends Block {
    /*
    This is the base class of all Growable Flowers in this Mod. This ensures that the Block behaves correctly.
     */
    public GrowableFlower(Settings settings) {super(settings);}

    //---------------------------Block Shape stuff---------------------------

    //The blocks outline shape
    private static final VoxelShape SHAPE = Block.createCuboidShape(0, 0, 0, 16, 6, 16);

    @Deprecated
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
    }
    @Deprecated
    @Override
    public boolean isShapeFullCube(BlockState state, BlockView world, BlockPos pos) {return false;}

    //---------------------------Additional settings---------------------------
    @Override
    public boolean canMobSpawnInside() {return true;}
    @Deprecated
    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {return true;}
}
