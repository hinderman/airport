package co.com.airport.entities;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "flights")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Flight {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String departureDate;
    private String departureAirportName;
    private String departureCity;
    private String departureLocale;
    private String arrivalCity;
    private String arrivalDate;
    private String arrivalAirportCode;
    private String arrivalAirportName;
    private String arrivalLocale;
    private int ticketPrice;
    private String ticketCurrency;
    private int flightNumber;
    private int seatCapacity;

    @ManyToOne
    @JoinColumn(name = "booking_id")
    private Booking booking_flight;

    public Flight updateWith(Flight pFlight){
        return new Flight(
            this.id, 
            pFlight.departureDate, 
            pFlight.departureAirportName, 
            pFlight.departureCity, 
            pFlight.departureLocale, 
            pFlight.arrivalCity, 
            pFlight.arrivalDate, 
            pFlight.arrivalAirportCode, 
            pFlight.arrivalAirportName, 
            pFlight.arrivalLocale, 
            pFlight.ticketPrice, 
            pFlight.ticketCurrency, 
            pFlight.flightNumber, 
            pFlight.seatCapacity,
            pFlight.booking_flight
        );
    }
}
