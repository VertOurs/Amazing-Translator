package fr.vertours.translator.exception;

public class InaccurateNumberException extends RuntimeException {



    @Override
    public String getMessage() {
        return "this application only works for integers between 1 and 30. please check the validity of your request.";
    }
}
