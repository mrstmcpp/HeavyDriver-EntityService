package org.mrstm.uberentityservice.dto.driver.DriverPanel;

import lombok.*;
import org.mrstm.uberentityservice.models.DriverDocument;

import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class DriverDocumentResponseDto {

    private Long driverId;
    private List<DriverDocument> documentList;
    private String remarks;
    private Date verifiedAt;

}
