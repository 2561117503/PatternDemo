package CreationalPattern.singleton.demo1;

/**
 * Created by yangenneng on 2017-03-15 9:52.
 * Abstract：由于懒汉式不是线程安全的，我们需要加上同步机制,并作双重判断以便提高效率
 */
public class Singleton3 {
    private static Singleton3 singleton3_instance=null;

    private Singleton3(){}

    public static Singleton3 getSingleton3_instance() {
        if(singleton3_instance==null)
            synchronized (Singleton3.class){
                if(singleton3_instance==null){
                    singleton3_instance=new Singleton3();
                }
            }
        return singleton3_instance;
    }
}
