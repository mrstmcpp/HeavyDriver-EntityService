package org.mrstm.uberentityservice.dto.passenger;


import lombok.*;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingsByPassengerResponseDto {
    private String passengerId;
    private List<PassengerBookingDTO> bookingList;
    private int currentPage;
    private int totalPages;
    private long totalItems;
};
