package com.developerpop.redstoneequipment.item;

import com.developerpop.redstoneequipment.RedstoneEquipmentMain;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class RedstoneEquipmentModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, RedstoneEquipmentMain.MOD_ID);

    public static final RegistryObject<Item> REDSTONE_INGOT = ITEMS.register("redstone_ingot", () -> new Item(new Item.Properties().tab(RedstoneEquipmentCreativeModeTab.REDSTONE_EQUIPMENT)));

    public static final RegistryObject<Item> REDSTONE_HELMET = ITEMS.register("redstone_helmet", () -> new ArmorItem(RedstoneEquipmentModArmorMaterials.REDSTONE, EquipmentSlot.HEAD, new Item.Properties().tab(RedstoneEquipmentCreativeModeTab.REDSTONE_EQUIPMENT)));
    public static final RegistryObject<Item> REDSTONE_CHESTPLATE = ITEMS.register("redstone_chestplate", () -> new ArmorItem(RedstoneEquipmentModArmorMaterials.REDSTONE, EquipmentSlot.CHEST, new Item.Properties().tab(RedstoneEquipmentCreativeModeTab.REDSTONE_EQUIPMENT)));
    public static final RegistryObject<Item> REDSTONE_LEGGINGS = ITEMS.register("redstone_leggings", () -> new ArmorItem(RedstoneEquipmentModArmorMaterials.REDSTONE, EquipmentSlot.LEGS, new Item.Properties().tab(RedstoneEquipmentCreativeModeTab.REDSTONE_EQUIPMENT)));
    public static final RegistryObject<Item> REDSTONE_BOOTS = ITEMS.register("redstone_boots", () -> new ArmorItem(RedstoneEquipmentModArmorMaterials.REDSTONE, EquipmentSlot.FEET, new Item.Properties().tab(RedstoneEquipmentCreativeModeTab.REDSTONE_EQUIPMENT)));

    public static void register(IEventBus eventBus) { ITEMS.register(eventBus); }
}
