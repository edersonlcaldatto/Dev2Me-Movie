package com.animati.movies.model;

import com.sun.istack.NotNull;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name;
    @Enumerated(EnumType.STRING)
    private MovieType movieType;
    private String language;
    private String list;
    private String synopsis;
    private String trailer;
    private String banner;
    private String gender;

    @Deprecated
    public Movie() {
    }

    public Movie(@NotNull Long id, @NotNull String name, @NotNull  MovieType movieType, @NotNull String language,
            String list,
            String synopsis,
            String trailer,
            String banner, String gender) {
        this.id = Objects.requireNonNull(id,"Id é Obrigatório");
        this.name = Objects.requireNonNull(name);
        this.movieType = Objects.requireNonNull(movieType);
        this.language = Objects.requireNonNull(language);
        this.list = list;
        this.synopsis = synopsis;
        this.trailer = trailer;
        this.banner = banner;
        this.gender = gender;
    }

    public Movie(@NotNull String name, @NotNull  MovieType movieType, @NotNull String language, String list,
            String synopsis,
            String trailer,
            String banner, String gender) {
        this.name = Objects.requireNonNull(name);
        this.movieType = Objects.requireNonNull(movieType);
        this.language = Objects.requireNonNull(language);
        this.list = list;
        this.synopsis = synopsis;
        this.trailer = trailer;
        this.banner = banner;
        this.gender = gender;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Movie movie = (Movie) o;
        return id.equals(movie.id) && name.equals(movie.name);
    }

    public Long getId() {
        return id;
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
