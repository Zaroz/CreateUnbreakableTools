package net.anvian.create_unbreakable.forge;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.anvian.create_unbreakable.item.tab.ModGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(CreateUnbreakableToolsMod.MOD_ID)
public class CreateUnbreakableToolsForge {
    public CreateUnbreakableToolsForge() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();
        ModGroup.REGISTRATE.registerEventListeners(eventBus);
        ModItem.REGISTRATE.registerEventListeners(eventBus);
        ModBlock.REGISTRATE.registerEventListeners(eventBus);
        CreateUnbreakableToolsMod.init();
    }
}
