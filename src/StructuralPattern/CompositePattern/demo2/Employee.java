package StructuralPattern.CompositePattern.demo2;

/**
 * Created by yangenneng on 2017-05-03 10:40
 * Abstract：
 */
public class Employee implements Company {

    private String name;//姓名
    private String sex;//性别
    private String position;//职位
    private String salary;//薪水

    public Employee(String name,String sex,String position,String salary){
        this.name=name;
        this.sex=sex;
        this.position=position;
        this.salary=salary;
    }

    @Override
    public String getInfo() {
        return name+" "+sex+" "+position+" "+salary;
    }
}
