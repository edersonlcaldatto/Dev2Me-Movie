package com.animati.movies.controller.data.response;

public class MovieResponseDto {

    private Long Id;
    private String name;

    @Deprecated
    public MovieResponseDto() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
