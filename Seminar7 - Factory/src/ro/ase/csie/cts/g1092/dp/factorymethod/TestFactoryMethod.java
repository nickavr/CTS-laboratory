package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactry.AbstractWeapon;
import ro.ase.csie.cts.g1092.dp.simplefactry.SuperHero;
import ro.ase.csie.cts.g1092.dp.simplefactry.WeaponType;
import ro.ase.csie.cts.g1092.dp.simplefactry.WeaponsFactory;

public class TestFactoryMethod {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman");
        boolean kidsMode = true;

        AbstractWeaponsFactory abstractWeaponsFactory = null;
        if(kidsMode){
            abstractWeaponsFactory = new WaterWeaponsFactory();
        }
        else{
            abstractWeaponsFactory = new RealWeaponsFactory();
        }
        AbstractWeapon bazooka = abstractWeaponsFactory.getWeapon(WeaponType.BAZOOKA, "makes booom");
        superman.setWeapon(bazooka);
    }
}
