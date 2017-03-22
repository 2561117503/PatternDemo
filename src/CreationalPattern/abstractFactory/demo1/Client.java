package CreationalPattern.abstractFactory.demo1;

import CreationalPattern.abstractFactory.demo1.Hero.StrengHero;

/**
 * Created by yangenneng on 2017-03-22 9:58
 * Abstract：
 */
public class Client {
    public static void main(String[] args) {

        IHeroFactory iHeroFactory=new SentineIFactory();//近卫军工厂
        StrengHero strengHero=iHeroFactory.getStrengHero();//力量型英雄
        strengHero.creatHero();

        System.out.println("-------------------------------------------------");

        iHeroFactory=new ScourgeFactory();//天灾军工厂
        strengHero=iHeroFactory.getStrengHero();//力量型英雄
        strengHero.creatHero();

    }
}
