package net.matth.rivermonsters.entity.client;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.GreenlandSharkEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GreenlandSharkModel extends AnimatedGeoModel<GreenlandSharkEntity> {
    @Override
    public ResourceLocation getModelLocation(GreenlandSharkEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "geo/greenland_shark.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GreenlandSharkEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/greenland_shark/greenland_shark.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GreenlandSharkEntity animatable) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "animations/greenland_shark.animation.json");
    }
}
