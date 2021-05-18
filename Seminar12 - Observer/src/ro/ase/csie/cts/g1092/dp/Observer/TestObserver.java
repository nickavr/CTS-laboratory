package ro.ase.csie.cts.g1092.dp.Observer;

public class TestObserver {
    public static void main(String[] args) {
        NetworkModule networkModule = new NetworkModule();

        NetworkEventHandlerInterface autoSave = new AutoSaveModule();
        NetworkEventHandlerInterface notifications = new UINotificationsModule();

        networkModule.networkStatusChanged(NetworkStatus.UP);

        //register observers to the observable
        networkModule.registerModule(autoSave);
        networkModule.registerModule(notifications);

        networkModule.networkStatusChanged(NetworkStatus.UP);

        networkModule.unregisterModule(autoSave);
        networkModule.networkStatusChanged(NetworkStatus.DOWN);

    }
}
