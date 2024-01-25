package net.anvian.create_unbreakable.fabric.registry;

import net.anvian.create_unbreakable.CreateUnbreakableToolsMod;
import net.anvian.create_unbreakable.block.ModBlock;
import net.anvian.create_unbreakable.item.ModItem;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;

public class ModGroup {
    public static void register(){
        ResourceKey<CreativeModeTab> tab = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(CreateUnbreakableToolsMod.MOD_ID, "tab"));
        Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, tab, FabricItemGroup.builder()
                .icon(ModItem.IRROMOLDING::asStack)
                .title(Component.translatable("itemGroup.create_unbreakable"))
                .displayItems((context, entries) -> {
                    entries.accept(ModItem.IRROMOLDING);
                    entries.accept(ModItem.LUMINARCHY);
                    entries.accept(ModItem.PHILOLITE);
                    entries.accept(ModBlock.LUMINARCHY_BLOCK);
                    entries.accept(ModBlock.PHILOLITE_BLOCK);
                })
                .build()
        );
    }
}
