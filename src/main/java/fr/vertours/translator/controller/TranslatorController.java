package fr.vertours.translator.controller;

import fr.vertours.translator.service.NumberService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TranslatorController {

    private final NumberService service;

    public TranslatorController(NumberService service) {
        this.service = service;
    }

    //http://localhost:8080/french?nombre=8
    @GetMapping("/french")
    public ResponseEntity<String> getFrenchTranslation(
            @RequestParam("number") int num) {
        return ResponseEntity.ok().body(service.getFrenchTranslation(num));
    }
    //http://localhost:8080/deutsche?number=5
    @GetMapping("/german")
    public ResponseEntity<String> getDeutscheTranslation(
            @RequestParam("number") int num) {
        return ResponseEntity.ok().body(service.getDeutscheTranslation(num));
    }

    //http://localhost:8080/english?number=14
    @GetMapping("/english")
    public ResponseEntity<String> getEnglishTranslation(
            @RequestParam("number") int num) {
        return ResponseEntity.ok().body(service.getEnglishTranslation(num));
    }
}
