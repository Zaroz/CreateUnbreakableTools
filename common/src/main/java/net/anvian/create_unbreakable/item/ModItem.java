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

    public static final ItemEntry<EternalItem> IRROMOLDING = REGISTRATE.item("irromolding",
            (p -> new EternalItem(p, 1))).register();

    public static final ItemEntry<EternalItem> PHILOLITE = REGISTRATE.item("philolite",
            (p -> new EternalItem(p, 64))).register();

    public static final ItemEntry<EternalItem> LUMINARCHY = REGISTRATE.item("luminarchy",
            (p -> new EternalItem(p, 64))).register();

    public static void init() {
        CreateUnbreakableToolsMod.LOGGER.info("Registering items for " + CreateUnbreakableToolsMod.NAME);
    }
}
