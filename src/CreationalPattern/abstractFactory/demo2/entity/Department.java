package CreationalPattern.abstractFactory.demo2.entity;

/**
 * Created by yangenneng on 2017-03-22 11:22
 * Abstract：
 */
public class Department {
    private int deptId;     //部门ID
    private int StaffNumber;//部门人数

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getStaffNumber() {
        return StaffNumber;
    }

    public void setStaffNumber(int staffNumber) {
        StaffNumber = staffNumber;
    }
}
