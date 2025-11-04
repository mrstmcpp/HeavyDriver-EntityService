package org.mrstm.uberentityservice.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverDocument extends BaseModel {
    @Enumerated(value = EnumType.STRING)
    private DocumentType documentType;

    @Enumerated(value = EnumType.STRING)
    private VerificationStatus verificationStatus;

    private String documentNumber;
    private String documentUrl;

    private String verifiedBy;

    @ManyToOne
    @JoinColumn(name = "driver_verification_id" , nullable = false)
    private DriverVerification driverVerification;
}
