package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:03
 * Abstract：领带
 */
public class Tie extends Finery {

    public Tie(Charactor charactor) {
        super(charactor);
    }

    public Charactor decorator(Charactor charactor){
        this.charactor=charactor;
        return this.charactor;
    }
    public void show(){
        System.out.print("领带 ");
        super.show();
    }
}
