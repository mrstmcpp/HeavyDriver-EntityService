package org.mrstm.uberentityservice.dto.auth;


import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerSignUpRequestDTO {
    private String email;
    private String password;
    private String phoneNumber;
    private String name;
}
