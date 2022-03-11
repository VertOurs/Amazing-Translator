package fr.vertours.translator.config;

import fr.vertours.translator.model.Number;
import fr.vertours.translator.repository.NumberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataLoader {

    @Autowired
    private NumberRepository repository;

    @Bean
    CommandLineRunner commandLineRunner(){
        return args -> {
            Number number = new Number(1,"un", "one", "ein");
//            repository.save(number);
        };
    }
}
