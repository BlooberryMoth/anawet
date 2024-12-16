package com.thatgalblu.anawet.block;

import com.thatgalblu.anawet.ANAWET;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class BlocksGen {
    public static final Block SHELF = registerBlock("shelf",
            new Block(FabricBlockSettings.create()
                    .sounds(BlockSoundGroup.WOOD)
                    .strength(.5f)
                    .nonOpaque()));

    public static final Block WALL_SHELF = registerBlock("wall_shelf",
            new Block(FabricBlockSettings.copyOf(SHELF)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(ANAWET.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(ANAWET.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerBlocks() {
        ANAWET.LOG.info("Flipping all the power switches...");
    }
}
