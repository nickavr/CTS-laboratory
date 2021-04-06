package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactry.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactry.WeaponType;

public abstract class AbstractWeaponsFactory {

    public abstract AbstractWeapon getWeapon(WeaponType type, String desc);
}
