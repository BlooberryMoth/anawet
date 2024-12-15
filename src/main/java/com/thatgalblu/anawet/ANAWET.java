package com.thatgalblu.anawet;

import com.thatgalblu.anawet.block.BlocksGen;
import com.thatgalblu.anawet.item.ItemGroupsGen;
import com.thatgalblu.anawet.item.ItemsGen;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ANAWET implements ModInitializer {
	public static final String MOD_ID = "anawet";
	public static final Logger LOG = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ItemGroupsGen.registerItemGroups();

		ItemsGen.registerItems();
		BlocksGen.registerBlocks();
	}
}