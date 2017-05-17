package StructuralPattern.FacadePattern.demo1;

/**
 * Created by yangenneng on 2017-05-17 10:46
 * Abstract：高风险股票
 */
public class LowStock implements Stock{

    @Override
    public void buy() {
        System.out.println("购买低风险股票");
    }

    @Override
    public void sell() {
        System.out.println("卖出低风险股票");
    }
}
