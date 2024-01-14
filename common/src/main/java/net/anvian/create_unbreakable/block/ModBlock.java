package net.anvian.create_unbreakable.block;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.custom.OrbBlock;
import net.anvian.create_unbreakable.block.custom.PieceBlock;
import net.anvian.create_unbreakable.item.tab.ModGroup;

@SuppressWarnings("unused")
public class ModBlock {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsMod.MOD_ID);

    static {
        REGISTRATE.creativeModeTab(() -> ModGroup.GROUP);
    }

    public static final BlockEntry<PieceBlock> ETERNAL_PIECE_BLOCK = REGISTRATE.block(
            "eternal_piece_block", PieceBlock::new)
            .simpleItem()
            .register();

    public static final BlockEntry<OrbBlock> ETERNAL_ORB_BLOCK = REGISTRATE.block(
            "eternal_orb_block", OrbBlock::new)
            .simpleItem()
            .register();

    public static void init() {
        CreateUnbreakableToolsMod.LOGGER.info("Registering blocks for " + CreateUnbreakableToolsMod.NAME);
    }
}
