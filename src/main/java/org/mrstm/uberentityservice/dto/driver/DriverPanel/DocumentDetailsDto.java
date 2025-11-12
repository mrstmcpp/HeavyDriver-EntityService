package org.mrstm.uberentityservice.dto.driver.DriverPanel;

import lombok.*;
import org.mrstm.uberentityservice.models.DriverDocument;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DocumentDetailsDto {
    private List<DriverDocument> documentList;
}
