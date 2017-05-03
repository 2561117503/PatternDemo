package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:03
 * Abstract：西装
 */
public class Suit extends Finery {

    public Suit(Charactor charactor) {
        super(charactor);
    }

    public Charactor decorator(Charactor charactor){
        this.charactor=charactor;
        return charactor;
    }
    public void show(){
        System.out.print("西装 ");
        super.show();
    }
}
