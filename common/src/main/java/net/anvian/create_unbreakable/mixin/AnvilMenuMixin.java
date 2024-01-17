package net.anvian.create_unbreakable.mixin;

import net.anvian.create_unbreakable.item.ModItem;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.inventory.*;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.enchantment.Enchantments;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;

@Mixin(AnvilMenu.class)
abstract class AnvilMenuMixin extends ItemCombinerMenu {
    @Shadow
    @Final
    private DataSlot cost;

    public AnvilMenuMixin(@Nullable MenuType<?> type, int containerId, Inventory playerInventory, ContainerLevelAccess access) {
        super(type, containerId, playerInventory, access);
    }

    @Inject(method = "createResult", at = @At("HEAD"), cancellable = true)
    private void inject(CallbackInfo info){
        ItemStack itemStack1 = this.inputSlots.getItem(0).copy();
        ItemStack itemStack2 = this.inputSlots.getItem(1);
        if (itemStack1.isDamageableItem() && itemStack2.is(ModItem.IRROMOLDING.get())){
            int unbreakingLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.UNBREAKING, itemStack1);
            int mendingLevel = EnchantmentHelper.getItemEnchantmentLevel(Enchantments.MENDING, itemStack1);
            if (unbreakingLevel == 0 && mendingLevel == 0){
                this.cost.set(10);

                CompoundTag nbt = itemStack1.getOrCreateTag();
                nbt.putBoolean("Unbreakable", true);
                itemStack1.setTag(nbt);
                itemStack1.setDamageValue(0);

                this.resultSlots.setItem(0, itemStack1);
                broadcastChanges();
                info.cancel();
            }
        }

        Map<Enchantment, Integer> enchantment = EnchantmentHelper.getEnchantments(itemStack2);
        boolean mending = enchantment.containsKey(Enchantments.MENDING);
        boolean unbreaking = enchantment.containsKey(Enchantments.UNBREAKING);
        if (itemStack1.hasTag() && itemStack1.getTag().getBoolean("Unbreakable") && (mending || unbreaking)){
            this.resultSlots.setItem(0, ItemStack.EMPTY);
            this.cost.set(0);

            broadcastChanges();
            info.cancel();
        }
    }
}