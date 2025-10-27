package org.mrstm.uberentityservice.dto.booking;


import lombok.*;
import org.mrstm.uberentityservice.models.BookingStatus;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ConfirmedNotificationToPassengerDto {
    private String bookingId;
    private BookingStatus bookingStatus;
    private String driverId;
    private String fullName;
    private String passengerId;
}
