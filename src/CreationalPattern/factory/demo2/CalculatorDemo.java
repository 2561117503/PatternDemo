package CreationalPattern.factory.demo2;

import CreationalPattern.factory.demo2.factory.AddFactory;
import CreationalPattern.factory.demo2.factory.IFactoty;
import CreationalPattern.factory.demo2.operation.IOperation;

import java.util.Scanner;

/**
 * Created by yangenneng on 2017-03-22 10:51
 * Abstract：
 */
public class CalculatorDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int a=scanner.nextInt();
        int b=scanner.nextInt();

        IFactoty iFactoty=new AddFactory();
        IOperation iOperation=iFactoty.createOperation();
        int result = iOperation.getResult(a,b);
        System.out.println("result="+result);
    }
}
