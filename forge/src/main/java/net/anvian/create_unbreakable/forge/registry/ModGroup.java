package net.anvian.create_unbreakable.forge.registry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = CreateUnbreakableToolsMod.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModGroup {
    private ModGroup() {}

    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateUnbreakableToolsMod.MOD_ID);
    static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.create_unbreakable"))
            .icon(ModItem.IRROMOLDING::asStack)
            .displayItems((context, entries) -> {
                entries.accept(ModItem.IRROMOLDING);
                entries.accept(ModItem.LUMINARCHY);
                entries.accept(ModItem.PHILOLITE);
                entries.accept(ModBlock.LUMINARCHY_BLOCK);
                entries.accept(ModBlock.PHILOLITE_BLOCK);
            })
            .build());
}
