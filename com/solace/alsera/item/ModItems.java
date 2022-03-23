package com.solace.alsera.item;

import com.solace.alsera.Alsera;
import com.solace.alsera.block.ModBlocks;
import com.solace.alsera.item.custom.*;
import com.solace.alsera.sound.ModSounds;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Alsera.MOD_ID);

    //ALSOR

    public static final RegistryObject<Item> RAW_ALSOR = ITEMS.register("raw_alsor",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> ALSOR_INGOT = ITEMS.register("alsor_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> ALSOR_NUGGET = ITEMS.register("alsor_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> ALSOR_SWORD = ITEMS.register("alsor_sword",
            () -> new SwordItem(ModTiers.ALSOR, 3, -2f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_PICKAXE = ITEMS.register("alsor_pickaxe",
            () -> new PickaxeItem(ModTiers.ALSOR, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_SHOVEL = ITEMS.register("alsor_shovel",
            () -> new ShovelItem(ModTiers.ALSOR, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_AXE = ITEMS.register("alsor_axe",
            () -> new AxeItem(ModTiers.ALSOR, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_HOE = ITEMS.register("alsor_hoe",
            () -> new HoeItem(ModTiers.ALSOR, -3, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_HELMET = ITEMS.register("alsor_helmet",
            () -> new ModArmorAItem(ModArmorMaterialsA.ALSOR, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_CHESTPLATE = ITEMS.register("alsor_chestplate",
            () -> new ArmorItem(ModArmorMaterialsA.ALSOR, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_LEGGINGS = ITEMS.register("alsor_leggings",
            () -> new ArmorItem(ModArmorMaterialsA.ALSOR, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_BOOTS = ITEMS.register("alsor_boots",
            () -> new ArmorItem(ModArmorMaterialsA.ALSOR, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> ALSOR_BOW = ITEMS.register("alsor_bow",
            () -> new BowItem(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS).durability(500)));

    //REDALLIUM

    public static final RegistryObject<Item> RAW_REDALLIUM = ITEMS.register("raw_redallium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> REDALLIUM_INGOT = ITEMS.register("redallium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> REDALLIUM_NUGGET = ITEMS.register("redallium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> REDALLIUM_SWORD = ITEMS.register("redallium_sword",
            () -> new SwordItem(ModTiers.REDALLIUM, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_PICKAXE = ITEMS.register("redallium_pickaxe",
            () -> new PickaxeItem(ModTiers.REDALLIUM, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_SHOVEL = ITEMS.register("redallium_shovel",
            () -> new ShovelItem(ModTiers.REDALLIUM, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_AXE = ITEMS.register("redallium_axe",
            () -> new AxeItem(ModTiers.REDALLIUM, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_HOE = ITEMS.register("redallium_hoe",
            () -> new HoeItem(ModTiers.REDALLIUM, -3, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_HELMET = ITEMS.register("redallium_helmet",
            () -> new ModArmorRItem(ModArmorMaterialsR.REDALLIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_CHESTPLATE = ITEMS.register("redallium_chestplate",
            () -> new ArmorItem(ModArmorMaterialsR.REDALLIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_LEGGINGS = ITEMS.register("redallium_leggings",
            () -> new ArmorItem(ModArmorMaterialsR.REDALLIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> REDALLIUM_BOOTS = ITEMS.register("redallium_boots",
            () -> new ArmorItem(ModArmorMaterialsR.REDALLIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    //OSMIUM

    public static final RegistryObject<Item> RAW_OSMIUM = ITEMS.register("raw_osmium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> OSMIUM_INGOT = ITEMS.register("osmium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> OSMIUM_NUGGET = ITEMS.register("osmium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> OSMIUM_SWORD = ITEMS.register("osmium_sword",
            () -> new SwordItem(ModTiers.OSMIUM, 3, -2.4f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_PICKAXE = ITEMS.register("osmium_pickaxe",
            () -> new PickaxeItem(ModTiers.OSMIUM, 1, -2.8f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_SHOVEL = ITEMS.register("osmium_shovel",
            () -> new ShovelItem(ModTiers.OSMIUM, 1, -3f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_AXE = ITEMS.register("osmium_axe",
            () -> new AxeItem(ModTiers.OSMIUM, 6, -3.1f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_HOE = ITEMS.register("osmium_hoe",
            () -> new HoeItem(ModTiers.OSMIUM, -3, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_HELMET = ITEMS.register("osmium_helmet",
            () -> new ArmorItem(ModArmorMaterialsO.OSMIUM, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_CHESTPLATE = ITEMS.register("osmium_chestplate",
            () -> new ArmorItem(ModArmorMaterialsO.OSMIUM, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_LEGGINGS = ITEMS.register("osmium_leggings",
            () -> new ArmorItem(ModArmorMaterialsO.OSMIUM, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> OSMIUM_BOOTS = ITEMS.register("osmium_boots",
            () -> new ArmorItem(ModArmorMaterialsO.OSMIUM, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    //LAVELLIUM

    public static final RegistryObject<Item> LAVELLIUM_INGOT = ITEMS.register("lavellium_ingot",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    public static final RegistryObject<Item> LAVELLIUM_NUGGET = ITEMS.register("lavellium_nugget",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_MINERALS)));

    //MISC

    public static final RegistryObject<Item> SLATE_ROD = ITEMS.register("slate_rod",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB)));

    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB).durability(32)));

    public static final RegistryObject<Item> FLAME_APPLE = ITEMS.register("flame_apple",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB).food(ModFoods.FLAME_APPLE)));

    public static final RegistryObject<Item> COAL_COKE = ITEMS.register("coal_coke",
            () -> new CoalCokeItem(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB)));

    public static final RegistryObject<Item> LEVITATION_ROD = ITEMS.register("levitation_rod",
            () -> new LevitationRodItem(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB_TOOLS)));

    public static final RegistryObject<Item> MAGIC_DUST = ITEMS.register("magic_dust",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB)));

    public static final RegistryObject<Item> DATA_TABLET = ITEMS.register("data_tablet",
            () -> new DataTabletItem(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> ALTANAR_SEEDS = ITEMS.register("altanar_seeds",
            () -> new ItemNameBlockItem(ModBlocks.ALTANAR_CROP.get(), new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB)));

    public static final RegistryObject<Item> ALTANAR = ITEMS.register("altanar",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB).food(ModFoods.ALTANAR)));

    public static final RegistryObject<Item> THE_BEGINNING_RECORD = ITEMS.register("the_beginning_music_disc",
            () -> new RecordItem(4, ModSounds.THE_BEGINNING,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB).stacksTo(1)));

    public static final RegistryObject<Item> END_OF_AN_ERA_RECORD = ITEMS.register("end_of_an_era_music_disc",
            () -> new RecordItem(4, ModSounds.END_OF_AN_ERA,
                    new Item.Properties().tab(ModCreativeModeTab.ALSERA_TAB).stacksTo(1)));

    public static void register(IEventBus eventbus) {
        ITEMS.register(eventbus);
    }
}
