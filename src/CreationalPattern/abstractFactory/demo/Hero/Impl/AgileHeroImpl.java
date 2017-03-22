package CreationalPattern.abstractFactory.demo.Hero.Impl;

import CreationalPattern.abstractFactory.demo.Hero.AgileHero;

/**
 * Created by yangenneng on 2017-03-22 9:50
 * Abstract：
 */
public class AgileHeroImpl implements AgileHero {

    private String name;
    public AgileHeroImpl(String name){
        this.name=name;
    }

    public void creatHero() {
        System.out.println("创建敏捷型英雄："+name);
    }
}
