package org.mrstm.uberentityservice.dto.auth;

import lombok.*;
import org.mrstm.uberentityservice.models.Driver;

import java.util.Date;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class DriverSignUpResponseDto {
    private Long id;
    private String name;
    private String phoneNumber;
    private String email;
    private String password;
    private Date createdAt;

    public static DriverSignUpResponseDto fromDriver(Driver driver) {
        DriverSignUpResponseDto dto = DriverSignUpResponseDto.builder()
                .id(driver.getId())
                .createdAt(driver.getCreatedAt())
                .email(driver.getEmail())
                .password(driver.getPassword())
                .phoneNumber(driver.getPhoneNumber())
                .name(driver.getFullName())
                .build();
        return dto;
    }
}
