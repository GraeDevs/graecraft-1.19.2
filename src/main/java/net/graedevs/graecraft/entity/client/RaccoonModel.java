package net.graedevs.graecraft.entity.client;

import net.graedevs.graecraft.Graecraft;
import net.graedevs.graecraft.entity.custom.RaccoonEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RaccoonModel extends AnimatedGeoModel<RaccoonEntity> {
    @Override
    public Identifier getModelResource(RaccoonEntity object) {
        return new Identifier(Graecraft.MOD_ID, "geo/raccoon.geo.json");
    }

    @Override
    public Identifier getTextureResource(RaccoonEntity object) {
        return new Identifier(Graecraft.MOD_ID, "textures/entity/raccoon_texture.png");
    }

    @Override
    public Identifier getAnimationResource(RaccoonEntity animatable) {
        return new Identifier(Graecraft.MOD_ID, "animations/raccoon.animation.json");
    }
}
