package CreationalPattern.builder.demo1;

/**
 * Created by yangenneng on 2017-04-05 11:30
 * Abstract：胖子
 */
public class FatPerson implements IBuilder {
    Person person=new Person();
    @Override
    public void buildHead() {
        person.addPart("圆的");
    }

    @Override
    public void buildBody() {
        person.addPart("胖的");
    }

    @Override
    public void buildArm() {
        person.addPart("长的");
    }

    @Override
    public void buildLeg() {
        person.addPart("粗的");
    }

    public Person getPerson(){return person;}

}
