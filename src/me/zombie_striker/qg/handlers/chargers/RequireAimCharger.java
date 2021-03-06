package me.zombie_striker.qg.handlers.chargers;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

import me.zombie_striker.qg.ammo.AmmoUtil;
import me.zombie_striker.qg.api.QualityArmory;
import me.zombie_striker.qg.guns.Gun;

public class RequireAimCharger implements ChargingHandler {

public RequireAimCharger() {
	ChargingManager.add(this);
}
	@Override
	public boolean isCharging(Player player) {
		return false;
	}

	@SuppressWarnings("deprecation")
	@Override
	public boolean shoot(Gun g, final Player player, ItemStack stack) {
		if(QualityArmory.isIronSights(player.getItemInHand())) {
			return true;
		}
		AmmoUtil.addAmmo(player, g.getAmmoType(), 1);
		return false;
	}


	@Override
	public String getName() {

		return ChargingManager.REQUIREAIM;
	}

}
