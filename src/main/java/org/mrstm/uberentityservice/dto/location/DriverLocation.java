package org.mrstm.uberentityservice.dto.location;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverLocation {
    String driverId;
    Double latitude;
    Double longitude;
}
