package CreationalPattern.factory.demo;

/**
 * Created by yangenneng on 2017-03-22 9:16
 * Abstract：奔驰E260工厂类
 */
public class E260Factory implements BenzFactory {

    public Benz createCar() {
        return new BenzE260();
    }
}
