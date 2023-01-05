package net.matth.rivermonsters.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.matth.rivermonsters.RiverMonsters;
import net.matth.rivermonsters.entity.custom.GoliathTigerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class GoliathTigerRenderer extends GeoEntityRenderer<GoliathTigerEntity> {
    public GoliathTigerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new GoliathTigerModel());
        this.shadowRadius = 0.5f;

    }
    @Override
    public ResourceLocation getTextureLocation(GoliathTigerEntity instance) {
        return new ResourceLocation(RiverMonsters.MOD_ID, "textures/entity/goliath_tiger/goliath_tiger.png");
    }

    @Override
    public RenderType getRenderType(GoliathTigerEntity animatable, float partialTicks, PoseStack stack,
                                    MultiBufferSource renderTypeBuffer, VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        stack.scale(0.8F, 0.8F, 0.8F);
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
