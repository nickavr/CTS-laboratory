package ro.ase.csie.cts.g1092.dp.flyweight;

import java.util.ArrayList;

//storing shared data
public class Model3DFlyweight implements Model3DFlyweightInterface{

    //shared data
    String modelName;
    ArrayList<Integer> points = new ArrayList<>();

    @Override
    public void loadModel(String fileName) {

    }

    @Override
    public void display(NPCCoordinates coordinates) {

    }
}
