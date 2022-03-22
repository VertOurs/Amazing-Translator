package fr.vertours.translator.service;

import fr.vertours.translator.model.Num;
import fr.vertours.translator.repository.NumRepository;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
class NumServiceImplTest {

//    private NumRepository repository = mock(NumRepository.class);
//
//    private NumberServiceImpl classUnderTest =
//            new NumberServiceImpl(repository);



    @Test
    void getTranslation() {
//        Num num = getFR5();
//        when(repository.findByLanguageAndNum(num.getLanguage(),
//                num.getNum())).thenReturn(num);
//
//        String actual = classUnderTest.getTranslation("fr", 5);
//
//        verify(repository, times(1))
//                .findByLanguageAndNum(num.getLanguage(), num.getNum());
//        assertEquals("cinq", actual);


    }

    private Num getFR5() {
        return new Num("cinq", "FR",5);
    }
}