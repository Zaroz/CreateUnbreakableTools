package net.anvian.create_unbreakable.mixin;

import net.minecraft.util.RandomSource;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.DigDurabilityEnchantment;

import net.minecraft.world.item.enchantment.Enchantment;

import net.minecraft.world.item.enchantment.EnchantmentCategory;

import net.minecraft.world.item.enchantment.MendingEnchantment;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(DigDurabilityEnchantment.class)
public class DigDurabilityEnchantmentMixin extends Enchantment {
	protected DigDurabilityEnchantmentMixin(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] applicableSlots) {
		super(rarity, category, applicableSlots);
	}

	@Override
	protected boolean checkCompatibility(Enchantment other) {
		return !(other instanceof MendingEnchantment) && super.checkCompatibility(other);
	}

	@Inject(method = "canEnchant", at = @At(value = "HEAD"), cancellable = true)
	private void dontAcceptUnbreakableItems(ItemStack stack, CallbackInfoReturnable<Boolean> cir) {
		cir.setReturnValue(stack.getTag() != null && !stack.getTag().getBoolean("Unbreakable"));
	}

	@Inject(method = "shouldIgnoreDurabilityDrop", at = @At(value = "HEAD"), cancellable = true)
	private static void makeUnbreakable(ItemStack stack, int level, RandomSource random, CallbackInfoReturnable<Boolean> cir) {
		stack.setDamageValue(0);
		cir.setReturnValue(true);
	}
}
