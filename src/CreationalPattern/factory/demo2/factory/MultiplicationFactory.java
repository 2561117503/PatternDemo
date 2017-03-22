package CreationalPattern.factory.demo2.factory;

import CreationalPattern.factory.demo2.operation.IOperation;
import CreationalPattern.factory.demo2.operation.MultiplicationOperation;

/**
 * Created by yangenneng on 2017-03-22 10:59
 * Abstract：
 */
public class MultiplicationFactory implements IFactoty {

    @Override
    public IOperation createOperation() {
        return new MultiplicationOperation();
    }
}
