package CreationalPattern.factory.demo1;

/**
 * Created by yangenneng on 2017-03-22 9:13
 * Abstract：奔驰C180工厂类
 */
public class C180Factory implements BenzFactory {

    public Benz createCar() {
        return new BenzC180();
    }
}
