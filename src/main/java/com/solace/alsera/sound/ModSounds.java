package com.solace.alsera.sound;

import com.solace.alsera.Alsera;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUND_EVENTS =
            DeferredRegister.create(ForgeRegistries.SOUND_EVENTS, Alsera.MOD_ID);

    public static RegistryObject<SoundEvent> METAL_DETECTOR_FOUND_ORE
            = registerSoundEvents("metal_detector_found_ore");

    public static RegistryObject<SoundEvent> THE_BEGINNING
            = registerSoundEvents("the_beginning");

    public static RegistryObject<SoundEvent> END_OF_AN_ERA
            = registerSoundEvents("end_of_an_era");


    private static RegistryObject<SoundEvent> registerSoundEvents(String name) {
        ResourceLocation id = new ResourceLocation(Alsera.MOD_ID, name);
        return SOUND_EVENTS.register(name, () -> new SoundEvent(id));
    }

    public static void register(IEventBus eventBus) {
        SOUND_EVENTS.register(eventBus);
    }
}
