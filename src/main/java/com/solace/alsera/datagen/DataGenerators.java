package com.solace.alsera.datagen;

import com.solace.alsera.Alsera;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Alsera.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        if (event.includeServer()) {
            generator.addProvider(new AlseraBiomeTags(generator, event.getExistingFileHelper()));
            generator.addProvider(new AlseraStructureSetTags(generator, event.getExistingFileHelper()));
        }
    }
}
