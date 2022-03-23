package com.solace.alsera;

import com.solace.alsera.block.ModBlocks;

import com.solace.alsera.client.FurnaceGeneratorL2Screen;
import com.solace.alsera.client.FurnaceGeneratorScreen;
import com.solace.alsera.effect.ModEffects;
import com.solace.alsera.enchantment.ModEnchantments;
import com.solace.alsera.item.ModItems;
import com.solace.alsera.machines.blockentities.ModBlockEntities;
import com.solace.alsera.machines.containers.ModContainers;
import com.solace.alsera.recipe.ModRecipes;
import com.solace.alsera.screen.MechanicalBlasterScreen;
import com.solace.alsera.screen.ModMenuTypes;
import com.solace.alsera.sound.ModSounds;
import com.solace.alsera.util.ModItemProperties;
//import com.solace.alsera.world.dimensions.ModDimensions;
//import com.solace.alsera.world.oregen.Ores;
import net.minecraft.client.gui.screens.MenuScreens;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FlowerPotBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(Alsera.MOD_ID)
public class Alsera
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "alsera";

    public Alsera() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);
        ModBlockEntities.register(eventBus);
        ModContainers.register(eventBus);

        ModEnchantments.register(eventBus);
        ModSounds.register(eventBus);
        ModEffects.register(eventBus);

        ModMenuTypes.register(eventBus);

       ModRecipes.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void clientSetup(final FMLClientSetupEvent event) {
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEREWOOD_DOOR.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEREWOOD_TRAPDOOR.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.ALTANAR_CROP.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.PROTEA_ARUM.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.POTTED_PROTEA_ARUM.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.MECHANICAL_BLASTER.get(), RenderType.cutout());

        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEREWOOD_SAPLING.get(), RenderType.cutout());
        ItemBlockRenderTypes.setRenderLayer(ModBlocks.CEREWOOD_LEAVES.get(), RenderType.cutout());

        ModItemProperties.addCustomItemProperties();

        MenuScreens.register(ModMenuTypes.MECHANICAL_BLASTER_MENU.get(), MechanicalBlasterScreen::new);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ((FlowerPotBlock) Blocks.FLOWER_POT).addPlant(ModBlocks.PROTEA_ARUM.getId(), ModBlocks.POTTED_PROTEA_ARUM);
            MenuScreens.register(ModContainers.FURNACE_GENERATOR.get(), FurnaceGeneratorScreen::new);
            MenuScreens.register(ModContainers.FURNACE_GENERATOR_L2.get(), FurnaceGeneratorL2Screen::new);
            //ModDimensions.register();
            //Ores.registerConfiguredFeatures();
        });
    }
}
