package StructuralPattern.FacadePattern.demo1;

/**
 * Created by yangenneng on 2017-05-17 10:58
 * Abstract：客户端测试代码
 */
public class Client {
    public static void main(String[] args) {
        Scheme scheme1=new HighRiskFund();
        scheme1.buyFund();
        scheme1.sellFund();

        Scheme scheme2=new LowRiskFund();
        scheme2.buyFund();
        scheme2.sellFund();
    }
}
