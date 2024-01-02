package net.anvian.create_unbreakable.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DigDurabilityEnchantment;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

@Mixin(DigDurabilityEnchantment.class)
public class DigDurabilityEnchantmentMixin extends Enchantment {
	protected DigDurabilityEnchantmentMixin(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] applicableSlots) {
		super(rarity, category, applicableSlots);
	}

	@Inject(method = "canEnchant", at = @At(value = "HEAD"), cancellable = true)
	private void dontAcceptUnbreakableItems(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(stack.getTag() != null && !stack.getTag().getBoolean("Unbreakable"));
	}
}
