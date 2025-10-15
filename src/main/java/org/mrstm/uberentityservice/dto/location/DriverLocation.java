package org.mrstm.uberentityservice.dto.location;

import jakarta.validation.constraints.NotNull;
import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverLocation {
    @NotNull
    private String driverId;
    @NotNull
    private Double latitude;
    @NotNull
    private Double longitude;
}
