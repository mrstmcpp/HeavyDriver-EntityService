package org.mrstm.uberentityservice.dto.driver;

import lombok.*;
import org.mrstm.uberentityservice.models.BookingStatus;

import java.time.LocalDateTime;
import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BookingDTO {
    private Long id;
    private BookingStatus status;
    private Double fare;
    private Date createdAt;
    private Long driverId;
}
