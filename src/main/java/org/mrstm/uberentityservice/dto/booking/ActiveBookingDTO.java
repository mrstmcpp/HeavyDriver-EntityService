package org.mrstm.uberentityservice.dto.booking;


import lombok.*;
import org.mrstm.uberentityservice.models.BookingStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ActiveBookingDTO {
    private String bookingId;
    private BookingStatus bookingStatus;
}
