package net.anvian.create_unbreakable.mixin;

import org.spongepowered.asm.mixin.Mixin;

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

	@Override
	public boolean canEnchant(ItemStack stack) {
		return stack.getTag() !=null && !stack.getTag().getBoolean("Unbreakable");
	}
}
