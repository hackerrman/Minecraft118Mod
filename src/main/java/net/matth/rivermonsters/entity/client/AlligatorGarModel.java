package net.matth.rivermonsters.entity.client;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.AlligatorGarEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class AlligatorGarModel extends AnimatedGeoModel<AlligatorGarEntity> {
    @Override
    public ResourceLocation getModelLocation(AlligatorGarEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "geo/alligator_gar.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(AlligatorGarEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/alligator_gar/alligator_gar.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(AlligatorGarEntity animatable) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "animations/alligator_gar.animation.json");
    }
}
