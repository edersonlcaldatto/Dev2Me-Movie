package com.animati.movies.service;

import com.animati.movies.model.Movie;

import java.util.List;

public interface MovieService {

    Movie create(Movie movie);

    Movie getOne(Long movieId);

    List<Movie> findAll();

    void delete(Long movieId);

    Movie update(Movie movie);
}
