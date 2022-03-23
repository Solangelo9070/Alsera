package com.solace.alsera.enchantment;

import net.minecraft.world.entity.*;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class LifestealEnchantment extends Enchantment {
    protected LifestealEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

        @Override
        public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
            if (!pAttacker.level.isClientSide()) {
                if(pAttacker instanceof Player player) {
                    pAttacker.heal(1f * pLevel);
                }

                super.doPostAttack(pAttacker, pTarget, pLevel);
            }
        }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}