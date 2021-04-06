package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactry.*;

public class WaterWeaponsFactory extends AbstractWeaponsFactory{
    @Override
    public AbstractWeapon getWeapon(WeaponType type, String desc) {
        AbstractWeapon weapon = null;
        switch (type){
            case BAZOOKA:
                weapon = new WaterBalloon(desc);
                break;
            default:
                throw new UnsupportedOperationException();
        }
        return weapon;
    }
}
