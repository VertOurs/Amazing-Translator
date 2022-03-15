package fr.vertours.translator.service;

import fr.vertours.translator.exception.InaccurateNumberException;
import fr.vertours.translator.model.Number;
import fr.vertours.translator.repository.NumberRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class NumberServiceImpl implements NumberService {

    private final NumberRepository repository;

    public NumberServiceImpl(NumberRepository repository) {
        this.repository = repository;
    }

    private Number getNumberObjectByNumber(int num) {
        Number number = Optional.ofNullable(repository.findByNumber(num))
                .orElseThrow(() -> new InaccurateNumberException());
        return number ;
    }

    @Override
    public String getFrenchTranslation(int num) {
        return getNumberObjectByNumber(num).getFrench();

    }

    @Override
    public String getDeutscheTranslation(int num) {
        return getNumberObjectByNumber(num).getGerman();
    }

    @Override
    public String getEnglishTranslation(int num) {
        return getNumberObjectByNumber(num).getEnglish();
    }
}
