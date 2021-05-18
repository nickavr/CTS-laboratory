package ro.ase.csie.cts.g1092.dp.Observer;

public class UINotificationsModule implements NetworkEventHandlerInterface{
    @Override
    public void notifyNetworkDown() {
        System.out.println("Notify player: network lost");
    }

    @Override
    public void notifyNetworkUp() {
        System.out.println("Notify player: connection up");
    }
}
