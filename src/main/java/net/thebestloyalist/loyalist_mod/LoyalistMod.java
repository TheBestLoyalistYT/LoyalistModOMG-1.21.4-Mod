package net.thebestloyalist.loyalist_mod;

import net.fabricmc.api.ModInitializer;

import net.thebestloyalist.loyalist_mod.block.ModBlocks;
import net.thebestloyalist.loyalist_mod.item.ModItems;
import net.thebestloyalist.loyalist_mod.world.gen.ModWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoyalistMod implements ModInitializer {
	    public static final String MOD_ID = "loyalist_mod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		ModWorldGeneration.generateModWorldGen();
	}
}