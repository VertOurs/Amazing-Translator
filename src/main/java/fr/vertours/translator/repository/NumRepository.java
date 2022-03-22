package fr.vertours.translator.repository;

import fr.vertours.translator.model.Num;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumRepository extends JpaRepository<Num, Long> {

    Num findByLanguageAndNum(String lang, int num);
}
