package net.anvian.create_unbreakable.item.custom;

import net.minecraft.tags.DamageTypeTags;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Rarity;

public class EternalItem extends Item {
    public EternalItem(Properties properties, int amount) {
        super(properties.rarity(Rarity.RARE).stacksTo(amount));
    }

    @Override
    public boolean hurtEnemy(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        return false;
    }

    @Override
    public boolean canBeHurtBy(DamageSource damageSource) {
        return !damageSource.is(DamageTypeTags.IS_FIRE) || !damageSource.is(DamageTypeTags.IS_EXPLOSION);
    }
}
