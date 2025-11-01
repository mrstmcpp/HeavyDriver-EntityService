package org.mrstm.uberentityservice.dto.booking;

import lombok.*;
import org.mrstm.uberentityservice.models.ExactLocation;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class GetBookingDetailsDTO {
    private Long driverId;
    private Long bookingId;
    private String driverName;
    private String passengerName;
    private String bookingStatus;
    private String fare;
    private ExactLocation pickupLocation;
    private ExactLocation dropoffLocation;
    private Date startTime;
    private Date endTime;
    private String otp;
    private String totalTimeTaken;
}
