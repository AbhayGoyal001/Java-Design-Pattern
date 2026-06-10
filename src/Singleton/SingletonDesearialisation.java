package Singleton;

import java.io.*;

public class SingletonDesearialisation implements Serializable {
    private static SingletonDesearialisation instance;
    private SingletonDesearialisation(){}

    public static SingletonDesearialisation getInstance(){
        if(instance == null){
            synchronized (SingletonDesearialisation.class){
                if(instance == null){
                    instance = new SingletonDesearialisation();
                }
            }
        }
        return instance;
    }
    public Object readResolve(){
        return instance;
    }

    static void main(String[] args) throws Exception {
        SingletonDesearialisation singletonDesearialisation = SingletonDesearialisation.getInstance();
        System.out.println(singletonDesearialisation.hashCode());
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(singletonDesearialisation);
        System.out.println("Desearialisation Done");
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        SingletonDesearialisation singletonDesearialisation1 = (SingletonDesearialisation) objectInputStream.readObject();
        System.out.println(singletonDesearialisation.hashCode());
        System.out.println(singletonDesearialisation1.hashCode());
    }
}
