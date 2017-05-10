package StructuralPattern.AdapterPattern.demo2;

/**
 * Created by yangenneng on 2017-05-10 21:56
 * Abstract：
 */
public class Adapter extends ChinaPlayer implements AmericanPlayer{

    public Adapter(String name) {
        super(name);
    }


    @Override
    public void attack() {
        super.进攻();
    }

    @Override
    public void guard() {
        super.防守();
    }
}
