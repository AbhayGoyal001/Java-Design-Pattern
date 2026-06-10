package Singleton;

public class Singleton {
    private static Singleton instance;
    private Singleton(){}

    public static Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        System.out.println(singleton.hashCode());
    }
}
