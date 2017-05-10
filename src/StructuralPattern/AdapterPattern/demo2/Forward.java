package StructuralPattern.AdapterPattern.demo2;


import StructuralPattern.AdapterPattern.demo2.AmericanPlayer;

/**
 * Created by yangenneng on 2017-05-10 21:32
 * Abstract：前锋
 */
public class Forward implements AmericanPlayer {

    private String name;

    public Forward(String name){this.name=name;}

    //进攻
    public void attack(){
        System.out.println("American Player Forward："+name+" attack");
    }

    //防守
    public void guard(){
        System.out.println("American Player Forward："+name+" guard");
    }


}
