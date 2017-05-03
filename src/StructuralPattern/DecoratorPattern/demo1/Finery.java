package StructuralPattern.DecoratorPattern.demo1;

import StructuralPattern.DecoratorPattern.demo1.Charactor;

/**
 * Created by yangenneng on 2017-05-03 13:00
 * Abstract：服装
 */
public class Finery extends Charactor {
    protected Charactor charactor;
    public Finery(Charactor charactor){
        this.charactor=charactor;
    }
    public void show(){
        this.charactor.show();
    }
}
