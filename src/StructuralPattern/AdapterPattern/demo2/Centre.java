package StructuralPattern.AdapterPattern.demo2;


/**
 * Created by yangenneng on 2017-05-10 21:35
 * Abstract：中锋
 */
public class Centre implements AmericanPlayer {

    private String name;

    public Centre(String name){this.name=name;}

    //进攻
    public void attack(){
        System.out.println("American Player Centre："+name+" attack");
    }

    //防守
    public void guard(){
        System.out.println("American Player Centre："+name+" guard");
    }

}
