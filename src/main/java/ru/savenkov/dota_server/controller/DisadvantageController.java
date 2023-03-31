package ru.savenkov.dota_server.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.savenkov.dota_server.model.HeroDisadvantage;
import ru.savenkov.dota_server.config.*;
import ru.savenkov.dota_server.repository.DisadvantageRepository;


import java.io.IOException;
import java.util.List;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/dota/v1/disadvantage")
public class DisadvantageController {
    @Autowired
    private DotabuffInfo dotabuffInfo;
    @Autowired
    private DisadvantageRepository disadvantageRepository;
    @GetMapping("/update")//
    public void deleteAndInsertDisadvantageData(){
        //1)удаляем все данные
        disadvantageRepository.deleteAll();

        //2)парсим данные с сайта
        for(DotabuffInfo.HEROES outerHero : DotabuffInfo.HEROES.values()){

            Document doc = null;
            try {
                doc = Jsoup.connect(dotabuffInfo.countersRefs.get(outerHero))
                        .userAgent("Chrome/4.0.249.0 Safari/532.5")
                        .referrer("https://google.com/")
                        .get();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            for(DotabuffInfo.HEROES innerHero : DotabuffInfo.HEROES.values()){
                if (innerHero == outerHero){
                    continue;
                }
                int inner_hero_index = innerHero.ordinal();
                String inner_hero_raw = dotabuffInfo.rawHeroesString[inner_hero_index];
                String selector = String.format("[data-link-to=\"/heroes/%s\"] td", inner_hero_raw);
                double percent = Double.parseDouble(doc.select(selector).get(2).attr("data-value"));
                HeroDisadvantage heroDisadvantage = new HeroDisadvantage(innerHero, outerHero, percent);
                disadvantageRepository.save(heroDisadvantage);
            }
        }
    }
    @GetMapping("/get")//
    public ResponseEntity<List<HeroDisadvantage>> getDisadvantageData(){
        return new ResponseEntity<>(StreamSupport.stream(disadvantageRepository.findAll().spliterator(), false)
                .toList(), HttpStatus.OK);
    }

}
