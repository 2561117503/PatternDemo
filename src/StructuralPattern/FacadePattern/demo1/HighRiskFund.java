package StructuralPattern.FacadePattern.demo1;

import java.awt.image.ImageConsumer;

/**
 * Created by yangenneng on 2017-05-17 10:53
 * Abstract：高风险方案
 */
public class HighRiskFund implements Scheme {

    protected Stock stock=new HighStock(); //高风险股票
    private Realty realty=new Realty();  //房地产

    @Override
    public void buyFund() {
        System.out.println("---------------购买高风险方案---------------");
        stock.buy();
        realty.buy();
    }

    @Override
    public void sellFund() {
        System.out.println("---------------卖出高风险方案---------------");
        stock.sell();
        realty.sell();
    }
}
