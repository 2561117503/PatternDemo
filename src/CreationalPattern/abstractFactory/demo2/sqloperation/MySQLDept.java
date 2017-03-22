package CreationalPattern.abstractFactory.demo2.sqloperation;

import CreationalPattern.abstractFactory.demo2.entity.Department;

/**
 * Created by yangenneng on 2017-03-22 11:37
 * Abstract：
 */
public class MySQLDept implements IDatabase<Department> {
    @Override
    public void insert(Department department) {
        System.out.println("向MySQL数据库中插入部门:"+department.getDeptId()+"   "+department.getStaffNumber());
    }

    @Override
    public void query(Department department) {
        System.out.println("向MySQL数据库中查询部门:"+department.getDeptId()+"   "+department.getStaffNumber());
    }
}
