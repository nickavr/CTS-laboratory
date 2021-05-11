package ro.ase.csie.cts.g1092.Command;

public class AsyncCommand extends AsyncTask{

    String taskName;
    int priority; //maybe added later
    GameModuleInterface module = null;

    public AsyncCommand(String taskName, GameModuleInterface module) {
        this.taskName = taskName;
        this.module = module;
    }

    @Override
    public void asyncExecute() {
        this.module.doTask(taskName);
    }
}
