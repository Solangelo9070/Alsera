package com.solace.alsera.world.structures;

import com.solace.alsera.Alsera;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.biome.Biome;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModStructureFeatures {
    private static final DeferredRegister<StructureFeature<?>> STRUCTURES = DeferredRegister.create(ForgeRegistries.STRUCTURE_FEATURES, Alsera.MOD_ID);

    public static final RegistryObject<StructureFeature<JigsawConfiguration>> PORTAL = STRUCTURES.register("portal", PortalStructure::new);
    public static final ResourceLocation RL_BEGINNING_DIMENSION_SET = new ResourceLocation(Alsera.MOD_ID, "beginning_dimension_structure_set");

    public static final TagKey<Biome> HAS_PORTAL = TagKey.create(Registry.BIOME_REGISTRY, new ResourceLocation(Alsera.MOD_ID, "has_structure/portal"));
    public static final TagKey<StructureSet> BEGINNING_DIMENSION_STRUCTURE_SET = TagKey.create(Registry.STRUCTURE_SET_REGISTRY, RL_BEGINNING_DIMENSION_SET);

    public static void register(IEventBus eventbus) {
        STRUCTURES.register(eventbus);
    }

}
