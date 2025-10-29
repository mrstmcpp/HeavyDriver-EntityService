package org.mrstm.uberentityservice.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "fare_rates")
public class FareRate extends BaseModel{
    private CarType carType;
    private double baseFare;
    private double perKmRate;
    private double perMinRate;
    private double minFare;
    private boolean active;
}
