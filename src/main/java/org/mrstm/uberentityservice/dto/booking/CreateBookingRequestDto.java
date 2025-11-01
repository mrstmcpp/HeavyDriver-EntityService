package org.mrstm.uberentityservice.dto.booking;

import lombok.*;
import org.mrstm.uberentityservice.models.ExactLocation;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateBookingRequestDto {
    private Long passengerId;
    private String carType;
    private ExactLocation startLocation;
    private ExactLocation endLocation;
}

