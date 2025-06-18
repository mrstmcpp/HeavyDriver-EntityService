package org.mrstm.uberentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "booking_review")
@PrimaryKeyJoinColumn(name = "id")
public class BookingReview extends Review{
    @OneToOne
    @JoinColumn(name = "booking_id" , nullable = false , unique = true)
    private Booking booking;
}
