package net.graedevs.graecraft.entity.client;

import net.graedevs.graecraft.Graecraft;
import net.graedevs.graecraft.entity.custom.PenguinEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class PenguinModel extends AnimatedGeoModel<PenguinEntity> {
    @Override
    public Identifier getModelResource(PenguinEntity object) {
        return new Identifier(Graecraft.MOD_ID, "geo/penguin.geo.json");
    }

    @Override
    public Identifier getTextureResource(PenguinEntity object) {
        return new Identifier(Graecraft.MOD_ID, "textures/entity/penguin_texture.png");
    }

    @Override
    public Identifier getAnimationResource(PenguinEntity animatable) {
        return new Identifier(Graecraft.MOD_ID, "animations/penguin.animation.json");
    }
}
