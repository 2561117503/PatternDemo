package CreationalPattern.builder.demo1;

/**
 * Created by yangenneng on 2017-04-05 11:28
 * Abstract：瘦子
 */
public class ThinPerson implements IBuilder {

    Person person=new Person();

    @Override
    public void buildHead() {
        person.addPart("方的");
    }

    @Override
    public void buildBody() {
        person.addPart("瘦的");
    }

    @Override
    public void buildArm() {
        person.addPart("短的");
    }

    @Override
    public void buildLeg() {
        person.addPart("细的");
    }

    public Person getPerson(){return person;}
}
