package CreationalPattern.abstractFactory.demo2;

import CreationalPattern.abstractFactory.demo2.entity.Department;
import CreationalPattern.abstractFactory.demo2.entity.User;
import CreationalPattern.abstractFactory.demo2.factory.AccessFactory;
import CreationalPattern.abstractFactory.demo2.factory.IFactory;
import CreationalPattern.abstractFactory.demo2.factory.MySQLFactory;
import CreationalPattern.abstractFactory.demo2.sqloperation.AccessUser;
import CreationalPattern.abstractFactory.demo2.sqloperation.IDatabase;

/**
 * Created by yangenneng on 2017-03-22 11:45
 * Abstract：
 */
public class Demo {
    public static void main(String[] args) {
        User user=new User();
        user.setUserId(1);
        user.setUserName("yangenneng");

        Department department=new Department();
        department.setDeptId(1);
        department.setStaffNumber(10);

        /*Access数据库*/
        IFactory iFactory=new AccessFactory();
        IDatabase iDatabase=iFactory.createUser();
        iDatabase.insert(user);
        iDatabase.query(user);

       iDatabase=iFactory.createDepartment();
       iDatabase.insert(department);
       iDatabase.query(department);

        System.out.println("-------------------------------------");

       /*Access数据库*/
        iFactory=new MySQLFactory();
        iDatabase=iFactory.createUser();
        iDatabase.insert(user);
        iDatabase.query(user);

        iDatabase=iFactory.createDepartment();
        iDatabase.insert(department);
        iDatabase.query(department);

    }

}
