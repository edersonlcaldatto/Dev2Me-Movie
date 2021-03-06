package com.animati.movies.controller.data.request;

import com.animati.movies.model.Movie;
import com.animati.movies.model.MovieType;

import javax.validation.constraints.NotEmpty;

public class MoviePersistDto {

    @NotEmpty
    private String name;
    private MovieType movieType;
    private String language;
    private String list;
    private String synopsis;
    private String trailer;
    private String banner;
    private String gender;


    public Movie convert(long movieId){
        Movie movie = new Movie(movieId,  this.name, this.getMovieType(),
                this.getLanguage(), this.getList(), this.getSynopsis(),
                this.getTrailer(), this.getBanner(),this.getGender());
        return movie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MovieType getMovieType() {
        return movieType;
    }

    public void setMovieType(MovieType movieType) {
        this.movieType = movieType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }

    public String getBanner() {
        return banner;
    }

    public void setBanner(String banner) {
        this.banner = banner;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
