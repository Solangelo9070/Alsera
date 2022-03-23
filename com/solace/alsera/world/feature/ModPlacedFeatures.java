package com.solace.alsera.world.feature;

import net.minecraft.core.Holder;
import net.minecraft.data.worldgen.placement.PlacementUtils;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.HeightRangePlacement;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModPlacedFeatures {
    public static final Holder<PlacedFeature> ALSOR_ORE_PLACED = PlacementUtils.register("alsor_ore_placed",
            ModConfiguredFeature.ALSOR_ORE, ModOrePlacement.commonOrePlacement(10, // VeinsPerChunk
                            HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-80), VerticalAnchor.aboveBottom(80))));

    public static final Holder<PlacedFeature> OSMIUM_ORE_PLACED = PlacementUtils.register("osmium_ore_placed",
            ModConfiguredFeature.OSMIUM_ORE, ModOrePlacement.commonOrePlacement(20, // VeinsPerChunk
                    HeightRangePlacement.triangle(VerticalAnchor.aboveBottom(-60), VerticalAnchor.aboveBottom(100))));
}
