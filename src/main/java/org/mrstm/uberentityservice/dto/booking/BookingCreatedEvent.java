package org.mrstm.uberentityservice.dto.booking;

import lombok.*;
import org.mrstm.uberentityservice.models.CarType;
import org.mrstm.uberentityservice.models.ExactLocation;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BookingCreatedEvent {
    private String bookingId;
    private String passengerId;
    private CarType carType;
    private ExactLocation pickupLocation;
    private ExactLocation dropLocation;
}
