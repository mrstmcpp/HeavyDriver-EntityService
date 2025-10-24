package org.mrstm.uberentityservice.models;


import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "idempotency_records",
        indexes = {
        @Index(columnList = "idempotencyKey"),
                @Index(columnList = "passengerId")
        }
)
public class IdempotencyRecord extends BaseModel {
    private Long passengerId;

    @Column(nullable = false , unique = true)
    private String idempotencyKey;

    @Lob
    private String requestHash;

    @Lob
    private String responseData;

    @OneToOne
    @JoinColumn(name = "booking_id")
    private Booking booking;

}
