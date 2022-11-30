package net.graedevs.graecraft;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.graedevs.graecraft.entity.ModEntities;
import net.graedevs.graecraft.entity.custom.RaccoonEntity;
import net.graedevs.graecraft.item.ModItems;
import net.graedevs.graecraft.util.MobAttributes;
import net.graedevs.graecraft.world.gen.ModWorldGen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import software.bernie.geckolib3.GeckoLib;

public class Graecraft implements ModInitializer {

	public static final String MOD_ID = "graecraft";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModWorldGen.generateWorldGen();
		MobAttributes.init();

		GeckoLib.initialize();
	}
}
