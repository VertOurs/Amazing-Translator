package fr.vertours.translator.service;

import fr.vertours.translator.model.Num;

public interface NumberService {

    Num getTranslation(String lang, int num);

}
