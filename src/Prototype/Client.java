package Prototype;

public class Client {
    static void main(String[] args) throws InterruptedException {
    NetworkConnection networkConnection = new NetworkConnection();
    networkConnection.setDbname("MYSQL");
    networkConnection.setId("1");
        System.out.println("Creating Object ");

    networkConnection.doConnection();
        System.out.println(networkConnection);
        try{
            NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
            System.out.println(networkConnection1);
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

    }
}
