/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minions.init;

import net.neoforged.neoforge.registries.DeferredRegister;
import net.neoforged.neoforge.registries.DeferredItem;

import net.minecraft.world.item.Item;

import net.mcreator.minions.item.MinionoreItem;
import net.mcreator.minions.MinionsMod;

import java.util.function.Function;

public class MinionsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinionsMod.MODID);
	public static final DeferredItem<Item> MINIONORE = register("minionore", MinionoreItem::new);

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}