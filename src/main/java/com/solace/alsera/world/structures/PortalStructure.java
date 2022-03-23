package com.solace.alsera.world.structures;

import com.solace.alsera.world.dimensions.BeginningChunkGenerator;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelHeightAccessor;
import net.minecraft.world.level.NoiseColumn;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.Heightmap;
import net.minecraft.world.level.levelgen.LegacyRandomSource;
import net.minecraft.world.level.levelgen.WorldgenRandom;
import net.minecraft.world.level.levelgen.feature.StructureFeature;
import net.minecraft.world.level.levelgen.feature.configurations.JigsawConfiguration;
import net.minecraft.world.level.levelgen.structure.PoolElementStructurePiece;
import net.minecraft.world.level.levelgen.structure.PostPlacementProcessor;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGenerator;
import net.minecraft.world.level.levelgen.structure.pieces.PieceGeneratorSupplier;
import net.minecraft.world.level.levelgen.structure.pools.JigsawPlacement;
import org.jetbrains.annotations.NotNull;

import java.util.Optional;

public class PortalStructure extends StructureFeature<JigsawConfiguration> {

    public PortalStructure() {
        super(JigsawConfiguration.CODEC, context -> createPiecesGenerator(context), PostPlacementProcessor.NONE);
    }

    @Override
    public GenerationStep.Decoration step() {
        return GenerationStep.Decoration.UNDERGROUND_STRUCTURES;
    }

    private static Optional<PieceGenerator<JigsawConfiguration>> createPiecesGenerator(PieceGeneratorSupplier.Context<JigsawConfiguration> context) {
        boolean overworld = !(context.chunkGenerator() instanceof BeginningChunkGenerator);

        BlockPos blockpos = context.chunkPos().getMiddleBlockPosition(0);

        if (overworld) {
            blockpos = findSuitableSpot(context, blockpos);
        }

        return JigsawPlacement.addPieces(
                context,
                PoolElementStructurePiece::new,
                blockpos,
                false,
                !overworld
        );
    }

    @NotNull
    private static BlockPos findSuitableSpot(PieceGeneratorSupplier.Context<JigsawConfiguration> context, BlockPos blockpos) {
        LevelHeightAccessor heightAccessor = context.heightAccessor();

        int y = context.chunkGenerator().getBaseHeight(blockpos.getX(), blockpos.getZ(), Heightmap.Types.WORLD_SURFACE_WG, heightAccessor);

        WorldgenRandom worldgenrandom = new WorldgenRandom(new LegacyRandomSource(context.seed()));
        worldgenrandom.setLargeFeatureSeed(context.seed(), context.chunkPos().x, context.chunkPos().z);

        y = worldgenrandom.nextIntBetweenInclusive(heightAccessor.getMinBuildHeight()+20, y - 10);

        NoiseColumn baseColumn = context.chunkGenerator().getBaseColumn(blockpos.getX(), blockpos.getZ(), heightAccessor);
        int yy = y;
        int lower = heightAccessor.getMinBuildHeight() + 3;
        while (yy > lower && !baseColumn.getBlock(yy).isAir()) {
            yy--;
        }
        if (yy > lower) {
            while (yy > lower && baseColumn.getBlock(yy).isAir()) {
                yy--;
            }
            if (yy > lower) {
                y = yy + 1;
            }
        }

        return blockpos.atY(y);
    }
}
