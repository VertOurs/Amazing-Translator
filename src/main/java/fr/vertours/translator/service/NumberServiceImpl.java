package fr.vertours.translator.service;

import fr.vertours.translator.exception.InaccurateNumberOrLangException;
import fr.vertours.translator.model.Number;
import fr.vertours.translator.repository.NumberRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

import static fr.vertours.translator.utils.CaseConverter.verifyUpperCase;

@Service
public class NumberServiceImpl implements NumberService {

    private final NumberRepository repository;

    public NumberServiceImpl(NumberRepository repository) {
        this.repository = repository;
    }

    @Override
    public String getTranslation(String lang, int num) {
        String lang1 = verifyUpperCase(lang);
        Number number = Optional.ofNullable(repository.findByLanguageAndNumber(lang1, num))
                .orElseThrow(() -> new InaccurateNumberOrLangException());
        return number.getTranslation();
    }
}
