package CreationalPattern.factory.demo;

/**
 * Created by yangenneng on 2017-03-22 9:18
 * Abstract：
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
