package org.mrstm.uberentityservice.dto.booking;

import lombok.*;
import org.mrstm.uberentityservice.dto.location.DriverLocation;
import org.mrstm.uberentityservice.models.ExactLocation;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class NearbyDriverEvent {
    private String bookingId;
    private String passengerId;
    private ExactLocation pickupLocation;
    private ExactLocation dropLocation;
    private List<DriverLocation> driverLocationList;
}
