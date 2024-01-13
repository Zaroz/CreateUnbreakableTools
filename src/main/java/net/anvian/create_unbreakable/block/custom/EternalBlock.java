package net.anvian.create_unbreakable.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.item.ItemEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Explosion;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class EternalBlock extends Block {
    private final ItemStack item;

    public EternalBlock(Properties properties, ItemStack item) {
        super(properties);
        this.item = item;
    }

    @Override
    public void onRemove(BlockState state, Level level, BlockPos pos, BlockState newState, boolean isMoving) {
        if (!level.isClientSide){
            level.explode(null, pos.getX(), pos.getY(), pos.getZ(), 3, false, Explosion.BlockInteraction.BREAK);
            ItemEntity itemEntity = new ItemEntity(level, pos.getX(), pos.getY(), pos.getZ(), item);
            level.addFreshEntity(itemEntity);
        }
        super.onRemove(state, level, pos, newState, isMoving);
    }
}
