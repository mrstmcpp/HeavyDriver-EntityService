package org.mrstm.uberentityservice.dto.fare;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CalculatedFareDTO {
    private double distance;
    private double duration;
    private double fare;
}
