package net.graedevs.graecraft;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.graedevs.graecraft.entity.ModEntities;
import net.graedevs.graecraft.entity.client.PenguinRenderer;
import net.graedevs.graecraft.entity.client.RaccoonRenderer;

public class GraecraftClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.RACCOON, RaccoonRenderer::new);
        EntityRendererRegistry.register(ModEntities.PENGUIN, PenguinRenderer::new);
    }
}
