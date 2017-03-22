package CreationalPattern.factory.demo2.operation;

/**
 * Created by yangenneng on 2017-03-22 10:51
 * Abstract：
 */
public class DivisionOperation implements IOperation {

    public int getResult(int a, int b) {
        return a/b;
    }
}
