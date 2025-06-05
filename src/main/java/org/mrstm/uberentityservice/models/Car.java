package org.mrstm.uberentityservice.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car extends BaseModel{
    private String brand;
    private String model;

    @Column(unique=true , nullable=false)
    private String plateNumber;

    @ManyToOne
    private Color color;

    @OneToOne
    private Driver driver;

    @Enumerated(value = EnumType.STRING)
    private CarType carType;
}
