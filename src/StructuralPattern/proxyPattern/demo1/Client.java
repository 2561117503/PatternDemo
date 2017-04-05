package StructuralPattern.proxyPattern.demo1;

/**
 * Created by yangenneng on 2017-04-05 10:50
 * Abstract：客户端测试类
 */
public class Client {
    public static void main(String[] args) {
        IUserOp iUser=null;
        System.out.println("---------------游客-----------------");
        iUser=new GenericUser();
        iUser.browse();
        iUser.readWrite();
        iUser.anthorityManagement();
        System.out.println("---------------会员-----------------");
        iUser=new RegisteredUser();
        iUser.browse();
        iUser.readWrite();
        iUser.anthorityManagement();
        System.out.println("---------------管理员---------------");
        iUser=new Administrator();
        iUser.browse();
        iUser.readWrite();
        iUser.anthorityManagement();
    }
}
