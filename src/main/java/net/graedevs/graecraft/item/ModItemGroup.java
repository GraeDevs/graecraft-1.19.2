package net.graedevs.graecraft.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.graedevs.graecraft.Graecraft;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup GRAECRAFT = FabricItemGroupBuilder.build(
            new Identifier(Graecraft.MOD_ID, "graecraft"), () -> new ItemStack(ModItems.COOKED_RACCOON));
}

