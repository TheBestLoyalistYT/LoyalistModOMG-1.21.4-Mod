package net.thebestloyalist.somemod.item;

import com.nimbusds.oauth2.sdk.id.Identifier;
import net.fabricmc.fabric.api.item.v1.FabricItem;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.thebestloyalist.somemod.LoyalistMod;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(LoyalistMod.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LoyalistMod.LOGGER.info("Registering Mod Items for " + LoyalistMod.MOD_ID);

    }
}
