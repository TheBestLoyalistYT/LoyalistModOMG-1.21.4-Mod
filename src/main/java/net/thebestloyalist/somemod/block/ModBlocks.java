package net.thebestloyalist.somemod.block;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.thebestloyalist.somemod.LoyalistMod;

public class ModBlocks {

    public static final Block FRIE_BLOCK = registerBlock("frie_block",
             new Block(AbstractBlock.Settings.create().strength(1f)
                     .sounds(BlockSoundGroup.WOOL)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(LoyalistMod.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(LoyalistMod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        LoyalistMod.LOGGER.info("Registering Mod Blocks for " + LoyalistMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.FRIE_BLOCK);
        });
    ;}
}
