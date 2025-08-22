package org.mrstm.uberentityservice.models;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "driver_review")
@PrimaryKeyJoinColumn(name = "driver_review_id")
public class DriverReview extends Review{
    @OneToOne
    @JoinColumn(name = "booking_id" , nullable = false , unique = true)
    private Booking booking;
}
