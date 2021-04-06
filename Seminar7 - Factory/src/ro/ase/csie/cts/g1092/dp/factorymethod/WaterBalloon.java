package ro.ase.csie.cts.g1092.dp.factorymethod;

import ro.ase.csie.cts.g1092.dp.simplefactry.AbstractWeapon;

public class WaterBalloon extends AbstractWeapon {

    public WaterBalloon(String desc) {
        this.description = desc;
    }

    @Override
    public void pewPew() {
        System.out.println("Splaash");
    }
}
