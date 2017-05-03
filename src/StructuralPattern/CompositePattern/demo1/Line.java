package StructuralPattern.CompositePattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 10:56
 * Abstract：直线
 */
public class Line implements Component {


    @Override
    public void add(Component component) {

    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public void display(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.print("直线\n");
    }

    @Override
    public void draw() {
        System.out.print(" 直线 ");
    }
}
