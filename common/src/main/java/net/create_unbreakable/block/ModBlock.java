package net.create_unbreakable.block;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.create_unbreakable.CreateUnbreakableToolsMod;
import net.create_unbreakable.item.tab.ModGroup;
import net.minecraft.world.level.block.Block;

public class ModBlock {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsMod.MOD_ID);

    static {
        REGISTRATE.creativeModeTab(() -> ModGroup.GROUP);
    }

    public static final BlockEntry<Block> ETERNAL_PIECE_BLOCK = REGISTRATE.block("eternal_piece_block", Block::new)
            .properties(p -> p.strength(5.0F, 6.0F))
            .simpleItem()
            .register();

    public static final BlockEntry<Block> ETERNAL_ORB_BLOCK = REGISTRATE.block("eternal_orb_block", Block::new)
            .properties(p -> p.strength(5.0F, 6.0F))
            .simpleItem()
            .register();

    public static void init() {
        CreateUnbreakableToolsMod.LOGGER.info("Registering blocks for " + CreateUnbreakableToolsMod.NAME);
    }
}
