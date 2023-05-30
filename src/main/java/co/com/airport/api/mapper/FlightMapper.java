// package co.com.airport.api.mapper;
// import org.springframework.stereotype.Component;
// import co.com.airport.api.dto.FlightDto;
// import co.com.airport.entities.Flight;

// @Component
// public class FlightMapper {

//     public FlightDto ToDto(Flight pFlight){

//         FlightDto mapFlightDto = new FlightDto();

//         mapFlightDto.setDepartureDate(pFlight.getDepartureDate());
//         mapFlightDto.setDepartureAirportName(pFlight.getDepartureAirportName());
//         mapFlightDto.setDepartureCity(pFlight.getDepartureCity());
//         mapFlightDto.setDepartureLocale(pFlight.getDepartureLocale());
//         mapFlightDto.setArrivalCity(pFlight.getArrivalCity());
//         mapFlightDto.setArrivalDate(pFlight.getArrivalDate());
//         mapFlightDto.setArrivalAirportCode(pFlight.getArrivalAirportCode());
//         mapFlightDto.setArrivalAirportName(pFlight.getArrivalAirportName());
//         mapFlightDto.setArrivalLocale(pFlight.getArrivalLocale());
//         mapFlightDto.setTicketPrice(pFlight.getTicketPrice());
//         mapFlightDto.setTicketCurrency(pFlight.getTicketCurrency());
//         mapFlightDto.setFlightNumber(pFlight.getFlightNumber());
//         mapFlightDto.setSeatCapacity(pFlight.getSeatCapacity());

//         return mapFlightDto;
//     }

//     public Flight ToEntity(FlightDto pFlightDto){

//         Flight mapFlight = new Flight();

//         mapFlight.setDepartureDate(pFlightDto.getDepartureDate());
//         mapFlight.setDepartureAirportName(pFlightDto.getDepartureAirportName());
//         mapFlight.setDepartureCity(pFlightDto.getDepartureCity());
//         mapFlight.setDepartureLocale(pFlightDto.getDepartureLocale());
//         mapFlight.setArrivalCity(pFlightDto.getArrivalCity());
//         mapFlight.setArrivalDate(pFlightDto.getArrivalDate());
//         mapFlight.setArrivalAirportCode(pFlightDto.getArrivalAirportCode());
//         mapFlight.setArrivalAirportName(pFlightDto.getArrivalAirportName());
//         mapFlight.setArrivalLocale(pFlightDto.getArrivalLocale());
//         mapFlight.setTicketPrice(pFlightDto.getTicketPrice());
//         mapFlight.setTicketCurrency(pFlightDto.getTicketCurrency());
//         mapFlight.setFlightNumber(pFlightDto.getFlightNumber());
//         mapFlight.setSeatCapacity(pFlightDto.getSeatCapacity());

//         return mapFlight;
//     }
// }
