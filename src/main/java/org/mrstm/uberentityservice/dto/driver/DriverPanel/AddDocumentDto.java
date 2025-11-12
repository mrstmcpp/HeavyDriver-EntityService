package org.mrstm.uberentityservice.dto.driver.DriverPanel;

import lombok.*;
import org.mrstm.uberentityservice.models.DocumentType;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AddDocumentDto {
    private DocumentType documentType;
    private String fileUrl;
}
