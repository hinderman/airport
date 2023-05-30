package co.com.airport.exceptions;

public class DuplicateException extends RuntimeException{
    
    public DuplicateException() {
        super("The item is duplicated");
    }

    public DuplicateException(String pMessage) {
        super(pMessage);
    }
}
