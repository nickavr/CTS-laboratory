package ro.ase.csie.cts.g1092.dp.simplefactry;

public class TestSimpleFactory {
    public static void main(String[] args) {
        SuperHero superman = new SuperHero("Superman");
        //superman.setWeapon(new Bazooka("makes boom boom"));
        //superman.setWeapon(new MachineGun("MG", 50, 200));

        AbstractWeapon bazooka = WeaponsFactory.getWeapon(WeaponType.BAZOOKA, "makes booom");
        superman.setWeapon(bazooka);
        superman.setWeapon(WeaponsFactory.getWeapon(WeaponType.MACHINE_GUN, "MG"));
    }
}
