package com.solace.alsera.world.oregen;

import com.solace.alsera.block.ModBlocks;
import com.solace.alsera.world.dimensions.ModDimensions;
import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.features.OreFeatures;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.OreConfiguration;
import net.minecraft.world.level.levelgen.placement.*;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class Ores {

    public static Holder<PlacedFeature> REDALLIUM_OREGEN;


    public static void registerConfiguredFeatures() {
        OreConfiguration mysteriousConfig = new OreConfiguration(OreFeatures.STONE_ORE_REPLACEABLES, ModBlocks.REDALLIUM_ORE.get().defaultBlockState(), OresConfig.REDALLIUM_AMOUNT.get());
        REDALLIUM_OREGEN = registerPlacedFeature("redallium_ore", new ConfiguredFeature<>(Feature.ORE, mysteriousConfig),
                CountPlacement.of(OresConfig.REDALLIUM_AMOUNT.get()),
                InSquarePlacement.spread(),
                new DimensionBiomeFilter(key -> key.equals(ModDimensions.BEGINNING)),
                HeightRangePlacement.uniform(VerticalAnchor.absolute(0), VerticalAnchor.absolute(90)));
    }

    private static <C extends FeatureConfiguration, F extends Feature<C>> Holder<PlacedFeature> registerPlacedFeature(String registryName, ConfiguredFeature<C, F> feature, PlacementModifier... placementModifiers) {
        return PlacementUtils.register(registryName, Holder.direct(feature), placementModifiers);
    }

    public static void onBiomeLoadingEvent(BiomeLoadingEvent event) {

            event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, REDALLIUM_OREGEN);

    }
}