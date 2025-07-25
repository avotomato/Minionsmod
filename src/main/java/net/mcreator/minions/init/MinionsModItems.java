/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minions.init;

import net.mcreator.minions.MinionsMod;

import java.util.function.Function;

public class MinionsModItems {
	public static final DeferredRegister.Items REGISTRY = DeferredRegister.createItems(MinionsMod.MODID);
	public static final DeferredItem<Item> MINION_SPAWN_EGG = register("minion_spawn_egg", properties -> new SpawnEggItem(MinionsModEntities.MINION.get(), properties));

	// Start of user code block custom items
	// End of user code block custom items
	private static <I extends Item> DeferredItem<I> register(String name, Function<Item.Properties, ? extends I> supplier) {
		return REGISTRY.registerItem(name, supplier, new Item.Properties());
	}
}