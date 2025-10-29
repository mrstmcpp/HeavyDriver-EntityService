package org.mrstm.uberentityservice.dto.auth.UserPanel;

import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
public class UserPanelBase {
    private boolean loggedIn;
    private String role;
    private Long userId;
    private String name;
    private String email;
    private String phoneNumber;
}

