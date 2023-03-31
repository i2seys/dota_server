package ru.savenkov.dota_server.model;

import jakarta.persistence.*;
import ru.savenkov.dota_server.config.DotabuffInfo;
import ru.savenkov.dota_server.config.*;

@Entity(name="hero_disadvantage")
public class HeroDisadvantage {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="inner_hero")
    private DotabuffInfo.HEROES innerHero;
    @Column(name="outer_hero")
    private DotabuffInfo.HEROES outerHero;
    @Column(name="percent")
    private Double percent;

    public HeroDisadvantage(Integer id, DotabuffInfo.HEROES innerHero, DotabuffInfo.HEROES outerHero, double percent) {
        this.id = id;
        this.innerHero = innerHero;
        this.outerHero = outerHero;
        this.percent = percent;
    }

    public HeroDisadvantage(DotabuffInfo.HEROES innerHero, DotabuffInfo.HEROES outerHero, double percent) {
        this.innerHero = innerHero;
        this.outerHero = outerHero;
        this.percent = percent;
    }

    public HeroDisadvantage() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DotabuffInfo.HEROES getInnerHero() {
        return innerHero;
    }

    public void setInnerHero(DotabuffInfo.HEROES innerHero) {
        this.innerHero = innerHero;
    }

    public DotabuffInfo.HEROES getOuterHero() {
        return outerHero;
    }

    public void setOuterHero(DotabuffInfo.HEROES outerHero) {
        this.outerHero = outerHero;
    }

    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }
}
