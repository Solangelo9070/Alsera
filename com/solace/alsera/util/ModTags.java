package com.solace.alsera.util;

import com.solace.alsera.Alsera;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_VALUABLES = tag("metal_detector_valuables");

        public static final TagKey<Block> SLATE_MATERIALS = tag("slate_materials");

        private static TagKey<Block> tag(String name) {
            return BlockTags.create(new ResourceLocation(Alsera.MOD_ID, name));
        }

        private static TagKey<Block> forgeTag(String name) {
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }


    public static class Items {
        public static final TagKey<Item> OSMIUM_INGOTS = forgeTag("ingots/osmium");
    
        private static TagKey<Item> tag(String name) {
            return ItemTags.create(new ResourceLocation(Alsera.MOD_ID, name));
        }

        private static TagKey<Item> forgeTag(String name) {
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
}
