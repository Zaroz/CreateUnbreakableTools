package net.anvian.create_unbreakable;

import com.simibubi.create.Create;
import io.github.fabricators_of_create.porting_lib.util.ItemGroupUtil;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.anvian.create_unbreakable.item.tab.ModCreativeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreateUnbreakableToolsCommon {
    public static final String ID = "create_unbreakable";
    public static final String NAME = "Create Unbreakable Tools";
    public static final Logger LOGGER = LoggerFactory.getLogger(NAME);
    public static final CreativeModeTab TAB = new ModCreativeTab(ItemGroupUtil.expandArrayAndGetId(), ID);

    public static void init() {
        ModItem.register();
        ModBlock.register();

        LOGGER.info("{} initializing! Create version: {} on| platform: {}", NAME, Create.VERSION, CreateUnbreakableToolsPlatform.platformName());
    }

    public static ResourceLocation id(String path) {
        return new ResourceLocation(ID, path);
    }
}
