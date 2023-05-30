// package co.com.airport.api.mapper;
// import org.springframework.stereotype.Component;

// import co.com.airport.api.dto.BookingDto;
// import co.com.airport.entities.Booking;

// @Component
// public class BookingMapper {
    
//     public BookingDto ToDto(Booking pBooking){
//         BookingDto mapBookingDto = new BookingDto();

//         mapBookingDto.setId(pBooking.getId());
//         mapBookingDto.setPaymentToken(pBooking.getPaymentToken());
//         mapBookingDto.setCheckedIn(true);
//         mapBookingDto.setIdCustomers(pBooking.getUser().getId());
//         mapBookingDto.setCreatedAt(pBooking.getCreatedAt());
//         mapBookingDto.setBookingReference(pBooking.getBookingReference());

//         return mapBookingDto;
//     }

//     public Booking ToEntity(BookingDto pBookingDto){
//         Booking mapBooking = new Booking();

//         mapBooking.setId(pBookingDto.getId());
//         mapBooking.setPaymentToken(pBookingDto.getPaymentToken());
//         mapBooking.setCheckedIn(true);
//         mapBooking.setCreatedAt(pBookingDto.getCreatedAt());
//         mapBooking.setBookingReference(pBookingDto.getBookingReference());

//         return mapBooking;
//     }
// }
