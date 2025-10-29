package org.mrstm.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

//spring manages these indexes by itself. don't need to mention it here.
//@Table(indexes = {
//        @Index(columnList = "driver_id")
//        }) //to optimize query we are using indexes.
public class Booking extends BaseModel {

    @Enumerated(value = EnumType.STRING) //tells spring that it is an enum.
    private BookingStatus bookingStatus;

    @Temporal(TemporalType.TIMESTAMP)
    private Date startTime;
    @Temporal(TemporalType.TIMESTAMP)
    private Date endTime;
    private Long totalDistance;

    @ManyToOne
    @JsonIgnore
    private Driver driver;

    @ManyToOne(fetch = FetchType.LAZY)
    private Passenger passenger;

    @OneToOne(cascade =  CascadeType.ALL)
    private ExactLocation startLocation;
    @OneToOne(cascade =  CascadeType.ALL)
    private ExactLocation endLocation;

    @OneToOne(mappedBy = "booking")
    private PassengerReview passengerReview;

    @OneToOne(mappedBy = "booking")
    private BookingReview bookingReview;

    @OneToOne(mappedBy = "booking")
    private DriverReview driverReview;

    @OneToOne
    @JoinColumn(name = "otp_id")   // foreign key lives in booking table
    private OTP otp;

    @OneToOne(mappedBy = "booking", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private Fare fareHistory;

}
