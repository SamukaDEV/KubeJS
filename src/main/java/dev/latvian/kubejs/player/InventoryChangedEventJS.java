package dev.latvian.kubejs.player;

import dev.latvian.kubejs.entity.EntityJS;
import dev.latvian.kubejs.item.ItemStackJS;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.ItemStack;

/**
 * @author LatvianModder
 */
public class InventoryChangedEventJS extends PlayerEventJS
{
	private final ServerPlayerEntity player;
	private final ItemStack item;
	private final int slot;

	public InventoryChangedEventJS(ServerPlayerEntity p, ItemStack is, int s)
	{
		player = p;
		item = is;
		slot = s;
	}

	@Override
	public EntityJS getEntity()
	{
		return entityOf(player);
	}

	public ItemStackJS getItem()
	{
		return ItemStackJS.of(item);
	}

	public int getSlot()
	{
		return slot;
	}
}