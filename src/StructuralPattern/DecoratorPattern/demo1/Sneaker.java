package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:03
 * Abstract：运动鞋
 */
public class Sneaker extends Finery {

    public Sneaker(Charactor charactor) {
        super(charactor);
    }

    public Charactor decorator(Charactor charactor){
        this.charactor=charactor;
        return charactor;
    }
    public void show(){
        System.out.print("运动鞋 ");
        super.show();
    }
}
