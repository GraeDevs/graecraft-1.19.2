package net.graedevs.graecraft.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.graedevs.graecraft.Graecraft;
import net.graedevs.graecraft.entity.custom.PenguinEntity;
import net.graedevs.graecraft.entity.custom.RaccoonEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {

    public static final EntityType<RaccoonEntity> RACCOON = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Graecraft.MOD_ID, "raccoon"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, RaccoonEntity::new)
                    .dimensions(EntityDimensions.fixed( 0.4f, 0.5f)).build());

    public static final EntityType<PenguinEntity> PENGUIN = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Graecraft.MOD_ID, "penguin"),
            FabricEntityTypeBuilder.create(SpawnGroup.AMBIENT, PenguinEntity::new)
                    .dimensions(EntityDimensions.fixed( 0.4f, 0.5f)).build());

}
