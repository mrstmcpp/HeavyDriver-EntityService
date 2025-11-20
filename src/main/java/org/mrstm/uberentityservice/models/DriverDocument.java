package org.mrstm.uberentityservice.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
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

    private String fileName;
    private String documentUrl;

    private String verifiedBy;

    @ManyToOne
    @JoinColumn(name = "driver_verification_id" , nullable = false)
    @JsonIgnore // prevent circular reference
    private DriverVerification driverVerification;
}
