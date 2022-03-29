package fr.vertours.translator.service;

import fr.vertours.translator.exception.InaccurateNumberOrLangException;
import fr.vertours.translator.model.Num;
import fr.vertours.translator.repository.NumRepository;
import fr.vertours.translator.thread.CallHistony;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import javax.transaction.Transactional;
import java.util.Optional;

import static fr.vertours.translator.utils.CaseConverter.verifyUpperCase;

@Service
public class NumberServiceImpl implements NumberService {

    private final NumRepository repository;
    private final RestTemplate restTemplate;

    public NumberServiceImpl(NumRepository repository, RestTemplate restTemplate) {
        this.repository = repository;
        this.restTemplate = restTemplate;
    }

    @Override
    @Transactional
    public Num getTranslation(String lang, int num) {
        String lang1 = verifyUpperCase(lang);
        Num number = Optional.ofNullable(repository.findByLanguageAndNum(lang1, num))
                .orElseThrow(() -> new InaccurateNumberOrLangException());
         Thread thread1 = new Thread(new CallHistony(number, restTemplate));
         thread1.start();
        return number;
    }


}
