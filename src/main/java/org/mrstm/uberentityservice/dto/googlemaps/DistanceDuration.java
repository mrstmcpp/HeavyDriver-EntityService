package org.mrstm.uberentityservice.dto.googlemaps;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistanceDuration {
    private double distance;
    private double duration;
    private double durationInTraffic;
}
