package StructuralPattern.proxyPattern.demo1;

/**
 * Created by yangenneng on 2017-04-05 10:48
 * Abstract：已注册用户
 */
public class RegisteredUser implements IUserOp {
    proxyUser proxyUser=new proxyUser();
    @Override
    public void browse() {
        System.out.print("您是注册用户，权限验证通过-------：");
        proxyUser.browse();
    }

    @Override
    public void readWrite() {
        System.out.print("您是注册用户，权限验证通过-------：");
        proxyUser.readWrite();
    }

    @Override
    public void anthorityManagement() {
        System.out.println("您是注册用户，权限不足-------：");
    }
}
