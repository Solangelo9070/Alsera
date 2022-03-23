package com.solace.alsera.recipe;

import com.solace.alsera.Alsera;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModRecipes {
    public static final DeferredRegister<RecipeSerializer<?>> SERIALIZERS =
            DeferredRegister.create(ForgeRegistries.RECIPE_SERIALIZERS, Alsera.MOD_ID);

    public static final RegistryObject<RecipeSerializer<MechanicalBlasterRecipe>> MECHANICAL_BLASTER_SERIALIZER =
            SERIALIZERS.register("mechanical_blasting", () -> MechanicalBlasterRecipe.Serializer.INSTANCE);

    public static void register(IEventBus eventBus) {
        SERIALIZERS.register(eventBus);
    }
}
