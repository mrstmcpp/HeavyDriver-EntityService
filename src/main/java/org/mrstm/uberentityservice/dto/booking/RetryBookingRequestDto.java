package org.mrstm.uberentityservice.dto.booking;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RetryBookingRequestDto {
    private String passengerId;
}
