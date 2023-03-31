package ru.savenkov.dota_server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.savenkov.dota_server.model.HeroWinrate;

@Repository
public interface WinrateRepository extends CrudRepository<HeroWinrate, Integer> {
}
