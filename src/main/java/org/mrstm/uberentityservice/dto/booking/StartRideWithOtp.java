package org.mrstm.uberentityservice.dto.booking;


import lombok.*;
import org.mrstm.uberentityservice.models.OTP;

@Setter
@Getter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StartRideWithOtp {
    private OTP otp;
}
