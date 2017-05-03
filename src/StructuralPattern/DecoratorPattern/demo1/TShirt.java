package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:02
 * Abstract：T恤
 */
public class TShirt extends Finery {

    public TShirt(Charactor charactor) {
        super(charactor);
    }

    public Charactor decorator(Charactor charactor){
        this.charactor=charactor;
        return charactor;
    }

    public void show(){
        System.out.print("T恤 ");
        super.show();
    }
}
