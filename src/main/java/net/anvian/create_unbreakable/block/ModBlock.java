package net.anvian.create_unbreakable.block;

import com.tterrag.registrate.util.entry.BlockEntry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.minecraft.world.level.block.Block;

public class ModBlock {
	static {
		CreateUnbreakableToolsMod.REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsMod.TAB);
	}

	public static final BlockEntry<Block> ETERNAL_PIECE_BLOCK = CreateUnbreakableToolsMod.REGISTRATE.block("eternal_piece_block", Block::new)
			.properties(p -> p.strength(5.0F, 6.0F))
			.simpleItem()
			.register();

	public static final BlockEntry<Block> ETERNAL_ORB_BLOCK = CreateUnbreakableToolsMod.REGISTRATE.block("eternal_orb_block", Block::new)
			.properties(p -> p.strength(5.0F, 6.0F))
			.simpleItem()
			.register();

	public static void register(){}
}
