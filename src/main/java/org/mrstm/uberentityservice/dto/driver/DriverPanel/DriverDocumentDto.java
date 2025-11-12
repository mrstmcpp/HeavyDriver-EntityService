package org.mrstm.uberentityservice.dto.driver.DriverPanel;


import lombok.*;
import org.mrstm.uberentityservice.models.DocumentType;
import org.mrstm.uberentityservice.models.VerificationStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverDocumentDto {
    private DocumentType documentType;
    private VerificationStatus verificationStatus;
    private String documentUrl;
    private String verifiedBy;
}
