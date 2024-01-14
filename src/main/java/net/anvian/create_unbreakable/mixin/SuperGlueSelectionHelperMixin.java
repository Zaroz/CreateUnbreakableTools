package net.anvian.create_unbreakable.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import com.simibubi.create.content.contraptions.glue.SuperGlueSelectionHelper;

import net.minecraft.core.NonNullList;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

@Mixin(SuperGlueSelectionHelper.class)
public class SuperGlueSelectionHelperMixin {
	@Inject(method = "collectGlueFromInventory", at = @At("RETURN"), cancellable = true)
	private static void collectGlueFromInventory(Player player, int requiredAmount, boolean simulate, CallbackInfoReturnable<Boolean> cir) {
		NonNullList<ItemStack> items = player.getInventory().items;
		for (int i = -1; i < items.size(); i++) {
			int slot = i == -1 ? player.getInventory().selected : i;
			ItemStack stack = items.get(slot);

			if (stack.hasTag() && stack.getTag().getBoolean("Unbreakable")) {
				cir.setReturnValue(true);
				return;
			}
		}
	}
}
