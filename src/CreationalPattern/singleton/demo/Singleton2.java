package CreationalPattern.singleton.demo;

/**
 * Created by yangenneng on 2017-03-15 9:42.
 * 功能说明：懒汉式单例模式
 */
public class Singleton2 {

    private static Singleton2 singleton2_instance=null;

    private Singleton2(){}

    public static Singleton2 getSingleton2_instance() {
        if(singleton2_instance==null)
           singleton2_instance=new Singleton2();
        return singleton2_instance;
    }

}
