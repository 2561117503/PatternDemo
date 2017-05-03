package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:02
 * Abstract：牛仔裤
 */
public class Jean extends Finery {

    public Jean(Charactor charactor) {
        super(charactor);
    }

    public Charactor decorator(Charactor charactor){
        this.charactor=charactor;
        return charactor;
    }
    public void show(){
        System.out.print("牛仔裤 ");
        super.show();
    }
}
