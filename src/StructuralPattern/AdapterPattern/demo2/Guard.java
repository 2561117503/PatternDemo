package StructuralPattern.AdapterPattern.demo2;

import StructuralPattern.AdapterPattern.demo2.AmericanPlayer;

/**
 * Created by yangenneng on 2017-05-10 21:37
 * Abstract：后卫
 */
public class Guard implements AmericanPlayer {

    private String name;

    public Guard(String name){this.name=name;}

    //进攻
    public void attack(){
        System.out.println("American Player Guard："+name+" attack");
    }

    //防守
    public void guard(){
        System.out.println("American Player Guard："+name+" guard");
    }

}
