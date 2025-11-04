package org.mrstm.uberentityservice.dto.fare;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DailyEarningsDto {
    private Date date;
    private double earnings;
}
