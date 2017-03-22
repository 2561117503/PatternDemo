package CreationalPattern.abstractFactory.demo2.entity;

/**
 * Created by yangenneng on 2017-03-22 11:22
 * Abstract：
 */
public class User {
    private int userId;     //员工ID
    private String userName;//员工姓名

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
