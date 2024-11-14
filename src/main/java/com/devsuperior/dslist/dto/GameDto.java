package com.devsuperior.dslist.dto;

import com.devsuperior.dslist.entities.Game;
import jakarta.persistence.Column;

public class GameDto {

    private Long id;
    private Integer year;
    private String title;
    private String imgUrl;
    private String shortDescription;

    public GameDto() {
    }

    public GameDto(Game entity) {
        id = entity.getId();
        year = entity.getYear();
        title = entity.getTitle();
        imgUrl = entity.getImgUrl();
        shortDescription = entity.getShortDescription();
    }

    public Long getId() {
        return id;
    }

    public Integer getYear() {
        return year;
    }

    public String getTitle() {
        return title;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public String getShortDescription() {
        return shortDescription;
    }
}
