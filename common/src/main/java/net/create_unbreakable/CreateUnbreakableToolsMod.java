package net.create_unbreakable;

import com.simibubi.create.Create;
import net.create_unbreakable.block.ModBlock;
import net.create_unbreakable.item.ModItem;
import net.create_unbreakable.item.tab.ModGroup;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateUnbreakableToolsMod {
    public static final String MOD_ID = "create_unbreakable";
    public static final String NAME = "Create Unbreakable Tools Mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);

    public static void init() {
        LOGGER.info("{} initializing! Create version: {} on platform: {}", NAME, Create.VERSION, CreateUnbreakableToolsPlatform.platformName());
        ModGroup.register();
        ModItem.init();
        ModBlock.init();
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(MOD_ID, path);
    }
}
