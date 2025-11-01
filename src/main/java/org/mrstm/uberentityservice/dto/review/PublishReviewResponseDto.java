package org.mrstm.uberentityservice.dto.review;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublishReviewResponseDto {
    private String reviewId;
    private String content;
    private String bookingId;
    private Double rating;

}
