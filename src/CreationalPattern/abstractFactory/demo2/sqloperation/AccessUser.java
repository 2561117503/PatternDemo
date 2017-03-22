package CreationalPattern.abstractFactory.demo2.sqloperation;

import CreationalPattern.abstractFactory.demo2.entity.User;

/**
 * Created by yangenneng on 2017-03-22 11:28
 * Abstract：
 */
public class AccessUser implements IDatabase<User> {

    @Override
    public void insert(User user) {
        System.out.println("向Access数据库中插入员工:"+user.getUserId()+"   "+user.getUserName());
    }

    @Override
    public void query(User user) {
        System.out.println("向Access数据库中查询员工:"+user.getUserId()+"   "+user.getUserName());
    }
}
