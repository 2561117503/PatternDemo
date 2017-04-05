package CreationalPattern.builder.demo1;

import java.util.ArrayList;

/**
 * Created by yangenneng on 2017-04-05 11:17
 * Abstract：人
 */
public class Person {

    private ArrayList<String> pParts=new ArrayList<>();
    private ArrayList<String> pPartName=new ArrayList<String>(){{add("头");add("身体");add("手");add("脚");}};

    public void addPart(String partValue){//增加身体的一部分
        pParts.add(partValue);
    }

    public void ShowPerson(){
        System.out.println("小人的整体结构为:");
        for (int i = 0; i < pPartName.size(); i++) {
            System.out.println(pPartName.get(i)+":"+pParts.get(i));
        }
    }

}
