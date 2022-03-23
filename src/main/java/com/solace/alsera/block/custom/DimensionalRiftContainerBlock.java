package com.solace.alsera.block.custom;

//import com.solace.alsera.varia.Tools;
//import com.solace.alsera.world.dimensions.ModDimensions;
import net.minecraft.core.BlockPos;
import net.minecraft.resources.ResourceKey;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;

public class DimensionalRiftContainerBlock extends Block {
    public DimensionalRiftContainerBlock(Properties p_49795_) {
        super(p_49795_);
    }

    private static final VoxelShape SHAPE = Shapes.box(0, 0, 0, 1, .8, 1);

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }

    /*@Override
    public void entityInside(BlockState state, Level level, BlockPos pos, Entity entity) {
        if (entity instanceof ServerPlayer player) {
            if (level.dimension().equals(ModDimensions.BEGINNING)) {
                teleportTo(player, pos.north(), Level.OVERWORLD);
            } else {
                teleportTo(player, pos.north(), ModDimensions.BEGINNING);
            }
        }
   }

    private void teleportTo(ServerPlayer player, BlockPos pos, ResourceKey<Level> id) {
         ServerLevel world = player.getServer().getLevel(id);
        Tools.teleport(player, world, new BlockPos(pos.getX(), pos.getY(), pos.getZ()), true);
    }
*/}
