package com.solace.alsera.machines.containers;

import com.solace.alsera.Alsera;
import net.minecraft.world.inventory.MenuType;
import net.minecraftforge.common.extensions.IForgeMenuType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModContainers {
    private static final DeferredRegister<MenuType<?>> CONTAINERS =
            DeferredRegister.create(ForgeRegistries.CONTAINERS, Alsera.MOD_ID);

    public static final RegistryObject<MenuType<FurnaceGeneratorContainer>> FURNACE_GENERATOR =
            CONTAINERS.register("furnace_generator",
                    () -> IForgeMenuType.create((windowId, inv, data) -> new
                            FurnaceGeneratorContainer(windowId, data.readBlockPos(), inv, inv.player)));

    public static final RegistryObject<MenuType<FurnaceGeneratorL2Container>> FURNACE_GENERATOR_L2 =
            CONTAINERS.register("furnace_generator_l2",
                    () -> IForgeMenuType.create((windowId, inv, data) -> new
                            FurnaceGeneratorL2Container(windowId, data.readBlockPos(), inv, inv.player)));



    public static void register(IEventBus eventBus) {
        CONTAINERS.register(eventBus);
    }
}
