package org.mrstm.uberentityservice.models;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "passenger_review")
@PrimaryKeyJoinColumn(name = "passenger_review_id")
public class PassengerReview extends Review {

    @OneToOne
    @JoinColumn(name = "booking_id" , nullable = false , unique = true)
    private Booking booking;
}
