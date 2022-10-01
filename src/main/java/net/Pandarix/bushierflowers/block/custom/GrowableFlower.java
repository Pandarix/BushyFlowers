package net.Pandarix.bushierflowers.block.custom;

import net.minecraft.block.*;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.world.BlockView;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.WorldView;

public class GrowableFlower extends PlantBlock {
    /*
    This is the base class of all Growable Flowers in this Mod. This ensures that the Block behaves correctly.
     */
    public GrowableFlower(AbstractBlock.Settings settings) {super(settings);}

    //---------------------------Block Shape stuff---------------------------

    //The blocks outline shape
    private static final VoxelShape SHAPE = Block.createCuboidShape(2, 0, 2, 14, 8, 14);
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
}
