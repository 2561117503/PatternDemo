package CreationalPattern.singleton.demo1;

/**
 * Created by yangenneng on 2017-03-15 9:58
 * Abstract：
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**单例模式*/
class Singleton {
    private static Singleton singleton_instance=null;
    private static boolean isFirstCreate=true;
    private Singleton(){
        if(isFirstCreate)isFirstCreate=false;
        else throw new RuntimeException("不允许通过反射机制创建");
    }

    public static Singleton getSingleton_instance() {
        if(singleton_instance==null)
            synchronized (Singleton.class){
                if(singleton_instance==null){
                    singleton_instance=new Singleton();
                }
            }
        return singleton_instance;
    }
}

/**单例模式测试*/
public class Singleton4 {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        //--------------java反射机制带来的问题 start ---------------
        Class aClass=Singleton3.class;
        Constructor constructor=aClass.getDeclaredConstructor(null);
        constructor.setAccessible(true);

        Singleton3 singleton3_1=Singleton3.getSingleton3_instance();//单例模式返回
        Singleton3 singleton3_2= (Singleton3) constructor.newInstance(null);//java反射机制创建
        System.out.println(singleton3_1.equals(singleton3_2));//输出为false
        System.out.println(singleton3_1==singleton3_2);//输出为false
        //--------------java反射机制带来的问题 end ---------------


        //--------------java反射机制问题修正 begin ---------------
        Class aClass1=Singleton.class;
        Constructor constructor1=aClass1.getDeclaredConstructor(null);
        constructor1.setAccessible(true);

        Singleton singleton_1=Singleton.getSingleton_instance();//单例模式返回
        Singleton singleton_2= (Singleton) constructor1.newInstance(null);//java反射机制创建——抛出异常
        System.out.println(singleton_1.equals(singleton_2));//抛出异常
        System.out.println(singleton_1==singleton_2);//抛出异常
        //--------------java反射机制问题修正 end ---------------


    }
}
