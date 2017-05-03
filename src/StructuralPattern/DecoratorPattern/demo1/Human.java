package StructuralPattern.DecoratorPattern.demo1;

import StructuralPattern.DecoratorPattern.demo1.Charactor;

/**
 * Created by yangenneng on 2017-05-03 12:59
 * Abstract：人类
 */
public class Human extends Charactor {
    private String name;
    public Human(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("--人类:"+name);
    }
}
