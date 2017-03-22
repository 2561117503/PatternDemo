package CreationalPattern.abstractFactory.demo.Hero.Impl;

import CreationalPattern.abstractFactory.demo.Hero.StrengHero;

/**
 * Created by yangenneng on 2017-03-22 9:48
 * Abstract：力量英雄实现
 */
public class StrengHeroImpl implements StrengHero {

    private String name;
    public StrengHeroImpl(String name){
        this.name=name;
    }

    public void creatHero() {
        System.out.println("创建力量型英雄："+name);
    }
}
