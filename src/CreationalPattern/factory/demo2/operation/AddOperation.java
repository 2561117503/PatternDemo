package CreationalPattern.factory.demo2.operation;

/**
 * Created by yangenneng on 2017-03-22 10:48
 * Abstract：
 */
public class AddOperation implements IOperation {

    public int getResult(int a,int b) {
        return a+b;
    }
}
