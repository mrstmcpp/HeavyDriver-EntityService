package org.mrstm.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import java.util.ArrayList;
import java.util.List;

@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Driver extends BaseModel {
    private String fullName;

    @Column(unique = true , nullable = false)
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
    @DecimalMin(value = "0.01", message = "Rating must be greater than 0.00")
    @DecimalMax(value = "5.00" , message = "Rating must be less than 5.00")
    private double rating;


    @OneToOne(mappedBy = "driver" , cascade = CascadeType.ALL)
    private Car car;

    private Boolean isAvailable;


}
