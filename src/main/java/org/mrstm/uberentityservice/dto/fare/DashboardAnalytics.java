package org.mrstm.uberentityservice.dto.fare;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DashboardAnalytics {


        private double totalEarnings;
        private double thisMonthEarnings;
        private double pendingEarnings;
        private double withdrawnEarnings;

}
