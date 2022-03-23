package com.solace.alsera.block.custom;

import com.solace.alsera.item.ModItems;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.BeetrootBlock;

public class AltanarCropBlock extends BeetrootBlock {
    public AltanarCropBlock(Properties p_49661_) {
        super(p_49661_);
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return ModItems.ALTANAR_SEEDS.get();
    }
}
