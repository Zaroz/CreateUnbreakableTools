package net.anvian.create_unbreakable.block;

import com.tterrag.registrate.util.entry.BlockEntry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.custom.OrbBlock;
import net.anvian.create_unbreakable.block.custom.PieceBlock;

@SuppressWarnings("unused")
public class ModBlock {
	static {
		CreateUnbreakableToolsMod.REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsMod.TAB);
	}

	public static final BlockEntry<PieceBlock> ETERNAL_PIECE_BLOCK = CreateUnbreakableToolsMod.REGISTRATE.block(
			"eternal_piece_block", PieceBlock::new)
			.simpleItem()
			.register();

	public static final BlockEntry<OrbBlock> ETERNAL_ORB_BLOCK = CreateUnbreakableToolsMod.REGISTRATE.block(
			"eternal_orb_block", OrbBlock::new)
			.simpleItem()
			.register();

	public static void register(){}
}
