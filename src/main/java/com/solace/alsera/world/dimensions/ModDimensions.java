package com.solace.alsera.world.dimensions;

import com.solace.alsera.Alsera;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.Level;

public class ModDimensions {

    public static final ResourceKey<Level> BEGINNING = ResourceKey.create(Registry.DIMENSION_REGISTRY, new ResourceLocation(Alsera.MOD_ID, "beginning"));

    public static void register() {
        Registry.register(Registry.CHUNK_GENERATOR, new ResourceLocation(Alsera.MOD_ID, "beginning_chunkgen"),
                BeginningChunkGenerator.CODEC);
        Registry.register(Registry.BIOME_SOURCE, new ResourceLocation(Alsera.MOD_ID, "biomes"),
                BeginningBiomeProvider.CODEC);
    }
}