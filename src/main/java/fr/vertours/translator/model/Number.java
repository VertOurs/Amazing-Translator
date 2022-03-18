package fr.vertours.translator.model;

import javax.persistence.*;

@Entity
@Table(name = "number")
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private String language;
    private String translation;

    public Number(Integer number, String language, String translation) {
        this.number = number;
        this.language = language;
        this.translation = translation;
    }

    public Number() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTranslation() {
        return translation;
    }

    public void setTranslation(String translation) {
        this.translation = translation;
    }
}
