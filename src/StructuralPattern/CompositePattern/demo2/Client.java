package StructuralPattern.CompositePattern.demo2;

/**
 * Created by yangenneng on 2017-05-03 10:41
 * Abstract：
 */
public class Client {

    public static void main(String[] args) {
        ConcreteCompany root=new ConcreteCompany("王五","男","CEO","10000000");

        ConcreteCompany developDep=new ConcreteCompany("李四","男","程序开发","5000");
        ConcreteCompany salesDep=new ConcreteCompany("张三","男","销售部","3000");

        Employee employee1=new Employee("A","男","程序开发","3000");
        Employee employee2=new Employee("B","男","程序开发","3000");
        Employee employee3=new Employee("C","男","程序开发","3000");

        Employee employee4=new Employee("D","男","销售部","3000");
        Employee employee5=new Employee("E","男","销售部","3000");

        root.add(developDep);
        root.add(salesDep);

        developDep.add(employee1);
        developDep.add(employee2);
        developDep.add(employee3);

        salesDep.add(employee4);
        salesDep.add(employee5);

        display(root);
    }

    public static void display(ConcreteCompany root){
        for (Company c:root.getChild()){
            if(c instanceof Employee){
                System.out.println(c.getInfo());
            }else {
                System.out.println("\n"+c.getInfo());
                display((ConcreteCompany) c);
            }
        }
    }


}
