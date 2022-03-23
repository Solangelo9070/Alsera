package com.solace.alsera.block;

import com.solace.alsera.Alsera;
import com.solace.alsera.block.custom.*;
import com.solace.alsera.item.ModCreativeModeTab;
import com.solace.alsera.item.ModItems;
import com.solace.alsera.world.feature.tree.CerewoodTreeGrower;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;
import java.util.List;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Alsera.MOD_ID);

    public static final RegistryObject<Block> ALSOR_BLOCK = registerBlock("alsor_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> RAW_ALSOR_BLOCK = registerBlock("raw_alsor_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> ALSOR_ORE = registerBlock("alsor_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> DEEPSLATE_ALSOR_ORE = registerBlock("deepslate_alsor_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_NATURE);




    public static final RegistryObject<Block> REDALLIUM_BLOCK = registerBlock("redallium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> RAW_REDALLIUM_BLOCK = registerBlock("raw_redallium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> REDALLIUM_ORE = registerBlock("redallium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_NATURE);



    public static final RegistryObject<Block> RAW_OSMIUM_BLOCK = registerBlock("raw_osmium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(7f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> OSMIUM_BLOCK = registerBlock("osmium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> OSMIUM_ORE = registerBlock("osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> DEEPSLATE_OSMIUM_ORE = registerBlock("deepslate_osmium_ore",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_NATURE);



    public static final RegistryObject<Block> LAVELLIUM_BLOCK = registerBlock("lavellium_block",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(9f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);



    public static final RegistryObject<Block> SLATE = registerBlock("slate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> COBBLED_SLATE = registerBlock("cobbled_slate",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_BRICKS = registerBlock("slate_bricks",
            () -> new Block(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_STAIRS = registerBlock("slate_stairs",
            () -> new StairBlock(() -> ModBlocks.SLATE.get().defaultBlockState(), BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_SLAB = registerBlock("slate_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_FENCE = registerBlock("slate_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_FENCE_GATE = registerBlock("slate_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_WALL = registerBlock("slate_wall",
            () -> new WallBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_BUTTON = registerBlock("slate_button",
            () -> new StoneButtonBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops().noCollission()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> SLATE_PRESSURE_PLATE = registerBlock("slate_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.of(Material.STONE)
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);



    public static final RegistryObject<Block> DIMENSIONAL_RIFT_CONTAINER = BLOCKS.register("dimensional_rift_container",
            () -> new DimensionalRiftContainerBlock(BlockBehaviour.Properties.of(Material.METAL)));

    public static final RegistryObject<Block> FURNACE_GENERATOR = registerBlock("furnace_generator",
            () -> new FurnaceGeneratorBlock(), ModCreativeModeTab.ALSERA_TAB_MACHINES);

    public static final RegistryObject<Block> FURNACE_GENERATOR_L2 = registerBlock("furnace_generator_l2",
            () -> new FurnaceGeneratorL2Block(), ModCreativeModeTab.ALSERA_TAB_MACHINES);

    public static final RegistryObject<Block> TABLET_STAND = BLOCKS.register("tablet_stand",
            () -> new Block(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()));

    public static final RegistryObject<Block> LAMP = registerBlock("lamp",
            () -> new LampBlock(BlockBehaviour.Properties.of(Material.METAL)
                    .strength(2f).requiresCorrectToolForDrops().lightLevel((state) -> state.getValue(LampBlock.CLICKED) ? 15 : 0)),
            ModCreativeModeTab.ALSERA_TAB_BLOCKS);

        public static final RegistryObject<Block> MECHANICAL_BLASTER = registerBlock("mechanical_blaster",
            () -> new MechanicalBlasterBlock(BlockBehaviour.Properties.of(Material.METAL).noOcclusion()
                    .strength(5f).requiresCorrectToolForDrops()), ModCreativeModeTab.ALSERA_TAB_MACHINES);




    public static final RegistryObject<Block> CEREWOOD_DOOR = registerBlock("cerewood_door",
            () -> new DoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> CEREWOOD_TRAPDOOR = registerBlock("cerewood_trapdoor",
            () -> new TrapDoorBlock(BlockBehaviour.Properties.of(Material.WOOD)
                    .strength(5f).requiresCorrectToolForDrops().noOcclusion()), ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> CEREWOOD_LOG = registerBlock("cerewood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LOG)), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> CEREWOOD_WOOD = registerBlock("cerewood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.OAK_WOOD)), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> STRIPPED_CEREWOOD_LOG = registerBlock("stripped_cerewood_log",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_LOG)), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> STRIPPED_CEREWOOD_WOOD = registerBlock("stripped_cerewood_wood",
            () -> new ModFlammableRotatedPillarBlock(BlockBehaviour.Properties.copy(Blocks.STRIPPED_OAK_WOOD)), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> CEREWOOD_PLANKS = registerBlock("cerewood_planks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 20;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 5;
                }
            }, ModCreativeModeTab.ALSERA_TAB_BLOCKS);

    public static final RegistryObject<Block> CEREWOOD_LEAVES = registerBlock("cerewood_leaves",
            () -> new LeavesBlock(BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES)){
                @Override
                public boolean isFlammable(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return true;
                }

                @Override
                public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 60;
                }

                @Override
                public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
                    return 30;
                }
            }, ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> CEREWOOD_SAPLING = registerBlock("cerewood_sapling",
            () -> new SaplingBlock(new CerewoodTreeGrower(), BlockBehaviour.Properties.copy(Blocks.OAK_SAPLING)), ModCreativeModeTab.ALSERA_TAB_NATURE);


    public static final RegistryObject<Block> PROTEA_ARUM = registerBlock("protea_arum",
            () -> new FlowerBlock(MobEffects.LEVITATION, 8,
                    BlockBehaviour.Properties.copy(Blocks.DANDELION).noOcclusion()), ModCreativeModeTab.ALSERA_TAB_NATURE);

    public static final RegistryObject<Block> POTTED_PROTEA_ARUM = registerBlockWithoutBlockItem("potted_protea_arum",
            () -> new FlowerPotBlock(null, ModBlocks.PROTEA_ARUM,
                    BlockBehaviour.Properties.copy(Blocks.POTTED_DANDELION).noOcclusion()));

    public static final RegistryObject<Block> ALTANAR_CROP = BLOCKS.register("altanar_crop",
            () -> new AltanarCropBlock(BlockBehaviour.Properties.copy(Blocks.BEETROOTS)
                   .noCollission().noOcclusion()));









    private static <T extends Block> RegistryObject<T> registerBlockWithoutBlockItem(String name, Supplier<T> block) {
        return BLOCKS.register(name, block);
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab, String tooltipKey) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }
//These have been added in case we want to add tooltips to blocks
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                            RegistryObject<T> block,
                                                                            CreativeModeTab tab, String tooltipKey) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)) {
            @Override
            public void appendHoverText(ItemStack pStack, @Nullable Level pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
                pTooltip.add(new TranslatableComponent(tooltipKey));
            }
        });
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name,
                                                                           RegistryObject<T> block,
                                                                           CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(),
                new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
