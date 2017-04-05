package CreationalPattern.builder.demo1;

/**
 * Created by yangenneng on 2017-04-05 11:31
 * Abstract：
 */
public class Client {

    public static void main(String[] args) {
        Person person=null;
        System.out.println("--------------创建一个胖子---------------------");
        FatPerson fatPerson=new FatPerson();
        new PersonDirector().builderP(fatPerson);
        person=fatPerson.getPerson();
        person.ShowPerson();
        System.out.println("--------------创建一个瘦子---------------------");
        ThinPerson thinPerson=new ThinPerson();
        new PersonDirector().builderP(thinPerson);
        person=thinPerson.getPerson();
        person.ShowPerson();
    }
}
