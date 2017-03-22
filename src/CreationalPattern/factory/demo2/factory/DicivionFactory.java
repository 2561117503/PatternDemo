package CreationalPattern.factory.demo2.factory;

import CreationalPattern.factory.demo2.operation.DivisionOperation;
import CreationalPattern.factory.demo2.operation.IOperation;

/**
 * Created by yangenneng on 2017-03-22 11:00
 * Abstract：
 */
public class DicivionFactory implements IFactoty {

    @Override
    public IOperation createOperation() {
        return new DivisionOperation();
    }
}
