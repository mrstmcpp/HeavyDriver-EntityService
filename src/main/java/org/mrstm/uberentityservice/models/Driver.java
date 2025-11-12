package org.mrstm.uberentityservice.models;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Driver extends BaseModel {
    @Column(unique = true , nullable = false)
    private String fullName;

    @Column(unique = true , nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column (unique = true , nullable = false)
    private String phoneNumber;

    @Column(unique = true , nullable = true)
    private String licenseNumber;

    @Column(unique = true , nullable = false)
    private String aadharCardNumber;

    @Builder.Default
    @OneToMany(mappedBy = "driver" , fetch = FetchType.LAZY)
    @Fetch(FetchMode.SUBSELECT)
    @JsonIgnore
    private List<Booking> bookings = new ArrayList<>();

    @Enumerated(value = EnumType.STRING)
    private DriverApprovalStatus driverApprovalStatus;

    @OneToOne
    private ExactLocation lastKnownLocation;

    @OneToOne
    private ExactLocation homeLocation;

    private String activeCity;

    /**
     * Better to store rating of driver nd update it periodically
     * instead of calculating each time.
     */
    @DecimalMin(value = "0.00", message = "Rating must be greater than 0.00")
    @DecimalMax(value = "5.00" , message = "Rating must be less than 5.00")
    private double rating;


    @OneToOne(mappedBy = "driver" , cascade = CascadeType.ALL)
    private Car car;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "active_booking_id")
    @JsonIgnore
    private Booking activeBooking;


}
