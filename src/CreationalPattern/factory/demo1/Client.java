package CreationalPattern.factory.demo1;

/**
 * Created by yangenneng on 2017-03-22 9:18
 * Abstract：客户端测试
 */
public class Client {
    public static void main(String[] args) {
        BenzFactory benzFactory=new C180Factory();
        benzFactory.createCar();
        System.out.println("---------------------------------------");
        benzFactory=new E260Factory();
        benzFactory.createCar();
    }
}
