package net.graedevs.graecraft.util;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.graedevs.graecraft.entity.custom.PenguinEntity;
import net.graedevs.graecraft.entity.custom.RaccoonEntity;
import net.minecraft.entity.mob.MobEntity;
import net.graedevs.graecraft.entity.ModEntities;

public class MobAttributes {
    public static void init() {
        FabricDefaultAttributeRegistry.register(ModEntities.RACCOON, RaccoonEntity.createMobAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.PENGUIN, PenguinEntity.createMobAttributes());
    }
}
