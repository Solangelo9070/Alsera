package com.solace.alsera.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier ALSOR = new ForgeTier(3, 1400, 8f,
            3f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.ALSOR_INGOT.get()));

    public static final ForgeTier REDALLIUM = new ForgeTier(3, 1600, 8.5f,
            3.5f, 24, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.REDALLIUM_INGOT.get()));

    public static final ForgeTier OSMIUM = new ForgeTier(3, 1200, 6f,
            2.2f, 16, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.OSMIUM_INGOT.get()));
}
