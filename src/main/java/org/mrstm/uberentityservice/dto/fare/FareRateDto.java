package org.mrstm.uberentityservice.dto.fare;

import lombok.*;
import org.mrstm.uberentityservice.models.CarType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class FareRateDto {
    private String carType;
    private double baseFare;
    private double perKmRate;
    private double perMinRate;
    private double minFare;
    private boolean active;
}
