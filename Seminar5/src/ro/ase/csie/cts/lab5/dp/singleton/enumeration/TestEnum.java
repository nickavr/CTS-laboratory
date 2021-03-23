package ro.ase.csie.cts.lab5.dp.singleton.enumeration;

public class TestEnum {
    public static void main(String[] args) {
        DbConnection dbConnection = DbConnection.CONNECTION;
        DbConnection dbConnection2 = DbConnection.CONNECTION;

        if(dbConnection == dbConnection2){
            System.out.println("They are the same");
        }
    }
}
