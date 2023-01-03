package net.matth.rivermonsters.entity.client;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.GiantStingrayEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GiantStingrayModel extends AnimatedGeoModel<GiantStingrayEntity> {
    @Override
    public ResourceLocation getModelLocation(GiantStingrayEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "geo/giant_stingray.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GiantStingrayEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/giant_stingray/giant_stingray.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GiantStingrayEntity animatable) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "animations/giant_stingray.animation.json");
    }

    }
