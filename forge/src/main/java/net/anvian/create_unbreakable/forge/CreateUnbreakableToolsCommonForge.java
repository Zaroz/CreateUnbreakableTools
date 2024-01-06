package net.anvian.create_unbreakable.forge;

import net.anvian.create_unbreakable.CreateUnbreakableToolsCommon;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateUnbreakableToolsCommon.ID)
public class CreateUnbreakableToolsCommonForge {
    public CreateUnbreakableToolsCommonForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModItem.REGISTRATE.registerEventListeners(eventBus);
        ModBlock.REGISTRATE.registerEventListeners(eventBus);
        CreateUnbreakableToolsCommon.init();
    }
}
