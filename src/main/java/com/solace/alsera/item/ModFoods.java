package com.solace.alsera.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties FLAME_APPLE = (new FoodProperties.Builder()).nutrition(4).saturationMod(0.3F).effect(new MobEffectInstance(MobEffects.FIRE_RESISTANCE, 600, 0), 0.5F).build();
    public static final FoodProperties ALTANAR = (new FoodProperties.Builder()).nutrition(3).saturationMod(0.6F).build();
}
