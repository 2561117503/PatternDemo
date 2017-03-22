package CreationalPattern.abstractFactory.demo.Hero.Impl;

import CreationalPattern.abstractFactory.demo.Hero.IntellectualHero;

/**
 * Created by yangenneng on 2017-03-22 9:52
 * Abstract：
 */
public class IntellectualHeroImpl implements IntellectualHero {
    private String name;
    public IntellectualHeroImpl(String name){
        this.name=name;
    }

    public void creatHero() {
        System.out.println("创建智力型英雄："+name);
    }
}
