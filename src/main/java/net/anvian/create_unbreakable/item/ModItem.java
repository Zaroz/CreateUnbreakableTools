package net.anvian.create_unbreakable.item;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModItem {
	static {
		CreateUnbreakableToolsMod.REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsMod.TAB);
	}

	public static final ItemEntry<Item> ETERNAL_MODIFIER = CreateUnbreakableToolsMod.REGISTRATE.item("eternal_modifier", Item::new)
			.properties(p -> p.rarity(Rarity.RARE).stacksTo(1))
			.register();

	public static final ItemEntry<Item> ETERNAL_PIECE = CreateUnbreakableToolsMod.REGISTRATE.item("eternal_piece", Item::new)
			.properties(p -> p.rarity(Rarity.RARE))
			.register();

	public static final ItemEntry<Item> ETERNAL_ORB = CreateUnbreakableToolsMod.REGISTRATE.item("eternal_orb", Item::new)
			.properties(p -> p.rarity(Rarity.RARE))
			.register();

	public static void register(){}
}
