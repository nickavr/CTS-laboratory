package ro.ase.csie.cts.g1092.dp.Memento;

public class Superhero {
    String name;
    int lifePoints;
    private String magic;

    public Superhero(String name, int lifePoints, String magic) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.magic = magic;
    }

    public void attack(){
        System.out.println("Is attacking");
    }

    public void heal(){
        System.out.println("Is healing");
    }

    public void move(){
        System.out.println("Is moving");
    }

    //store data
    public HeroRestorePoint saveData(){
        return new HeroRestorePoint(this.name, this.lifePoints, this.magic);
    }

    //get data from certain timestamp
    public void restoreDate(HeroRestorePoint memento){
        this.name = memento.name;
        this.lifePoints = memento.lifePoints;
        this.magic = memento.getMagic();
    }
}
