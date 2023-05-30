package co.com.airport.services;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import co.com.airport.entities.Flight;

public interface FlightService {
    List<Flight> findAll();
    List<Flight> findFlightByFilters(String departureAirportName, String arrivalAirportName, String departureDate);
    Optional<Flight> find(Long id);
    Flight create(Flight course);
    Optional<Flight> update(Long id, Flight newCourse);
    void delete(Long id);
}
