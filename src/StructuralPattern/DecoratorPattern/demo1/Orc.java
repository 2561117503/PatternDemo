package StructuralPattern.DecoratorPattern.demo1;


/**
 * Created by yangenneng on 2017-05-03 12:59
 * Abstract：兽人
 */
public class Orc extends Charactor {
    private String name;
    public Orc(String name){
        this.name=name;
    }
    public void show(){
        System.out.println("--兽人:"+name);
    }
}
