package net.thebestloyalist.somemod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.component.type.FoodComponent;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.thebestloyalist.somemod.LoyalistMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.w3c.dom.Text;

import java.util.List;

public class ModItems {

    public static final Item FRIES = registerItem("fries", new Item(new Item.Settings()
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(LoyalistMod.MOD_ID, "fries"))).food(ModFoodComponents.FRIES)) {

    });

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(LoyalistMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        LoyalistMod.LOGGER.info("Registering Mod Items for " + LoyalistMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(fabricItemGroupEntries ->{
           fabricItemGroupEntries.add(FRIES);
        });
    }
}