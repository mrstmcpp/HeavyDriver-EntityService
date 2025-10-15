package org.mrstm.uberentityservice.dto.auth;


import lombok.*;
import org.mrstm.uberentityservice.models.Role;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthRequestDto {
    private Role role;
    private String email;
    private String password;
}
