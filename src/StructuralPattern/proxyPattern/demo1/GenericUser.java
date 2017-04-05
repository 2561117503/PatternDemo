package StructuralPattern.proxyPattern.demo1;

/**
 * Created by yangenneng on 2017-04-05 10:47
 * Abstract：游客类 继承用户操作
 */
public class GenericUser implements IUserOp {

    proxyUser proxyUser=new proxyUser();
    @Override
    public void browse() {
        System.out.print("您是游客，权限验证通过-------：");
        proxyUser.browse();
    }

    @Override
    public void readWrite() {
        System.out.println("您是游客，权限不足-------：");
    }

    @Override
    public void anthorityManagement() {
        System.out.println("您是游客，权限不足-------：");
    }
}
