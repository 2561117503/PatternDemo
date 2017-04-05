package CreationalPattern.builder.demo1;

/**
 * Created by yangenneng on 2017-04-05 11:27
 * Abstract：
 */
public interface IBuilder {
    void buildHead();//头
    void buildBody();//身体
    void buildArm();//手
    void buildLeg();//脚
}
