package StructuralPattern.CompositePattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 10:54
 * Abstract：定义抽象构件接口
 */
public interface Component {

    public void add(Component component);
    public void remove(Component component);
    public void display(int length);  //输出组合图形的树形结构
    public void draw ();    //以括号形式表示图形组合进行图形输出

}
