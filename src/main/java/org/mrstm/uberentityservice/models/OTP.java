package org.mrstm.uberentityservice.models;


import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.*;

import java.util.Random;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OTP extends BaseModel {
    private String code;

    @OneToOne(mappedBy = "otp")   // booking owns the relationship
    private Booking booking;


    public static OTP make(Booking booking) {
        Random random = new Random();
        Integer x = random.nextInt(9000) + 1000; // ensures 4 digits
        return OTP.builder()
                .code(x.toString())
                .booking(booking)  // set the booking here
                .build();
    }

}
