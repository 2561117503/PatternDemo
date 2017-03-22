package CreationalPattern.factory.demo;

/**
 * Created by yangenneng on 2017-03-22 9:14
 * Abstract：奔驰车C180详细信息
 */
public class BenzC180 implements Benz {

    public BenzC180(){
        this.carColor();
        this.carSpeed();
        this.carPrice();
    }

    public void carColor() {
        System.out.println("C180.................白色");
    }

    public void carSpeed() {
        System.out.println("C180.................160公里每小时");
    }

    public void carPrice() {
        System.out.println("C180.................10000元");
    }
}
