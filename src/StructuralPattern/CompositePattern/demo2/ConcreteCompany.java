package StructuralPattern.CompositePattern.demo2;

import java.util.ArrayList;

/**
 * Created by yangenneng on 2017-05-03 10:35
 * Abstract：树枝节点
 */
public class ConcreteCompany implements Company {

    private ArrayList<Company> companyArrayList=new ArrayList<Company>();

    private String name;//姓名
    private String sex;//性别
    private String position;//职位
    private String salary;//薪水

    public ConcreteCompany(String name,String sex,String position,String salary){
        this.name=name;
        this.sex=sex;
        this.position=position;
        this.salary=salary;
    }

    public void add(Company company){
        this.companyArrayList.add(company);
    }

    public void remove(Company company){
        this.companyArrayList.remove(company);
    }

    public ArrayList<Company> getChild(){
        return this.companyArrayList;
    }

    @Override
    public String getInfo() {
        return name+" "+sex+" "+position+" "+salary;
    }
}
