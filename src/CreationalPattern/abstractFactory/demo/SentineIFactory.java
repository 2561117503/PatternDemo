package CreationalPattern.abstractFactory.demo;

import CreationalPattern.abstractFactory.demo.Hero.AgileHero;
import CreationalPattern.abstractFactory.demo.Hero.Impl.AgileHeroImpl;
import CreationalPattern.abstractFactory.demo.Hero.Impl.IntellectualHeroImpl;
import CreationalPattern.abstractFactory.demo.Hero.Impl.StrengHeroImpl;
import CreationalPattern.abstractFactory.demo.Hero.IntellectualHero;
import CreationalPattern.abstractFactory.demo.Hero.StrengHero;

/**
 * Created by yangenneng on 2017-03-22 9:54
 * Abstract：近卫军团工厂
 */
public class SentineIFactory implements IHeroFactory {

    public StrengHero getStrengHero() {
        return new StrengHeroImpl("流浪剑客");
    }

    public AgileHero getAgileHero() {
        return new AgileHeroImpl("剑圣");
    }

    public IntellectualHero getIntellectualHero() {
        return new IntellectualHeroImpl("仙女龙");
    }
}
