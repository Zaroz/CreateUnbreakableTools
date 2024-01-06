package net.anvian.create_unbreakable.item.tab;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import org.jetbrains.annotations.NotNull;

public class ModCreativeTab extends CreativeModeTab {
    public ModCreativeTab(int id, String langId) {
        super(id, langId);
    }

    @Override
    public @NotNull ItemStack makeIcon() {
        return new ItemStack(Items.DIAMOND);
    }
}
