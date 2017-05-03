package StructuralPattern.CompositePattern.demo1;

import StructuralPattern.CompositePattern.demo2.Company;

import java.util.ArrayList;

/**
 * Created by yangenneng on 2017-05-03 10:59
 * Abstract：定义树形构件
 */
public class Composite implements Component {

    private ArrayList<Component> componentArrayList=new ArrayList<Component>();


    @Override
    public void add(Component component) {
        this.componentArrayList.add(component);
    }

    @Override
    public void remove(Component component) {
        this.componentArrayList.remove(component);
    }

    @Override
    public void display(int length) {
        for (int i = 0; i < length; i++) {
            System.out.print("-");
        }
        System.out.print("图片组合\n");

        for(Component c:componentArrayList){
            c.display(length+2);
        }

    }



    @Override
    public void draw() {
        System.out.print("(");
        for(Component c:componentArrayList){
            c.draw();
        }
        System.out.print(")");
    }


    public ArrayList<Component> getChild(){
        return this.componentArrayList;
    }


}
