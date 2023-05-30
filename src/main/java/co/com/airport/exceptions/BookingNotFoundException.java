package co.com.airport.exceptions;

public class BookingNotFoundException extends RuntimeException{
    public BookingNotFoundException() {
        super("Booking not found");
    }

    public BookingNotFoundException(String pMessage) {
        super(pMessage);
    }
}
