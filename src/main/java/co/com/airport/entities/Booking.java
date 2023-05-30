package co.com.airport.entities;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "bookings")
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "bookings_booking_status", joinColumns = @JoinColumn(name = "booking_id"), inverseJoinColumns = @JoinColumn(name = "status_id"))
    private Set<BookingStatus> status = new HashSet<>();

    @JsonIgnore
    @OneToMany(mappedBy="booking_flight")
    private Set<Flight> flight = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    private String createdAt;
    private String bookingReference;
    private String  paymentToken;
    private boolean checkedIn;

    public Booking updateWith(Booking pBooking){
        return pBooking;
        // return new Booking(
        //     this.id,
        //     pBooking.paymentToken,
        //     pBooking.checkedIn,
        //     pBooking.createdAt,
        //     pBooking.bookingReference,
        //     pBooking.status
        // );
    }
}
