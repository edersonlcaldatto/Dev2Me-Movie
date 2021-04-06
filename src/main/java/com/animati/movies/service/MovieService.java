package com.animati.movies.service;

import com.animati.movies.model.Movie;

public interface MovieService {

    Movie create(Movie movie);

    Movie getOne(Long movieId);
}
