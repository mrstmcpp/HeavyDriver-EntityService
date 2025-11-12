package org.mrstm.uberentityservice.dto.driver.DriverPanel;


import lombok.*;
import org.mrstm.uberentityservice.models.CarType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class VerificationDetailsDto {
    private String name;
    private String email;
    private String phoneNumber;
    private String carBrand;
    private String carModel;
    private String plateNumber;
    private CarType carType;
}
