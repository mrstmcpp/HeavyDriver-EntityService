package org.mrstm.uberentityservice.dto.review;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PublishReviewRequestDto {
    private String content;
    private Double rating;
}
