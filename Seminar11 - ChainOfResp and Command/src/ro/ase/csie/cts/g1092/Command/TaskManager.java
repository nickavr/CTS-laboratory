package ro.ase.csie.cts.g1092.Command;

import java.util.ArrayList;

public class TaskManager {
    ArrayList<AsyncTask> tasks = new ArrayList<>();

    public void addAsyncTask(AsyncTask task){
        tasks.add(task);
    }

    public void execute(){
        //here you d have the multithreading part
        //for now we just simulate
        if(tasks.size() > 0) {
            AsyncTask taskToExecute = tasks.get(0);
            if (taskToExecute != null) {
                tasks.remove(0);
                taskToExecute.asyncExecute();
            }
        }
    }
}
