package CreationalPattern.builder.demo1;

/**
 * Created by yangenneng on 2017-04-05 11:34
 * Abstract：
 */
public class PersonDirector {
    public void builderP(IBuilder iBuilder) {
        iBuilder.buildHead();
        iBuilder.buildBody();
        iBuilder.buildArm();
        iBuilder.buildLeg();
    }
}
