package fr.vertours.translator.service;

import fr.vertours.translator.model.Number;
import fr.vertours.translator.repository.NumberRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class NumberServiceImplTest {

    private NumberRepository repository = mock(NumberRepository.class);

    private NumberServiceImpl classUnderTest =
            new NumberServiceImpl(repository);



    @Test
    void getTranslation() {
        Number num = getFR5();
        when(repository.findByLanguageAndNumber(num.getLanguage(),
                num.getNumber())).thenReturn(num);

        String actual = classUnderTest.getTranslation("fr", 5);

        verify(repository, times(1))
                .findByLanguageAndNumber(num.getLanguage(), num.getNumber());
        assertEquals("cinq", actual);


    }

    private Number getFR5() {
        return new Number(5, "FR","cinq");
    }
}