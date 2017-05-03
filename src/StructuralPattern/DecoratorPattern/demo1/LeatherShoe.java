package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:03
 * Abstract：皮鞋
 */
public class LeatherShoe extends Finery {

    public LeatherShoe(Charactor charactor) {
        super(charactor);
    }

    public Charactor decorator(Charactor charactor){
        this.charactor=charactor;
        return charactor;
    }
    public void show(){
        System.out.print("皮鞋 ");
        super.show();
    }
}
