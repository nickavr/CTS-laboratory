package ro.ase.csie.cts.g1092.Command;

public class TestCommand {
    public static void main(String[] args) {
        TaskManager manager = new TaskManager();

        manager.addAsyncTask(new AsyncCommand("Autosave", new BackupModule()));
        manager.addAsyncTask(new AsyncCommand("Update 3D model", new UpdateModule()));

        System.out.println("Game is running");

        manager.execute();
        manager.execute();
        manager.execute();

        System.out.println("Game is running");
    }
}
