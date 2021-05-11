package ro.ase.csie.cts.g1092.Command;

public class UpdateModule implements GameModuleInterface{

    @Override
    public void doTask(String taskName) {
        System.out.println("Updating . . . " + taskName);
    }
}
