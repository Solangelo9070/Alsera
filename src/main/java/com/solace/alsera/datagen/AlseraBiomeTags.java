package com.solace.alsera.datagen;

import com.solace.alsera.world.structures.ModStructureFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.tags.TagManager;
import net.minecraft.world.level.biome.Biome;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;

public class AlseraBiomeTags  extends TagsProvider<Biome> {

    public AlseraBiomeTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, BuiltinRegistries.BIOME, TagManager.getTagDir(BuiltinRegistries.BIOME.key()).substring(5), helper);
    }

    @Override
    protected void addTags() {
        ForgeRegistries.BIOMES.getValues().forEach(biome -> {
            tag(ModStructureFeatures.HAS_PORTAL).add(biome);
        });
    }

    @Override
    public String getName() {
        return "Alsera Tags";
    }
}
