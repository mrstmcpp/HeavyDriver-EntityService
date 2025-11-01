package org.mrstm.uberentityservice.dto.passenger;

import lombok.*;
import org.mrstm.uberentityservice.models.BookingStatus;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerBookingDTO {
    private Long bookingId;
    private BookingStatus status;
    private Double fare;
    private Date createdAt;
    private Long driverId;
    private String driverName;
}
