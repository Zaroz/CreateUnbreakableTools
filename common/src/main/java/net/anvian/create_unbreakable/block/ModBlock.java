package net.anvian.create_unbreakable.block;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.custom.EternalBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.anvian.create_unbreakable.item.tab.ModGroup;

public class ModBlock {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsMod.MOD_ID);

    static {
        REGISTRATE.creativeModeTab(() -> ModGroup.GROUP);
    }

    public static final BlockEntry<EternalBlock> ETERNAL_PIECE_BLOCK = REGISTRATE.block("eternal_piece_block",
                    (p) -> new EternalBlock(p, ModItem.ETERNAL_PIECE.get()))
            .properties(p -> p.strength(5.0F, 6.0F))
            .simpleItem()
            .register();

    public static final BlockEntry<EternalBlock> ETERNAL_ORB_BLOCK = REGISTRATE.block("eternal_orb_block",
                    (p) -> new EternalBlock(p, ModItem.ETERNAL_ORB.get()))
            .properties(p -> p.strength(5.0F, 6.0F))
            .simpleItem()
            .register();

    public static void init() {
        CreateUnbreakableToolsMod.LOGGER.info("Registering blocks for " + CreateUnbreakableToolsMod.NAME);
    }
}
