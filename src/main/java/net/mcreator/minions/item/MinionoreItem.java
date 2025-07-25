package net.mcreator.minions.item;

import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;

public class MinionoreItem extends Item {
	public MinionoreItem(Item.Properties properties) {
		super(properties.rarity(Rarity.UNCOMMON).stacksTo(69));
	}

	@Override
	public float getDestroySpeed(ItemStack itemstack, BlockState state) {
		return 1.55f;
	}
}