package net.anvian.create_unbreakable.item.tab;

import org.jetbrains.annotations.NotNull;

import net.anvian.create_unbreakable.item.ModItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeTab extends CreativeModeTab {
	public ModCreativeTab(int id, String langId) {
		super(id, langId);
	}

	@Override
	public @NotNull ItemStack makeIcon() {
		return new ItemStack(ModItem.ETERNAL_MODIFIER.get());
	}
}
