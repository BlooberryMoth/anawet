package com.thatgalblu.anawet.item;

import com.thatgalblu.anawet.ANAWET;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;

public class ItemsGen {
    public static final Item IRON_WRENCH = registerItem("iron_wrench", new Item(new FabricItemSettings()), null);
    public static final Item STEEL_WRENCH = registerItem("steel_wrench", new Item(new FabricItemSettings()), null);

    private static Item registerItem(String name, Item item, RegistryKey<ItemGroup> group) {
        Item registeredItem = Registry.register(Registries.ITEM, new Identifier(ANAWET.MOD_ID, name), item);
        if (group != null) ItemGroupEvents.modifyEntriesEvent(group).register((e) -> e.add(registeredItem));
        return registeredItem;
    }

    public static void registerItems() {
        ANAWET.LOG.info("Gathering all the tools...");
    }
}
