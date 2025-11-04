package org.mrstm.uberentityservice.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DriverVerification extends BaseModel {

    @OneToOne
    @JoinColumn(name = "driver_id" , nullable = false)
    private Driver driver;

    @OneToMany(mappedBy = "driverVerification" , cascade = CascadeType.ALL)
    private List<DriverDocument> driverDocumentList;

    private Date verifiedAt;

    private String remarks;
}
