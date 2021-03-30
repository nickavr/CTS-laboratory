package ro.ase.csie.cts.g1092.dp.prototype;

public class TestPrototype {
    public static void main(String[] args) {
        Tree3DModel tree1 = new Tree3DModel("green", 200);
        Tree3DModel tree2 = new Tree3DModel("red", 150);
        Tree3DModel tree3 = new Tree3DModel("green", 200);

        //shallow copy
        //Tree3DModel tree4 = tree1;

        try {
            Tree3DModel tree4 = tree1.clone();
            Tree3DModel tree5 = tree1.clone();
            Tree3DModel tree6 = tree1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        System.out.println("The end");
    }
}
