package ru.savenkov.dota_server.model;

import jakarta.persistence.*;
import ru.savenkov.dota_server.config.DotabuffInfo;

@Entity
public class HeroWinrate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name="hero_name")
    private DotabuffInfo.HEROES hero;
    @Column(name="winrate")
    private Double winrate;

    public HeroWinrate(DotabuffInfo.HEROES hero, Double winrate) {
        this.hero = hero;
        this.winrate = winrate;
    }

    public HeroWinrate(Integer id, DotabuffInfo.HEROES hero, Double winrate) {
        this.id = id;
        this.hero = hero;
        this.winrate = winrate;
    }

    public HeroWinrate() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public DotabuffInfo.HEROES getHero() {
        return hero;
    }

    public void setHero(DotabuffInfo.HEROES hero) {
        this.hero = hero;
    }

    public Double getWinrate() {
        return winrate;
    }

    public void setWinrate(Double winrate) {
        this.winrate = winrate;
    }

}
