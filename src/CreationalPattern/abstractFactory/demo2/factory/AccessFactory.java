package CreationalPattern.abstractFactory.demo2.factory;

import CreationalPattern.abstractFactory.demo2.entity.Department;
import CreationalPattern.abstractFactory.demo2.entity.User;
import CreationalPattern.abstractFactory.demo2.factory.IFactory;
import CreationalPattern.abstractFactory.demo2.sqloperation.AccessDept;
import CreationalPattern.abstractFactory.demo2.sqloperation.AccessUser;
import CreationalPattern.abstractFactory.demo2.sqloperation.IDatabase;
import CreationalPattern.factory.demo2.operation.IOperation;

/**
 * Created by yangenneng on 2017-03-22 11:42
 * Abstract：
 */
public class AccessFactory implements IFactory {


    @Override
    public IDatabase<User> createUser() {
        return new AccessUser();
    }

    @Override
    public IDatabase<Department> createDepartment() {
        return new AccessDept();
    }
}
