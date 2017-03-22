package CreationalPattern.factory.demo;

/**
 * Created by yangenneng on 2017-03-22 9:15
 * Abstract：奔驰车E260详细信息
 */
public class BenzE260 implements Benz {

    public BenzE260(){
        this.carColor();
        this.carSpeed();
        this.carPrice();
    }

    public void carColor() {
        System.out.println("E260.................黑色");
    }

    public void carSpeed() {
        System.out.println("E260.................100公里每小时");
    }

    public void carPrice() {
        System.out.println("E260.................20000元");
    }
}
