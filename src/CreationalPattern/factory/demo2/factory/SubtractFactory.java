package CreationalPattern.factory.demo2.factory;

import CreationalPattern.factory.demo2.operation.IOperation;
import CreationalPattern.factory.demo2.operation.SubtractOpreration;

/**
 * Created by yangenneng on 2017-03-22 10:58
 * Abstract：
 */
public class SubtractFactory implements IFactoty {

    @Override
    public IOperation createOperation() {
        return new SubtractOpreration();
    }
}
