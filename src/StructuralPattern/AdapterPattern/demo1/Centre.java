package StructuralPattern.AdapterPattern.demo1;

/**
 * Created by yangenneng on 2017-05-10 21:35
 * Abstract：中锋
 */
public class Centre extends AmericanPlayer {

    public Centre(String name) {
        super(name);
    }

    //进攻
    public void attack(){
        System.out.println("American Player Centre："+name+" attack");
    }

    //防守
    public void guard(){
        System.out.println("American Player Centre："+name+" guard");
    }

}
