package org.mrstm.uberentityservice.dto.notification;

import lombok.*;
import org.mrstm.uberentityservice.models.BookingStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RideUpdateNotification {
    private String bookingId;
    private BookingStatus bookingStatus;
    private String driverId;
    private String fullName;
}
