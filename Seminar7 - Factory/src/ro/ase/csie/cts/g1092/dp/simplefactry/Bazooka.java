package ro.ase.csie.cts.g1092.dp.simplefactry;

public class Bazooka extends AbstractWeapon{

    public Bazooka(String description) {
        this.description = description;
        this.powerLevel = 1000;
    }

    @Override
    public void pewPew() {
        System.out.println("BOOM ***********");
    }
}
