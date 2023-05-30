package co.com.airport.api;

import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import co.com.airport.api.dto.FlightDto;
import co.com.airport.api.mapper.FlightMapper;
import co.com.airport.entities.Flight;
import co.com.airport.services.FlightService;

@RestController
@RequestMapping("/api/flight")
public class FlightController {
    private final FlightService _FlightService;
    private final FlightMapper _FlightMapper;

    public FlightController(FlightService pFlightService, FlightMapper pFlightMapper) {
        this._FlightMapper = pFlightMapper;
        this._FlightService = pFlightService;
    }

    @GetMapping("/getAll")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<List<FlightDto>> findAll(){
        List<Flight> lstFlight = _FlightService.findAll();
        List<FlightDto> lstFlightDto = lstFlight.stream().map(x -> _FlightMapper.ToDto(x)).collect(Collectors.toList());
                                                        
        return ResponseEntity.ok().body(lstFlightDto);
    }

    @GetMapping("/getFlightByFilters")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public ResponseEntity<List<Flight>> getFlightByFilters(@RequestParam("departureAirportName") String departureAirportName, @RequestParam("arrivalAirportName") String arrivalAirportName, @RequestParam("departureDate") String departureDate) {
        List<Flight> lstFlight = _FlightService.findAll();
        //List<FlightDto> lstFlightDto = lstFlight.stream().map(x -> _FlightMapper.ToDto(x)).collect(Collectors.toList());
        return ResponseEntity.ok().body(lstFlight);
    }
    
}
