package org.mrstm.uberentityservice.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import lombok.*;
import lombok.experimental.SuperBuilder;


@Entity
@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor

//@EntityListeners(AuditingEntityListener.class) //is a JPA annotation that lets you hook into the lifecycle of an entity—things like when it's created, updated, or deleted—by registering a listener class to respond to those events.
//also need to add @EnableJpaAuditing in entry point of application...
//alternative is to pass date in builder class.
//@Table(name = "ReviewData") //we can give custom name to our table like this.
@Inheritance(strategy = InheritanceType.JOINED)

/*
table per class creates tables for each class, such as different table
for passagner review , driver review as well as bookingreview which is this file
**and alll tables contains id , content , rating , createdat , updatedat..
which shows data redundancy.
 */
/*
Joined -> this will also create 3 tables for us....
bt all three tables will have different content except primary id of the content
no data redundancy...
 */
@Table(name = "review")
public class Review extends BaseModel {

    @Column(nullable = false)
    private String content;

    @DecimalMin(value = "0.01", message = "Rating must be greater than 0.00")
    @DecimalMax(value = "5.00" , message = "Rating must be less than 5.00")
    private Double rating;


//    @OneToOne(cascade = {CascadeType.ALL}) //one booking one review
//    //cascade type to prevent error related to one object should be in db to create another.
//    //ie booking isn't being created without review object prepared in db
//    @JoinColumn(nullable = false)
//    @JsonIgnore
//    private Booking booking;
}
