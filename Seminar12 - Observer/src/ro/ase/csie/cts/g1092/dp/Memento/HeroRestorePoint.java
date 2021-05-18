package ro.ase.csie.cts.g1092.dp.Memento;

import java.util.Date;

//memento class -> store data
public class HeroRestorePoint {
    String name;
    int lifePoints;
    private String magic;
    private Date timestamp;

    public HeroRestorePoint(String name, int lifePoints, String magic) {
        this.name = name;
        this.lifePoints = lifePoints;
        this.magic = magic;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public String getMagic() {
        return magic;
    }
}
