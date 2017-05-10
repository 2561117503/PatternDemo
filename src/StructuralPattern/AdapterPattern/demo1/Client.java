package StructuralPattern.AdapterPattern.demo1;

/**
 * Created by yangenneng on 2017-05-10 21:44
 * Abstract：客户端测试代码
 */
public class Client {
    public static void main(String[] args) {
        System.out.println("对象适配器模式");

        AmericanPlayer americanPlayer1=new Forward("aaa");
        AmericanPlayer americanPlayer2=new Centre("bbb");
        AmericanPlayer americanPlayer3=new Guard("ccc");

        Adapter chinaPlayer1=new Adapter("姚明");

        //进攻  都是调用attack方法
        americanPlayer1.attack();
        americanPlayer2.attack();
        americanPlayer3.attack();
        chinaPlayer1.attack();

        System.out.println();

        //防守  都是调用guard方法
        americanPlayer1.guard();
        americanPlayer2.guard();
        americanPlayer3.guard();
        chinaPlayer1.guard();

    }
}
