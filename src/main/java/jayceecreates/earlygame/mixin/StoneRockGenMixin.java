package jayceecreates.earlygame.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import jayceecreates.earlygame.world.StoneRockGen;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

@Mixin(DefaultBiomeFeatures.class)
public class StoneRockGenMixin {
    
    @Inject(
        method = "addPlainsFeatures(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V",
        at = @At("TAIL")
    )
    private static void addPlainsFeatures(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, StoneRockGen.STONE_ROCK_GEN);
    }

    @Inject(
        method = "addForestGrass(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V",
        at = @At("TAIL")
    )
    private static void addForestGrass(GenerationSettings.Builder builder, CallbackInfo ci) {
        builder.feature(GenerationStep.Feature.VEGETAL_DECORATION, StoneRockGen.STONE_ROCK_GEN);
    }
    
}