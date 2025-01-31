package de.presti.ccbx.ccbx;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.EntityBlock;
import net.minecraft.world.level.block.HorizontalDirectionalBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.material.Material;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;

/**
 * This is our block. To tell minecraft that this block has a block entity, we need to implement {@link EntityBlock}
 */
public class CCBallistiXBlock extends Block implements EntityBlock {

    public CCBallistiXBlock() {
        super(Properties.of(Material.METAL).strength(5, 5));
    }

    /**
     * This is the method from {@link EntityBlock} to create a new block entity for our block
     *
     * @return A new block entity from our registry object
     */
    @Nullable
    @Override
    public BlockEntity newBlockEntity(@NotNull BlockPos pos, @NotNull BlockState state) {
        return Registration.CC_TILEENTITY.get().create(pos, state);
    }
}
