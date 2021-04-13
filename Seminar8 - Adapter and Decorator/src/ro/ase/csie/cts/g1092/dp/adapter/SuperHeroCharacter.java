package ro.ase.csie.cts.g1092.dp.adapter;

public abstract class SuperHeroCharacter {

    String name;
    int power;

    public abstract void move();
    public abstract void crouch();
    public abstract void takeHit(int points);
    public abstract void heal(int points);

    public SuperHeroCharacter(String name, int power) {
        this.name = name;
        this.power = power;
    }
}
