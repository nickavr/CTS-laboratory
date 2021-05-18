package ro.ase.csie.cts.g1092.dp.Memento;

public class TestMemento {
    public static void main(String[] args) {
        Superhero hero = new Superhero("Superman", 1000, "fly");

        HeroRestorePoint intial = hero.saveData();

        hero.lifePoints += 500;
        System.out.println("Lifepoints: " + hero.lifePoints);

        hero.restoreDate(intial);
        System.out.println("Lifepoints: " + hero.lifePoints);
    }
}
