package StructuralPattern.FacadePattern.demo1;

/**
 * Created by yangenneng on 2017-05-17 10:57
 * Abstract：低风险方案
 */
public class LowRiskFund implements Scheme {

    protected Stock stock=new LowStock();  //低风险股票
    protected NationalDebt nationalDebt=new NationalDebt();//国债

    @Override
    public void buyFund() {
        System.out.println("---------------购买低风险方案---------------");
        stock.buy();
        nationalDebt.buy();
    }

    @Override
    public void sellFund() {
        System.out.println("---------------卖出低风险方案---------------");
        stock.sell();
        nationalDebt.sell();
    }
}
