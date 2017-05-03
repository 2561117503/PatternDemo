package StructuralPattern.CompositePattern.demo1;


/**
 * Created by yangenneng on 2017-05-03 11:05
 * Abstract：客户端测试
 */
public class Client {

    public static void main(String[] args) {
        Composite root=new Composite(); //创建一个根节点

        Composite picture1=new Composite();
        Composite picture2=new Composite();

        root.add(picture1);
        root.add(picture2);


        picture1.add(new Line());
        picture1.add(new Rectangle());

        picture2.add(new Line());
        picture2.add(new Textbox());

        root.display(2);

//        root.display(2);
//        display(root,4);//树形结构  这里是不透明方式

        root.draw();//透明方式


    }

    //输出组合图形的树形结构(这里是不透明方式)
    public static void display(Composite root,int length){
        if(root!=null){
            for (Component c:root.getChild()){
                if(c instanceof Line || c instanceof Rectangle || c instanceof Textbox){
                    c.display(length+2);
                }else {
                    c.display(length);
                    display((Composite) c,length);
                }
            }
        }
    }


}
