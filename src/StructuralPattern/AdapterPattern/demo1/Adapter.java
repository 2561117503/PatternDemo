package StructuralPattern.AdapterPattern.demo1;

import StructuralPattern.AdapterPattern.demo1.*;

/**
 * Created by yangenneng on 2017-05-10 21:42
 * Abstract：
 */
public class Adapter extends AmericanPlayer {

    private ChinaPlayer chinaPlayer=null;

    public Adapter(String name){
        super(name);
        chinaPlayer=new ChinaPlayer(name);
    }

    //进攻
    public void attack(){
        chinaPlayer.进攻();
    }

    //防守
    public void guard(){
        chinaPlayer.防守();
    }
}
