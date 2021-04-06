package ro.ase.csie.cts.g1092.dp.simplefactry;

public class Pistol extends AbstractWeapon{

    public Pistol(String description, int power) {
        this.description = description;
        this.powerLevel = power;
    }

    @Override
    public void pewPew() {
        System.out.println("Pistol pew pew -> -> ->");
    }
}
