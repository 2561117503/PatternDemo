package CreationalPattern.abstractFactory.demo2.sqloperation;

import CreationalPattern.abstractFactory.demo2.entity.User;

/**
 * Created by yangenneng on 2017-03-22 11:27
 * Abstract：
 */
public interface IDatabase <T>{
    public void insert(T t);
    public void query(T t);
}
