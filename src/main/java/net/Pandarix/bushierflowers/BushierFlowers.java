package net.Pandarix.bushierflowers;

import net.Pandarix.bushierflowers.block.ModBlocks;
import net.Pandarix.bushierflowers.item.ModItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BushierFlowers implements ModInitializer {
	public static final String MOD_ID = "bushierflowers";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModItems.registerModItems();
	}
}
