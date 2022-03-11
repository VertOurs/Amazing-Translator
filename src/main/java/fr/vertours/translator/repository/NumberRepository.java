package fr.vertours.translator.repository;

import fr.vertours.translator.model.Number;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NumberRepository extends JpaRepository<Number, Long> {
}
