package net.anvian.create_unbreakable.item;

import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.ItemEntry;
import net.anvian.create_unbreakable.CreateUnbreakableToolsCommon;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ModItem {
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(CreateUnbreakableToolsCommon.ID);


    static {
        REGISTRATE.creativeModeTab(() -> CreateUnbreakableToolsCommon.TAB);
    }

    public static final ItemEntry<Item> ETERNAL_MODIFIER = REGISTRATE.item("eternal_modifier", Item::new)
            .properties(p -> p.rarity(Rarity.RARE).stacksTo(1))
            .register();

    public static final ItemEntry<Item> ETERNAL_PIECE = REGISTRATE.item("eternal_piece", Item::new)
            .properties(p -> p.rarity(Rarity.RARE))
            .register();

    public static final ItemEntry<Item> ETERNAL_ORB = REGISTRATE.item("eternal_orb", Item::new)
            .properties(p -> p.rarity(Rarity.RARE))
            .register();

    public static void register(){}
}