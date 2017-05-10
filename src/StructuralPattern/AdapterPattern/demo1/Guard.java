package StructuralPattern.AdapterPattern.demo1;

/**
 * Created by yangenneng on 2017-05-10 21:37
 * Abstract：后卫
 */
public class Guard extends AmericanPlayer {

    public Guard(String name) {
        super(name);
    }

    //进攻
    public void attack(){
        System.out.println("American Player Guard："+name+" attack");
    }

    //防守
    public void guard(){
        System.out.println("American Player Guard："+name+" guard");
    }

}
