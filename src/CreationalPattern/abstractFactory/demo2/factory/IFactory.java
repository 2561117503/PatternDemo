package CreationalPattern.abstractFactory.demo2.factory;

import CreationalPattern.abstractFactory.demo2.entity.Department;
import CreationalPattern.abstractFactory.demo2.entity.User;
import CreationalPattern.abstractFactory.demo2.sqloperation.IDatabase;

/**
 * Created by yangenneng on 2017-03-22 11:25
 * Abstract：
 */
public interface IFactory {
    public IDatabase<User> createUser();
    public IDatabase<Department> createDepartment();
}
