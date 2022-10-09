package com.developerpop.redstoneequipment.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class RedstoneEquipmentCreativeModeTab {
    public static final CreativeModeTab REDSTONE_EQUIPMENT = new CreativeModeTab("redstone_equipment") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(RedstoneEquipmentModItems.REDSTONE_INGOT.get());
        }
    };
}
