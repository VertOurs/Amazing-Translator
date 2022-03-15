package fr.vertours.translator.model;

import javax.persistence.*;

@Entity
@Table(name = "number")
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private String french;
    private String english;
    private String german;

    public Number(Integer number, String french, String english, String german) {
        this.number = number;
        this.french = french;
        this.english = english;
        this.german = german;
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

    public String getFrench() {
        return french;
    }

    public void setFrench(String french) {
        this.french = french;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getGerman() {
        return german;
    }

    public void setGerman(String deutsche) {
        this.german = deutsche;
    }
}
