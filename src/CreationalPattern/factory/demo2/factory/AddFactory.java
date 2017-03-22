package CreationalPattern.factory.demo2.factory;

import CreationalPattern.factory.demo2.operation.AddOperation;
import CreationalPattern.factory.demo2.operation.IOperation;

/**
 * Created by yangenneng on 2017-03-22 10:57
 * Abstract：
 */
public class AddFactory implements IFactoty {

    @Override
    public IOperation createOperation() {
        return new AddOperation();
    }
}
