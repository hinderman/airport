package co.com.airport.api.dto;

import lombok.Data;

@Data
public class BookingDto {
    private Long id;
    private String nameStatus;
    private long idOutboundFlight;
    private String  paymentToken;
    private boolean checkedIn;
    private long idCustomers;
    private String createdAt;
    private String bookingReference;
}
