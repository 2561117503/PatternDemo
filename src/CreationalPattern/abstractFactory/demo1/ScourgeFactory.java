package CreationalPattern.abstractFactory.demo1;

import CreationalPattern.abstractFactory.demo1.Hero.AgileHero;
import CreationalPattern.abstractFactory.demo1.Hero.Impl.AgileHeroImpl;
import CreationalPattern.abstractFactory.demo1.Hero.Impl.IntellectualHeroImpl;
import CreationalPattern.abstractFactory.demo1.Hero.Impl.StrengHeroImpl;
import CreationalPattern.abstractFactory.demo1.Hero.IntellectualHero;
import CreationalPattern.abstractFactory.demo1.Hero.StrengHero;

/**
 * Created by yangenneng on 2017-03-22 9:57
 * Abstract：
 */
public class ScourgeFactory implements IHeroFactory {
    public StrengHero getStrengHero() {
        return new StrengHeroImpl("斧王");
    }

    public AgileHero getAgileHero() {
        return new AgileHeroImpl("影魔");
    }

    public IntellectualHero getIntellectualHero() {
        return new IntellectualHeroImpl("召唤师");
    }
}
