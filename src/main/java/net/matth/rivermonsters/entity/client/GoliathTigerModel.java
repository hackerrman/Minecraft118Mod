package net.matth.rivermonsters.entity.client;

import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.GoliathTigerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class GoliathTigerModel extends AnimatedGeoModel<GoliathTigerEntity> {
    @Override
    public ResourceLocation getModelLocation(GoliathTigerEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "geo/goliath_tiger.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(GoliathTigerEntity object) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/goliath_tiger/goliath_tiger.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(GoliathTigerEntity animatable) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "animations/goliath_tiger.animation.json");
    }
}
