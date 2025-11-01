package org.mrstm.uberentityservice.dto.googlemaps;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DistanceDuration {
    private String startAddress;
    private String endAddress;
    private double distance;
    private double duration;
    private double durationInTraffic;
}
