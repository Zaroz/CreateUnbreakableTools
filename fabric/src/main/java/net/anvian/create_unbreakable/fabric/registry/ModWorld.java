package net.anvian.create_unbreakable.fabric.registry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.placement.PlacedFeature;

public class ModWorld {
    private static final ResourceKey<PlacedFeature> LUMINARCHY_ORE_PLACED = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(CreateUnbreakableToolsMod.MOD_ID, "luminarchy_ore"));
    private static final ResourceKey<PlacedFeature> PHILOLITE_ORE_PLACED = ResourceKey.create(Registry.PLACED_FEATURE_REGISTRY, new ResourceLocation(CreateUnbreakableToolsMod.MOD_ID, "philolite_ore"));

    public static void register() {
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, LUMINARCHY_ORE_PLACED);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Decoration.UNDERGROUND_ORES, PHILOLITE_ORE_PLACED);
    }
}
