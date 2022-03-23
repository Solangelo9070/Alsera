package com.solace.alsera.world;
import com.solace.alsera.Alsera;
import com.solace.alsera.world.oregen.ModOreGeneration;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Alsera.MOD_ID)
public class ModWorldEvents {
    @SubscribeEvent
    public static void biomeLoadingEvent(final BiomeLoadingEvent event) {
        ModOreGeneration.generateOres(event);
       // event.getGeneration().addFeature(GenerationStep.Decoration.UNDERGROUND_ORES, REDALLIUM_OREGEN);
    }
}