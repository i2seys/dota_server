
package ru.savenkov.dota_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DotaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(DotaServerApplication.class, args);
	}

}
/*
* 1)парсер страницы
* 2)6 контроллеров - первый полностью удаляет и обновляет данные в бд, второй - вытаскивает данные из бд
* (для таблицы с винрейтами героев и для таблицы с преимуществами) и 2 контроллера для получения и обновления айди героев
* 3)классы модели - heroWinrate, heroesDisadvantage и heroId (одна строчка отражает один экземпляр класса)
* 4)3 репозитория - для heroWinrate, heroesDisadvantage и heroId
*
* */
