package net.matth.rivermonsters.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.BowfinEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class BowfinRenderer extends GeoEntityRenderer<BowfinEntity> {
    public BowfinRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new BowfinModel());
        this.shadowRadius = 0.5f;

    }
    @Override
    public ResourceLocation getTextureLocation(BowfinEntity instance) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/bowfin/bowfin.png");
    }

    @Override
    public RenderType getRenderType(BowfinEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}