package ro.ase.csie.cts.g1092.dp.Memento;

import java.util.ArrayList;
import java.util.List;

//manage multiple mementos in time
public class RestorePointsManager {
    List<HeroRestorePoint> restorePoints = new ArrayList<>();

    public void addRestorePoints(HeroRestorePoint point){
        this.restorePoints.add(point);
    }

    public HeroRestorePoint getRestorePoint(int index){
        if(index < 0 || index >= restorePoints.size()){
            throw new UnsupportedOperationException();
        }
        else{
            HeroRestorePoint point = restorePoints.get(index);
            restorePoints.remove(index);
            return point;
        }
    }
}
