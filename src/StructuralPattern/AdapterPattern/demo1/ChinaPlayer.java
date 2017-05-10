package StructuralPattern.AdapterPattern.demo1;

/**
 * Created by yangenneng on 2017-05-10 21:37
 * Abstract：中国球员
 */
public class ChinaPlayer {
    protected String name;

    public ChinaPlayer(String name){this.name=name;}

    //进攻
    public void 进攻(){
        System.out.println("中国球员:"+name+"进攻");
    }

    //防守
    public void 防守(){
        System.out.println("中国球员:"+name+"防守");
    }
}
