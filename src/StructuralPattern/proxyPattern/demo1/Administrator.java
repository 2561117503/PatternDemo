package StructuralPattern.proxyPattern.demo1;

/**
 * Created by yangenneng on 2017-04-05 10:49
 * Abstract：论坛管理员
 */
public class Administrator implements IUserOp {

    proxyUser proxyUser=new proxyUser();
    @Override
    public void browse() {
        System.out.print("您是管理员，权限验证通过-------：");
        proxyUser.browse();
    }

    @Override
    public void readWrite() {
        System.out.print("您是管理员，权限验证通过-------：");
        proxyUser.readWrite();
    }


    @Override
    public void anthorityManagement() {
        System.out.print("您是管理员，权限验证通过-------：");
        proxyUser.anthorityManagement();
    }
}
