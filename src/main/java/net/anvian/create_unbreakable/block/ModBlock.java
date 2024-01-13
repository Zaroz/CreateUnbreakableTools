package net.anvian.create_unbreakable.block;

import com.tterrag.registrate.util.entry.BlockEntry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.custom.EternalBlock;
import net.anvian.create_unbreakable.item.ModItem;

@SuppressWarnings("unused")
public class ModBlock {
	static {
		CreateUnbreakableToolsMod.REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsMod.TAB);
	}

	public static final BlockEntry<EternalBlock> ETERNAL_PIECE_BLOCK = CreateUnbreakableToolsMod.REGISTRATE.block("eternal_piece_block",
					(p) -> new EternalBlock(p, ModItem.ETERNAL_PIECE.asStack()))
			.properties(p -> p.strength(5.0F, 6.0F))
			.simpleItem()
			.register();

	public static final BlockEntry<EternalBlock> ETERNAL_ORB_BLOCK = CreateUnbreakableToolsMod.REGISTRATE.block("eternal_orb_block",
					(p) -> new EternalBlock(p, ModItem.ETERNAL_ORB.asStack()))
			.properties(p -> p.strength(5.0F, 6.0F))
			.simpleItem()
			.register();

	public static void register(){}
}
