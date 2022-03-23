package com.solace.alsera.item;

import com.solace.alsera.block.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab ALSERA_TAB = new CreativeModeTab("alseratab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FLAME_APPLE.get());
        }
    };
    public static final CreativeModeTab ALSERA_TAB_MINERALS = new CreativeModeTab("alseratabminerals") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.REDALLIUM_INGOT.get());
        }
    };
    public static final CreativeModeTab ALSERA_TAB_BLOCKS = new CreativeModeTab("alseratabblocks") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CEREWOOD_PLANKS.get());
        }
    };
    public static final CreativeModeTab ALSERA_TAB_NATURE = new CreativeModeTab("alseratabnature") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.CEREWOOD_LOG.get());
        }
    };
    public static final CreativeModeTab ALSERA_TAB_TOOLS = new CreativeModeTab("alseratabtools") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.ALSOR_SWORD.get());
        }
    };
    public static final CreativeModeTab ALSERA_TAB_MACHINES = new CreativeModeTab("alseratabmachines") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModBlocks.FURNACE_GENERATOR_L2.get());
        }
    };
}
