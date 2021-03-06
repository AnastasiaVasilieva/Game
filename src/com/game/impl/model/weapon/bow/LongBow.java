package com.game.impl.model.weapon.bow;

import com.game.api.model.weapon.Weapon;
import com.game.api.model.weapon.WeaponType;

public class LongBow extends Weapon{
	
	private int attack = 8;
	
	public int getAttack() {
		return attack;
	}

	public void setAttack(int attack) {
		this.attack = attack;
	}

	@Override
	public WeaponType getWeaponType() {
		
		return WeaponType.BOW;
	}

}
