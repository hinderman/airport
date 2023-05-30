// package co.com.airport.services;
// import java.util.List;
// import java.util.Optional;
// import org.springframework.stereotype.Service;
// import co.com.airport.entities.Booking;
// import co.com.airport.repositories.BookingRepository;

// @Service
// public class BookingServiceImp implements BookingService{
//     private final BookingRepository _BookingRepository;

//     public BookingServiceImp(BookingRepository pBookingRepository) {
//         this._BookingRepository = pBookingRepository;
//     }
    
//     @Override
//     public List<Booking> findAll() {
//         return _BookingRepository.findAll();
//      }

//     @Override
//     public Optional<Booking> find(Long id) {
//         return _BookingRepository.findById(id);
//     }

//     @Override
//     public Booking create(Booking pBooking) {
//         Booking createBooking = new Booking(
//             null, 
//             pBooking.getStatus(), 
//             pBooking.getFlight(), 
//             pBooking.getPaymentToken(), 
//             true, 
//             pBooking.getUser(), 
//             pBooking.getCreatedAt(), 
//             pBooking.getBookingReference()
//         );
//         return _BookingRepository.save(createBooking);
//     }

//     @Override
//     public Optional<Booking> update(Long id, Booking newBooking) {
//         return _BookingRepository.findById(id).map(x -> {
//             Booking UpdateBooking = x.updateWith(newBooking);
//             return _BookingRepository.save(UpdateBooking);
//         });
//     }

//     @Override
//     public void delete(Long id) {
//         _BookingRepository.deleteById(id);
//     }
    
// }
