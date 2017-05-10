package StructuralPattern.AdapterPattern.demo1;


/**
 * Created by yangenneng on 2017-05-10 21:32
 * Abstract：前锋
 */
public class Forward  extends AmericanPlayer{

    public Forward(String name) {
        super(name);
    }

    //进攻
    public void attack(){
        System.out.println("American Player Forward："+name+" attack");
    }

    //防守
    public void guard(){
        System.out.println("American Player Forward："+name+" guard");
    }


}
