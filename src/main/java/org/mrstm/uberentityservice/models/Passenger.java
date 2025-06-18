package org.mrstm.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Passenger extends BaseModel {

    //copying same model from review service... it is copying same code which is not good
    //but it is used in industry.
    @Column(nullable = false)
    private String passanger_name;

    @Column(unique = true , nullable = false)
    private String phoneNumber;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @OneToMany(mappedBy = "passenger")
    @JsonIgnore
    private List<Booking> bookings = new ArrayList<>();

    @OneToOne
    private Booking activeBooking;

    @DecimalMin(value = "0.01", message = "Rating must be greater than 0.00")
    @DecimalMax(value = "5.00" , message = "Rating must be less than 5.00")
    private Double rating;


    @OneToOne
    private ExactLocation lastKnownLocation;

    @OneToOne
    private ExactLocation homeLocation;
}
