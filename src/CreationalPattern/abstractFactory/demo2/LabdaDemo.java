package CreationalPattern.abstractFactory.demo2;

/**
 * Created by yangenneng on 2017-03-22 12:07
 * Abstract：
 */
interface Command
{
    public void process(int[] target);
}
class processarray
{
    public void process(int[] target,Command c)
    {
        c.process(target);
    }
}

public class LabdaDemo {
    public static void main(String[] args)
    {
        processarray pro=new processarray();
        int[] array={1,2};
        pro.process(array,(int [] target)->
        {
            int sum=0;
            for(int tmp:target)
            {
                sum+=tmp;
            }
            System.out.println(sum);
        });
    }
}
