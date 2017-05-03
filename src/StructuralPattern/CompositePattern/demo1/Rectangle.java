package StructuralPattern.CompositePattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 10:57
 * Abstract：矩形
 */
public class Rectangle implements Component {


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
        System.out.print("矩形\n");
    }

    @Override
    public void draw() {
        System.out.print(" 矩形 ");
    }
}
