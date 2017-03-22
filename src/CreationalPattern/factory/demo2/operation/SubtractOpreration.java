package CreationalPattern.factory.demo2.operation;

/**
 * Created by yangenneng on 2017-03-22 10:49
 * Abstract：
 */
public class SubtractOpreration implements IOperation {

    public int getResult(int a, int b) {
        return a-b;
    }
}
