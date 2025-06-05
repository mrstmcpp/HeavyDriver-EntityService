package org.mrstm.uberentityservice.models;


import jakarta.persistence.Entity;
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

    private String sentToNumber;

    public static OTP make(String phoneNumber){
        Random random = new Random();
        Integer x = random.nextInt(9999) + 1000;
        return OTP.builder()
                .code(x.toString())
                .sentToNumber(phoneNumber)
                .build();
    }
}
