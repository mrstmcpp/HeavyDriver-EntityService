package org.mrstm.uberentityservice.dto.auth.UserPanel;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Data
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class DriverPanelDetails extends UserPanelBase {
    private String licenseNumber;
    private String driverApprovalStatus;
    private String aadharCardNumber;
    private String activeBooking;
    private String activeCity;
    private Double rating;
}

