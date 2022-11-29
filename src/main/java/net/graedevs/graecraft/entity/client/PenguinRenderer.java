package net.graedevs.graecraft.entity.client;

import net.graedevs.graecraft.Graecraft;
import net.graedevs.graecraft.entity.custom.PenguinEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PenguinRenderer extends GeoEntityRenderer<PenguinEntity> {
    public PenguinRenderer(EntityRendererFactory.Context renderManager) {
        super(renderManager, new PenguinModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public Identifier getTextureResource(PenguinEntity instance) {
        return new Identifier(Graecraft.MOD_ID, "textures/entity/penguin_texture.png");
    }

    @Override
    public RenderLayer getRenderType(PenguinEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(1f, 1f, 1f);
        if(animatable.isBaby()) {
            stack.scale(0.4f, 0.4f, 0.4f);
        }

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
