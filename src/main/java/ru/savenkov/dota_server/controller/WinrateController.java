package ru.savenkov.dota_server.controller;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.savenkov.dota_server.config.DotabuffInfo;
import ru.savenkov.dota_server.model.HeroWinrate;
import ru.savenkov.dota_server.repository.WinrateRepository;

import java.io.IOException;
import java.util.List;
import java.util.stream.StreamSupport;

@RestController
@RequestMapping("/dota/v1/winrate")
public class WinrateController {
    @Autowired
    private DotabuffInfo dotabuffInfo;
    @Autowired
    private WinrateRepository winrateRepository;
    @GetMapping("/get")//
    public ResponseEntity<List<HeroWinrate>> getWinrateData(){
        return new ResponseEntity<>(StreamSupport.stream(winrateRepository.findAll().spliterator(), false)
                .toList(), HttpStatus.OK);
    }
    @GetMapping("/update")
    public void deleteAndInsertWinrateData(){
        winrateRepository.deleteAll();

        //парсинг и добавление
        for(DotabuffInfo.HEROES hero : DotabuffInfo.HEROES.values()){

            Document doc = null;
            try {
                doc = Jsoup.connect(dotabuffInfo.heroesRefs.get(hero))
                        .userAgent("Chrome/4.0.249.0 Safari/532.5")
                        .referrer("https://google.com/")
                        .get();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            Double winrate = Double.parseDouble(doc.select("dl dd").get(1).text().replace("%", ""));
            HeroWinrate heroWinrate = new HeroWinrate(hero, winrate);
            winrateRepository.save(heroWinrate);
        }
    }
}
