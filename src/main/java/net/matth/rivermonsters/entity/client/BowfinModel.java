package net.matth.rivermonsters.entity.client;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.BowfinEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class BowfinModel extends AnimatedGeoModel<BowfinEntity> {
    @Override
    public ResourceLocation getModelLocation(BowfinEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "geo/bowfin.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(BowfinEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/bowfin/bowfin.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(BowfinEntity animatable) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "animations/bowfin.animation.json");
    }
}
