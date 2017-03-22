package CreationalPattern.abstractFactory.demo2.factory;

import CreationalPattern.abstractFactory.demo2.entity.Department;
import CreationalPattern.abstractFactory.demo2.entity.User;
import CreationalPattern.abstractFactory.demo2.sqloperation.IDatabase;
import CreationalPattern.abstractFactory.demo2.sqloperation.MySQLDept;
import CreationalPattern.abstractFactory.demo2.sqloperation.MySQLUser;

/**
 * Created by yangenneng on 2017-03-22 11:44
 * Abstract：
 */
public class MySQLFactory implements IFactory {

    @Override
    public IDatabase<User> createUser() {
        return new MySQLUser();
    }

    @Override
    public IDatabase<Department> createDepartment() {
        return new MySQLDept();
    }
}
