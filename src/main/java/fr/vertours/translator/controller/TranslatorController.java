package fr.vertours.translator.controller;


import fr.vertours.translator.model.Num;
import fr.vertours.translator.service.NumberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//SYnchro
@RestController()
public class TranslatorController {

    private final NumberService service;
    private final RestTemplate restTemplate;

    public TranslatorController(NumberService service, RestTemplate restTemplate) {
        this.service = service;
        this.restTemplate = restTemplate;
    }



    //http://localhost:8080/FR?nombre=8
    @GetMapping(path = "/{language}")
    public ResponseEntity<String> getFrenchTranslation(
            @PathVariable(name = "language") String lang,
            @RequestParam("number") int num) {

        return ResponseEntity.ok().body(service.getTranslation(lang, num).getTranslation());
    }
}
