package org.mrstm.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
public class DriverVerification extends BaseModel {

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "driver_id", nullable = false)
    @JsonIgnore // prevent circular reference when serializing
    private Driver driver;

    @OneToMany(
            mappedBy = "driverVerification",
            cascade = CascadeType.ALL,
            orphanRemoval = true,
            fetch = FetchType.LAZY
    )
    private List<DriverDocument> driverDocumentList;

    @Temporal(TemporalType.TIMESTAMP)
    private Date verifiedAt;

    private String remarks;
}
