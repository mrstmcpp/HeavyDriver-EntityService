package org.mrstm.uberentityservice.dto.review;

import lombok.*;
import org.mrstm.uberentityservice.dto.driver.BookingDTO;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ReviewByUserResponseDto {
    private List<PublishReviewResponseDto> reviewList;
    private int currentPage;
    private int totalPages;
    private long totalItems;
}
