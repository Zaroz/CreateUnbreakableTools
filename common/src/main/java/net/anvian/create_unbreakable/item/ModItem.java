package net.anvian.create_unbreakable.item;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.item.custom.EternalItem;
import net.anvian.create_unbreakable.item.tab.ModGroup;

public class ModItem {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsMod.MOD_ID);

    static {
        REGISTRATE.creativeModeTab(() -> ModGroup.GROUP);
    }

    public static final ItemEntry<EternalItem> ETERNAL_MODIFIER = REGISTRATE.item("eternal_modifier",
            (p -> new EternalItem(p, 1))).register();

    public static final ItemEntry<EternalItem> ETERNAL_PIECE = REGISTRATE.item("eternal_piece",
            (p -> new EternalItem(p, 64))).register();

    public static final ItemEntry<EternalItem> ETERNAL_ORB = REGISTRATE.item("eternal_orb",
            (p -> new EternalItem(p, 64))).register();

    public static void init() {
        CreateUnbreakableToolsMod.LOGGER.info("Registering items for " + CreateUnbreakableToolsMod.NAME);
    }
}
