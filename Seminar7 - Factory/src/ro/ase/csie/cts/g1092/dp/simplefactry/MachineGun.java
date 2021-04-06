package ro.ase.csie.cts.g1092.dp.simplefactry;

public class MachineGun extends AbstractWeapon{

    int noBullets;

    public MachineGun(String description, int power, int noBullets) {
        this.description = description;
        this.powerLevel = power;
        this.noBullets = noBullets;
    }

    @Override
    public void pewPew() {
        System.out.println("Machine gun pew pew ------->");
    }
}
