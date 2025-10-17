package org.mrstm.uberentityservice.dto.driver;


import lombok.*;
import org.mrstm.uberentityservice.models.Booking;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BookingsByDriverResponseDto {
    private String driverId;
    private List<BookingDTO> bookingList;
    private int currentPage;
    private int totalPages;
    private long totalItems;
}
