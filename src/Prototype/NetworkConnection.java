package Prototype;

public class NetworkConnection implements Cloneable {
    private String id;
    private String dbname;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDbname() {
        return dbname;
    }

    public void setDbname(String dbname) {
        this.dbname = dbname;
    }
    public void doConnection() throws InterruptedException {
        System.out.println("Starting Network Coonection");
        Thread.sleep(5000);
    }

    @Override
    public String toString() {
        return "NetworkConnection{" +
                "id='" + id + '\'' +
                ", dbname='" + dbname + '\'' +
                '}';
    }
    public Object clone() throws CloneNotSupportedException {
        return  super.clone();
    }
}
