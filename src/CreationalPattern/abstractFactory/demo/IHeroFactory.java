package CreationalPattern.abstractFactory.demo;

import CreationalPattern.abstractFactory.demo.Hero.AgileHero;
import CreationalPattern.abstractFactory.demo.Hero.IntellectualHero;
import CreationalPattern.abstractFactory.demo.Hero.StrengHero;

/**
 * Created by yangenneng on 2017-03-22 9:46
 * Abstract：英雄生产抽象工厂
 */
public interface IHeroFactory {
    public StrengHero getStrengHero();
    public AgileHero getAgileHero();
    public IntellectualHero getIntellectualHero();
}
