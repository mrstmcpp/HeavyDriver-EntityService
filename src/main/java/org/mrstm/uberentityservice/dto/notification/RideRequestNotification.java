package org.mrstm.uberentityservice.dto.notification;

import lombok.*;
import org.mrstm.uberentityservice.models.ExactLocation;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RideRequestNotification {
    private String bookingId;
    private String passengerId;
    private ExactLocation pickupLocation;
    private ExactLocation dropLocation;
}
