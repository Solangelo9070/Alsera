package com.solace.alsera.machines.blockentities;

import com.solace.alsera.Alsera;
import com.solace.alsera.block.ModBlocks;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockEntities {
    private static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
            DeferredRegister.create(ForgeRegistries.BLOCK_ENTITIES, Alsera.MOD_ID);

    public static final RegistryObject<BlockEntityType<FurnaceGeneratorBlockEntity>> FURNACE_GENERATOR =
            BLOCK_ENTITIES.register("furnace_generator", () ->
                    BlockEntityType.Builder.of(FurnaceGeneratorBlockEntity::new, ModBlocks.FURNACE_GENERATOR.get()).build(null));

    public static final RegistryObject<BlockEntityType<FurnaceGeneratorL2BlockEntity>> FURNACE_GENERATOR_L2 =
            BLOCK_ENTITIES.register("furnace_generator_l2", () ->
                    BlockEntityType.Builder.of(FurnaceGeneratorL2BlockEntity::new, ModBlocks.FURNACE_GENERATOR_L2.get()).build(null));

    public static final RegistryObject<BlockEntityType<MechanicalBlasterBlockEntity>> MECHANICAL_BLASTER =
            BLOCK_ENTITIES.register("mechanical_blaster", () ->
                    BlockEntityType.Builder.of(MechanicalBlasterBlockEntity::new,
                            ModBlocks.MECHANICAL_BLASTER.get()).build(null));

    public static void register(IEventBus eventBus) {
        BLOCK_ENTITIES.register(eventBus);
    }

}
