package ro.ase.csie.cts.lab5.dp.singleton;

public class TestSingleton {
    public static void main(String[] args) {

        System.out.println("The app started");
        //DbConnection con1 = new DbConnection();
        //DbConnection con2 = new DbConnection();

        DbConnection con1 = DbConnection.getDbConnection();
        DbConnection con2 = DbConnection.getDbConnection();
        DbConnection con3 = DbConnection.getDbConnection();

        if(con1 == con2){
            System.out.println("They are ref to the same obj");
        }

        //having both versions of getDbConnection is not ok and missleading
        DbConnection con4 = DbConnection.getDbConnection("10.0.0.1:3306", "ctsDB");
        if(con1 == con4){
            System.out.println("They are ref to the same obj");
        }

        //you still get the initial connection
        DbConnection con5 = DbConnection.getDbConnection("10.0.0.1:3306", "cts_prod");



    }
}
