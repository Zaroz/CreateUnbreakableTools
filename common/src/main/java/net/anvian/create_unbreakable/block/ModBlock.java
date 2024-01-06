package net.anvian.create_unbreakable.block;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.anvian.create_unbreakable.CreateUnbreakableToolsCommon;
import net.minecraft.world.level.block.Block;

public class ModBlock {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsCommon.ID);

    static {
        REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsCommon.TAB);
    }

    public static final BlockEntry<Block> ETERNAL_PIECE_BLOCK = REGISTRATE.block("eternal_piece_block", Block::new)
            .properties(p -> p.strength(5.0F, 6.0F))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ETERNAL_ORB_BLOCK = REGISTRATE.block("eternal_orb_block", Block::new)
            .properties(p -> p.strength(5.0F, 6.0F))
            .simpleItem()
            .register();

    public static void register(){

    }
}