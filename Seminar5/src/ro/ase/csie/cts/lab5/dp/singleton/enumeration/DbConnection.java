package ro.ase.csie.cts.lab5.dp.singleton.enumeration;

//implement the singleton as an enum
public enum DbConnection {
    CONNECTION("10.0.0.1", "db");
    String socket;
    String schema;

    private DbConnection(String socket, String schema){
        this.socket = socket;
        this.schema = schema;
    }

    public String getSocket() {
        return socket;
    }

    public String getSchema() {
        return schema;
    }
}
