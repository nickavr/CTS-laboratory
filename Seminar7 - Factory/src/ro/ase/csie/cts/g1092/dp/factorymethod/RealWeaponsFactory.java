package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactry.*;

public class RealWeaponsFactory extends AbstractWeaponsFactory{
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String description) {
        AbstractWeapon weapon = null;
        switch (type){
            case PISTOL:
                weapon = new Pistol(description, 100);
                break;
            case MACHINE_GUN:
                weapon = new MachineGun(description, 500, 1000);
                break;
            case BAZOOKA:
                weapon = new Bazooka(description);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return weapon;
    }
}
