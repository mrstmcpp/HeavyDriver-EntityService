package org.mrstm.uberentityservice.dto.booking;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RideResponseByDriver {
    private boolean response;
    private String bookingId;
    private String driverId;
    private String passengerId;
}
