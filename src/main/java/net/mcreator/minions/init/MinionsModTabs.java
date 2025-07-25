/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minions.init;

import net.mcreator.minions.MinionsMod;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD)
public class MinionsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MinionsMod.MODID);

	@SubscribeEvent
	public static void buildTabContentsVanilla(BuildCreativeModeTabContentsEvent tabData) {
		if (tabData.getTabKey() == CreativeModeTabs.SPAWN_EGGS) {
			tabData.accept(MinionsModItems.MINION_SPAWN_EGG.get());
		}
	}
}