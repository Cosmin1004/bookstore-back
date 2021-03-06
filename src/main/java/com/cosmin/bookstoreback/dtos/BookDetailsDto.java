package com.cosmin.bookstoreback.dtos;

import com.cosmin.bookstoreback.models.Availability;
import com.cosmin.bookstoreback.models.Language;
import lombok.Getter;
import lombok.Setter;

/**
 * DTO for responses (ex: get book)
 */
@Getter
@Setter
public class BookDetailsDto {

    private Long id;
    private String title;
    private String description;
    private Integer publicationYear;
    private Integer numberOfPages;
    private Language language;
    private Double cost;
    private String imageURL;
    private Availability availability;

}
