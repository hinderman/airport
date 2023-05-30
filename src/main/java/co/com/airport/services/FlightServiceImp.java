// package co.com.airport.services;
// import java.util.List;
// import java.util.Optional;
// import org.springframework.stereotype.Service;
// import co.com.airport.entities.Flight;
// import co.com.airport.repositories.FlightRepository;

// @Service
// public class FlightServiceImp implements FlightService{
//     private final FlightRepository _FlightRepository;

//     public FlightServiceImp(FlightRepository pFlightRepository) {
//         this._FlightRepository = pFlightRepository;
//     }

//     @Override
//     public List<Flight> findAll() {
//         return _FlightRepository.findAll();
//     }

//     @Override
//     public Optional<Flight> find(Long id) {
//         return _FlightRepository.findById(id);
//     }

//     @Override
//     public Flight create(Flight pFlight) {
//         return _FlightRepository.save(pFlight);
//     }

//     @Override
//     public Optional<Flight> update(Long id, Flight newFlight) {
//         return _FlightRepository.findById(id).map(x ->{
//             Flight updateFlight = x.updateWith(newFlight);
//             return _FlightRepository.save(updateFlight);
//         });
//     }

//     @Override
//     public void delete(Long id) {
//         _FlightRepository.deleteById(id);
//     }
    
// }
