package org.mrstm.uberentityservice.dto.auth;


import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class ValidUserDto {
    private String role;
    private String name;
    private boolean loggedIn;
    private String user;
    private Long userId;
}
