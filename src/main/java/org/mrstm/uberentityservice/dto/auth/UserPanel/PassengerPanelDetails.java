package org.mrstm.uberentityservice.dto.auth.UserPanel;


import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
public class PassengerPanelDetails extends UserPanelBase {
    private String dummy;
}
