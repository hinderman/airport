package co.com.airport.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import co.com.airport.entities.Flight;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    @Query("SELECT f.id, f.arrivalAirportName, f.arrivalCity, f.arrivalDate, f.departureAirportName, f.departureDate, f.departureCity FROM Flight f")
    List<Flight> findFlightByFilters(String departureAirportName, String arrivalAirportName, String departureDate);
}
