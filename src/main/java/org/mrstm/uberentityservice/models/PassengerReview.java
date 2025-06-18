package org.mrstm.uberentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Table(name = "passenger_review")
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@PrimaryKeyJoinColumn(name = "passenger_review_id")
public class PassengerReview extends Review {

    @OneToOne
    @JoinColumn(name = "booking_id" , nullable = false , unique = true)
    private Booking booking;
}
