package com.solace.alsera.enchantment;

import com.solace.alsera.Alsera;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS
            = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, Alsera.MOD_ID);

    public static RegistryObject<Enchantment> CHARGED =
            ENCHANTMENTS.register("charged",
    () -> new ChargedEnchantment(Enchantment.Rarity.UNCOMMON,
            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));

    public static RegistryObject<Enchantment> LIFESTEAL =
            ENCHANTMENTS.register("lifesteal",
                    () -> new LifestealEnchantment(Enchantment.Rarity.RARE,
                            EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));


    public static void register(IEventBus eventBus) {
        ENCHANTMENTS.register(eventBus);
    }

}
