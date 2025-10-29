package org.mrstm.uberentityservice.models;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fare")
public class Fare extends BaseModel{

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "booking_id" , nullable = false , unique = true)
    private Booking booking;

    private CarType carType;
    private double distance;
    private double duration;
    private double surge;
    private double discount;
    private double finalFare;

}
