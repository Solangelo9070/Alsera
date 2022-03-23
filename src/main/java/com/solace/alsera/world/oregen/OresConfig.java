package com.solace.alsera.world.oregen;

import net.minecraftforge.common.ForgeConfigSpec;

public class OresConfig {
    public static ForgeConfigSpec.IntValue REDALLIUM_VEINSIZE;
    public static ForgeConfigSpec.IntValue REDALLIUM_AMOUNT;


    public static void registerCommonConfig(ForgeConfigSpec.Builder COMMON_BUILDER) {
        COMMON_BUILDER.comment("Settings for ore generation").push("ores");

        REDALLIUM_VEINSIZE = COMMON_BUILDER
                .comment("Veinsize of our ore in the mysterious dimension")
                .defineInRange("redalliumVeinsize", 6, 1, Integer.MAX_VALUE);
        REDALLIUM_AMOUNT = COMMON_BUILDER
                .comment("Amount of veines of our ore in the mysterious dimension")
                .defineInRange("redalliumAmount", 10, 1, Integer.MAX_VALUE);

        COMMON_BUILDER.pop();
    }
}
