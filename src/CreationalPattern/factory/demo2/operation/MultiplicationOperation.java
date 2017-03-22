package CreationalPattern.factory.demo2.operation;

/**
 * Created by yangenneng on 2017-03-22 10:50
 * Abstract：
 */
public class MultiplicationOperation implements IOperation {

    public int getResult(int a, int b) {
        return a*b;
    }
}
