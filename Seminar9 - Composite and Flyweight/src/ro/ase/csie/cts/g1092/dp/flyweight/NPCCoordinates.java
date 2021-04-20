package ro.ase.csie.cts.g1092.dp.flyweight;

//unique for each npc character
public class NPCCoordinates {
    int x, y, z;
    String color;

    public NPCCoordinates(int x, int y, int z, String color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
    }
}
