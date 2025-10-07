package org.mrstm.uberentityservice.dto.booking;

import lombok.*;


@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class BookingCreatedEvent {
    private String bookingId;
    private String passengerId;
    private double latitude;
    private double longitude;
}
