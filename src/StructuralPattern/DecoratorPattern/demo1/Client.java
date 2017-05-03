package StructuralPattern.DecoratorPattern.demo1;

/**
 * Created by yangenneng on 2017-05-03 13:02
 * Abstract：客户端测试
 */
public class Client {
    public static void main(String[] args) {

        //人类
        Human human=new Human("绅士风");
        Orc orc1=new Orc("休闲风");
        Orc orc2=new Orc("混搭风");

        //装饰服饰

        //绅士风的人类（西装，领带，皮鞋）
        Suit suit=new Suit(human);//西装
        Tie tie=new Tie(suit);//领带
        LeatherShoe leatherShoe=new LeatherShoe(tie);//皮鞋
        leatherShoe.show();

        //休闲风的兽人（T恤，牛仔裤，运动鞋）
        TShirt tShirt1=new TShirt(orc1);
        Jean jean1=new Jean(tShirt1);
        Sneaker sneaker1=new Sneaker(jean1);
        sneaker1.show();

        //混搭风的兽人（西装，领带，牛仔裤，运动鞋）
        Suit suit2=new Suit(orc2);
        Tie tie2=new Tie(suit2);
        Sneaker sneaker2=new Sneaker(tie2);
        sneaker2.show();

    }
}
