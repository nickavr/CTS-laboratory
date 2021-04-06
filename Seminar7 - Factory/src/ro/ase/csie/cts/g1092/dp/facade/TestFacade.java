package ro.ase.csie.cts.g1092.dp.facade;

public class TestFacade {

    public static void main(String[] args) {
        //in order to connect to the game from an external app you need:
        //1. create player profile and login

        PlayerProfile profile = new PlayerProfile();
        profile.login();
        profile.getUserSettings();

        //2. check the subcription
        Subscription subscription = new Subscription();
        subscription.checkSubscription();

        //3. get the mc
        SuperHero superHero = new SuperHero("Superman", new Helment(), new SuperPower());

        //if this above steps are a common procedure, use a facade to hide all this details:
        //1.
        GameAPIFacade.createProfileAndConnect();
    }
}
