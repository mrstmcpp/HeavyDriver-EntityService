package org.mrstm.uberentityservice.dto.driver.DriverPanel;


import lombok.*;
import org.mrstm.uberentityservice.models.DocumentType;
import org.mrstm.uberentityservice.models.VerificationStatus;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddDocumentResponseDto {
    private String message;
    private DocumentType documentType;
    private String fileUrl;
    private VerificationStatus status;
}
