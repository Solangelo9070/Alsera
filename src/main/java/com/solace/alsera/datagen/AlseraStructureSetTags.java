package com.solace.alsera.datagen;
import com.solace.alsera.Alsera;
import com.solace.alsera.world.structures.ModStructureFeatures;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.tags.TagsProvider;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagManager;
import net.minecraft.world.level.levelgen.structure.StructureSet;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AlseraStructureSetTags extends TagsProvider<StructureSet> {

    public AlseraStructureSetTags(DataGenerator generator, ExistingFileHelper helper) {
        super(generator, BuiltinRegistries.STRUCTURE_SETS, TagManager.getTagDir(BuiltinRegistries.STRUCTURE_SETS.key()).substring(5), helper);
    }

    @Override
    protected void addTags() {
        tag(ModStructureFeatures.BEGINNING_DIMENSION_STRUCTURE_SET)
                .add(ResourceKey.create(BuiltinRegistries.STRUCTURE_SETS.key(), new ResourceLocation(Alsera.MOD_ID, "portal")))
        ;
    }

    @Override
    public String getName() {
        return "Alsera Tags";
    }
}