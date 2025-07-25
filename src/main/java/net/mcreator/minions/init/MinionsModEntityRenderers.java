/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.minions.init;

import net.mcreator.minions.client.renderer.MinionRenderer;

@EventBusSubscriber(bus = EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class MinionsModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(MinionsModEntities.MINION.get(), MinionRenderer::new);
	}
}