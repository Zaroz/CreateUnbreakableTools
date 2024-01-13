package net.anvian.create_unbreakable.mixin;

import org.spongepowered.asm.mixin.Mixin;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.MendingEnchantment;

@Mixin(MendingEnchantment.class)
public class MendingEnchantmentMixin extends Enchantment {
	protected MendingEnchantmentMixin(Rarity rarity, EnchantmentCategory category, EquipmentSlot[] applicableSlots) {
		super(rarity, category, applicableSlots);
	}

	@Override
	public boolean canEnchant(ItemStack stack) {
		return stack.getTag() !=null && !stack.getTag().getBoolean("Unbreakable");
	}
}
