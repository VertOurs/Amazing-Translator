package fr.vertours.translator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Number {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private String french;
    private String english;
    private String deutsche;

    public Number(Integer number, String french, String english, String deutsche) {
        this.number = number;
        this.french = french;
        this.english = english;
        this.deutsche = deutsche;
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

    public String getDeutsche() {
        return deutsche;
    }

    public void setDeutsche(String deutsche) {
        this.deutsche = deutsche;
    }
}
