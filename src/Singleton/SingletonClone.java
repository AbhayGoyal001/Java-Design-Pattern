package Singleton;

public class SingletonClone implements Cloneable
{
    private static SingletonClone instance;
    private SingletonClone(){}

    public static SingletonClone getInstance(){
        if(instance == null){
            synchronized (SingletonClone.class){
                if(instance == null){
                    instance = new SingletonClone();
                }
            }
        }
        return instance;
    }
    @Override
    public Object clone(){
        return instance;
    }

    static void main(String[] args) throws CloneNotSupportedException {
        SingletonClone singleton = SingletonClone.getInstance();
        System.out.println(singleton.hashCode());
        SingletonClone singletonClone = (SingletonClone) singleton.clone();
        System.out.println(singletonClone.hashCode());
    }
}
