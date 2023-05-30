// package co.com.airport.api;
// import java.util.List;
// import java.util.stream.Collectors;
// import java.net.URI;
// import org.springframework.http.HttpStatus;
// import org.springframework.http.ResponseEntity;
// import org.springframework.security.access.prepost.PreAuthorize;
// import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.PathVariable;
// import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PutMapping;
// import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RestController;
// import org.springframework.web.servlet.support.ServletUriComponentsBuilder;
// import co.com.airport.api.dto.BookingDto;
// import co.com.airport.api.mapper.BookingMapper;
// import co.com.airport.entities.Booking;
// import co.com.airport.exceptions.BookingNotFoundException;
// import co.com.airport.exceptions.DuplicateException;
// import co.com.airport.services.BookingService;

// @RestController
// @RequestMapping("/api/booking")
// public class BookingController {
    
//     private final BookingService _BookingService;
//     private final BookingMapper _BookingMapper;

//     public BookingController(BookingService pBookingService, BookingMapper pBookingMapper) {
//         this._BookingMapper = pBookingMapper;
//         this._BookingService = pBookingService;
//     }

//     @GetMapping("/getAll")
//     @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
//     public ResponseEntity<List<BookingDto>> findAll(){
//         List<Booking> lstBooking = _BookingService.findAll();
//         List<BookingDto> bookingDto = lstBooking.stream().map(x -> _BookingMapper.ToDto(x)).collect(Collectors.toList());
                                                        
//         return ResponseEntity.ok().body(bookingDto);
//     }

//     @GetMapping("/getById/{id}")
//     @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
//     public ResponseEntity<BookingDto> find(@PathVariable("id") Long id){
//         BookingDto bookingDto = _BookingService.find(id).map(x -> _BookingMapper.ToDto(x)).orElseThrow(BookingNotFoundException::new);

//         return ResponseEntity.status(HttpStatus.FOUND).body(bookingDto);
//     }

//     @PostMapping("/create")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<BookingDto> create(@RequestBody BookingDto pBookingDto){
        
//         Booking newBooking = _BookingMapper.ToEntity(pBookingDto);
//         Booking bookingCreated = null;
//         try {
//             bookingCreated = _BookingService.create(newBooking);
//         } catch (Exception e) {
//             throw new DuplicateException();
//         }
        
//         BookingDto bookingDto = _BookingMapper.ToDto(bookingCreated);
//         URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(bookingDto.getId()).toUri();

//         return ResponseEntity.created(location).body(bookingDto);
//     }

//     @PutMapping("/update/{id}")
//     @PreAuthorize("hasRole('ADMIN')")
//     public ResponseEntity<BookingDto> update(@PathVariable("id") Long id, @RequestBody BookingDto pBookingDto){

//         Booking bookingUpdate = _BookingMapper.ToEntity(pBookingDto) ;

//         return _BookingService.update(id, bookingUpdate).map(x -> ResponseEntity.ok().body(_BookingMapper.ToDto(bookingUpdate))).orElseGet(()->{
//             _BookingService.create(bookingUpdate);
//             BookingDto teacherCreationDto = _BookingMapper.ToDto(bookingUpdate);
//             URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(teacherCreationDto.getId()).toUri();
//             return ResponseEntity.created(location).body(teacherCreationDto);
//         });
//     }
// }
