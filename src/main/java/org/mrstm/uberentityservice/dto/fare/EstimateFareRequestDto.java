package org.mrstm.uberentityservice.dto.fare;


import lombok.*;
import org.mrstm.uberentityservice.models.ExactLocation;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class EstimateFareRequestDto {
    private ExactLocation startLocation;
    private ExactLocation endLocation;
    private String carType;
}
