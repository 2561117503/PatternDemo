package CreationalPattern.singleton.demo1;

/**
 * Created by yangenneng on 2017-03-15 9:40.
 * Abstract：饿汉式单例模式
 */
public class Singleton1 {

    private static Singleton1 singleton1_instace=new Singleton1();

    private Singleton1(){}

    public static Singleton1 getSingleton1_instace() {
        return singleton1_instace;
    }
}
