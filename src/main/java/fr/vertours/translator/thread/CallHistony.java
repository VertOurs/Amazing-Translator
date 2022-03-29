package fr.vertours.translator.thread;

import fr.vertours.translator.model.Num;
import org.springframework.web.client.RestTemplate;

public class CallHistony implements Runnable{


    public CallHistony(Num number, RestTemplate restTemplate) {
    }

    @Override
    public void run() {
        restTemplate.postForObject("http://localhost:8081/historique",number, Num.class);
    }
}
