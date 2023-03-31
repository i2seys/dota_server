package ru.savenkov.dota_server.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.savenkov.dota_server.model.HeroDisadvantage;

@Repository
public interface DisadvantageRepository extends CrudRepository<HeroDisadvantage, Integer> {
}
