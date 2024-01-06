package net.anvian.create_unbreakable.fabric;

import io.github.fabricators_of_create.porting_lib.util.EnvExecutor;
import net.anvian.create_unbreakable.CreateUnbreakableToolsCommon;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.fabricmc.api.ModInitializer;

public class CreateUnbreakableToolsFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        CreateUnbreakableToolsCommon.init();
        CreateUnbreakableToolsCommon.LOGGER.info(EnvExecutor.unsafeRunForDist(
                () -> () -> "{} is accessing Porting Lib on a Fabric client!",
                () -> () -> "{} is accessing Porting Lib on a Fabric server!"
                ), CreateUnbreakableToolsCommon.NAME);
        ModItem.REGISTRATE.register();
        ModBlock.REGISTRATE.register();

    }
}
