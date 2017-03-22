package CreationalPattern.factory.demo2.factory;

import CreationalPattern.factory.demo2.operation.IOperation;

/**
 * Created by yangenneng on 2017-03-22 10:56
 * Abstract：
 */
public interface IFactoty {
    public IOperation createOperation();
}
