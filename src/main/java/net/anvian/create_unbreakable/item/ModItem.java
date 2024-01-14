package net.anvian.create_unbreakable.item;

import com.tterrag.registrate.util.entry.ItemEntry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.item.custom.EternalItem;

public class ModItem {
	static {
		CreateUnbreakableToolsMod.REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsMod.TAB);
	}

	public static final ItemEntry<EternalItem> ETERNAL_MODIFIER = CreateUnbreakableToolsMod.REGISTRATE.item("eternal_modifier",
			(p -> new EternalItem(p, 1))).register();

	public static final ItemEntry<EternalItem> ETERNAL_PIECE = CreateUnbreakableToolsMod.REGISTRATE.item("eternal_piece",
			(p -> new EternalItem(p, 64))).register();

	public static final ItemEntry<EternalItem> ETERNAL_ORB = CreateUnbreakableToolsMod.REGISTRATE.item("eternal_orb",
			(p -> new EternalItem(p, 64))).register();

	public static void register(){}
}
