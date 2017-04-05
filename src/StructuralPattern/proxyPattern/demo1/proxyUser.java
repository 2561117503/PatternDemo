package StructuralPattern.proxyPattern.demo1;

/**
 * Created by yangenneng on 2017-04-05 10:50
 * Abstract：代理用户
 */
public class proxyUser implements IUserOp {

    @Override
    public void browse() {
        System.out.println("用户浏览了csdn博客");
    }

    @Override
    public void readWrite() {
        System.out.println("用户发布了csdn博客");
    }

    @Override
    public void anthorityManagement() {
        System.out.println("用户进行了csdn博客权限管理");
    }
}
