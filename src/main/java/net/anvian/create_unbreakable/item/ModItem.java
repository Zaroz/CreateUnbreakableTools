package net.anvian.create_unbreakable.item;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModItem {
	static {
		CreateUnbreakableToolsMod.REGISTRATE.creativeModeTab(() ->CreateUnbreakableToolsMod.TAB);
	}

	public static final ItemEntry<Item> UNBREAKABLE_GEM = CreateUnbreakableToolsMod.REGISTRATE.item("unbreakable_gem", Item::new)
			.properties(p -> p.rarity(Rarity.RARE))
			.properties(p -> p.stacksTo(1))
			.register();

	public static void register(){}
}
