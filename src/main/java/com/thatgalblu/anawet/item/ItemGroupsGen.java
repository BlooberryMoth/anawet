package com.thatgalblu.anawet.item;

import com.thatgalblu.anawet.ANAWET;
import com.thatgalblu.anawet.block.BlocksGen;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroupsGen {
    public static final ItemGroup ANAWETIG = Registry.register(Registries.ITEM_GROUP,
            new Identifier(ANAWET.MOD_ID, "anawetitemgroup"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.anawet"))
                    .icon(() -> new ItemStack(ItemsGen.STEEL_WRENCH)).entries((displayContext, entries) -> {
                        entries.add(ItemsGen.STEEL_INGOT);
                        entries.add(ItemsGen.COPPER_WRENCH);
                        entries.add(ItemsGen.IRON_WRENCH);
                        entries.add(ItemsGen.STEEL_WRENCH);
                        entries.add(BlocksGen.SHELF);
                    }).build());

    public static void registerItemGroups() {
        ANAWET.LOG.info("Getting the toolbox...");
    }
}
