package net.graedevs.graecraft.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.graedevs.graecraft.Graecraft;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item RAW_RACCOON = registerItem("raw_raccoon",
            new Item(new FabricItemSettings().group(ModItemGroup.GRAECRAFT)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(2f).build())));
    public static final Item COOKED_RACCOON = registerItem("cooked_raccoon",
            new Item(new FabricItemSettings().group(ModItemGroup.GRAECRAFT)
                    .food(new FoodComponent.Builder().hunger(2).saturationModifier(2f).build())));




    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Graecraft.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Graecraft.LOGGER.debug("Registering mod items for " + Graecraft.MOD_ID);
    }
}
